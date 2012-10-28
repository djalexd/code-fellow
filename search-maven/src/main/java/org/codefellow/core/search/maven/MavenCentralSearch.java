package org.codefellow.core.search.maven;

import org.apache.commons.io.IOUtils;
import org.codefellow.core.SearchResult;
import org.codefellow.core.Tag;
import org.codefellow.core.search.ListableSearcheable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: diseropi
 * Date: 10/27/12
 * Time: 11:14 PM
 * To change this template use File | Settings | File Templates.
 */
public class MavenCentralSearch implements ListableSearcheable {

    private final Logger logger = LoggerFactory.getLogger(MavenCentralSearch.class);


    public static final String MAVEN_CENTRAL_SEARCH_URI_PRE = "http://search.maven.org/solrsearch/select?q=";
    public static final String MAVEN_CENTRAL_SEARCH_URI_POST = "&rows=20&wt=json";

    private final String serviceName;

    public MavenCentralSearch(String serviceName) {
        this.serviceName = serviceName;
    }

    @Override
    public String getServiceName() {
        return this.serviceName;
    }

    @Override
    public List<SearchResult> search(List<Tag> tags) {
        //create search string
        String searchString = buildSearchString(tags);
        URL searchURI = buildSearchURL(escape(searchString));
        JSONObject jsonResponse = performSearch(searchURI);
        List<SearchResult> resultList = buildSearchResultList(jsonResponse);
        return resultList;
    }

    private List<SearchResult> buildSearchResultList(JSONObject jsonResponse) {
        List<SearchResult> searchResultList = new ArrayList<SearchResult>();

        try {
            JSONArray responseArray = jsonResponse.getJSONObject("response").getJSONArray("docs");

            for (int i = 0; i < jsonResponse.length(); i++) {
                JSONObject jsonObject = responseArray.getJSONObject(i);
                String artifactId = jsonObject.getString("a");
                String groupId = jsonObject.getString("g");
                String version = jsonObject.getString("latestVersion");
                String updatedTimestamp = jsonObject.getString("timestamp");
                SearchResult searchResult = new MavenCentralSearchResult(artifactId, groupId, version, updatedTimestamp);
                searchResultList.add(searchResult);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return searchResultList;
    }

    /**
     * builds the search url from the basea search address and the escaped query string
     *
     * @param searchString
     * @return
     */
    private URL buildSearchURL(String searchString) {
        try {
            URL url = new URL(MAVEN_CENTRAL_SEARCH_URI_PRE + searchString + MAVEN_CENTRAL_SEARCH_URI_POST);
            return url;
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }

    private String escape(String searchString) {
        String result = searchString;
        try {
            result = URLEncoder.encode(searchString, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            logger.error("Error escaping string: " + searchString, e);
        }
        return result;
    }

    /**
     * performs a search into Maven Central with the given search string and converts the response into a json object
     *
     * @param url the URL locating the search; USING GET by default
     * @return
     */
    private JSONObject performSearch(URL url) {
        try {
            String myString = IOUtils.toString(url);

            JSONObject jsonObject = new JSONObject(myString);
            return jsonObject;
        } catch (JSONException e) {
            throw new RuntimeException("Error creating json onbect from response stream", e);
        } catch (IOException e) {
            throw new RuntimeException("Error getting the input stream", e);
        }

    }

    /**
     * creates a search string by concatenating tags
     *
     * @param tags
     * @return the search string
     */
    private String buildSearchString(List<Tag> tags) {
        StringBuilder stringBuilder = new StringBuilder();
        for (Tag tag : tags) {
            stringBuilder.append(tag.getValue()).append(" ");
        }
        return stringBuilder.toString().trim(); //remove the trailing space
    }


/*
    public static void main(String[] args) {
        System.out.println("start...");
        List<SearchResult> sr = new MavenCentralSearch().search(Arrays.asList(new Tag[]{new TagImpl()}));
        System.out.println();
    }

    static class TagImpl implements Tag {
        @Override
        public String getOriginalValue() {
            return null;  //To change body of implemented methods use File | Settings | File Templates.
        }

        @Override
        public String getValue() {
            return "spring core";  //To change body of implemented methods use File | Settings | File Templates.
        }
    }

*/
}
