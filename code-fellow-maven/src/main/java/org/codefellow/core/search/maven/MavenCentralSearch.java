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

import java.io.IOException;
import java.io.UnsupportedEncodingException;
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
 * The search implementation for MavenCentral site.
 * This class extracts groupId, artifactId, version and timestamp from the response of a search performaed in MavenCentral.
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

    /**
     * Bilds the List of SearchResult objects from the JSON array received as response from search
     * @param jsonResponse
     * @return the search result list
     */
    private List<SearchResult> buildSearchResultList(JSONObject jsonResponse) {
        List<SearchResult> searchResultList = new ArrayList<SearchResult>();

        try {
            JSONArray responseArray = jsonResponse.getJSONObject("response").getJSONArray("docs");
            for (int i = 0; i < jsonResponse.length(); i++) {
                JSONObject jsonObject = responseArray.getJSONObject(i);
                SearchResult searchResult = buildSearchResult(jsonObject);
                searchResultList.add(searchResult);
            }
        } catch (JSONException e) {
            throw new RuntimeException("Error creating the search result list from the json array response", e);
        }
        return searchResultList;
    }

    /**
     * Builds a SearchResult object from the corresponding json object
     * @param jsonObject
     * @return
     */
    private SearchResult buildSearchResult(JSONObject jsonObject) {
        try {
            String artifactId = jsonObject.getString("a");
            String groupId = jsonObject.getString("g");
            String version = jsonObject.getString("latestVersion");
            String updatedTimestamp = jsonObject.getString("timestamp");
            SearchResult searchResult = new MavenCentralSearchResult(artifactId, groupId, version, updatedTimestamp);
            return searchResult;
        } catch (JSONException e) {
            throw new RuntimeException("Failed to create a search result from the json object", e);
        }
    }

    /**
     * builds the search url from the base search address and the escaped query string
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

    /**
     * tryes to escape the search string; if escape is not possible returns the original string
     *
     * @param searchString
     * @return escaped string or the original if escaping failed
     */
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
     * @param url the URL locating the search; using GET by default
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

}
