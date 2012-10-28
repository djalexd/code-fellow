package org.codefellow.core.search.infoq;

import org.apache.commons.io.IOUtils;
import org.codefellow.core.SearchResult;
import org.codefellow.core.Tag;
import org.codefellow.core.search.ListableSearcheable;
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
 * Date: 10/28/12
 * Time: 3:49 AM
 * To change this template use File | Settings | File Templates.
 */
public class InfoQSearch implements ListableSearcheable {

    Logger logger = LoggerFactory.getLogger(InfoQSearch.class);

    public static final String INFOQ_SEARCH_URL_PRE = "http://www.infoq.com/search.action?queryString=";
    public static final String INFOQ_SEARCH_URL_POST = "&searchOrder=relevance&search=";

    private String serviceName;

    public InfoQSearch(final String serviceName) {
        this.serviceName = serviceName;
    }

    @Override
    public String getServiceName() {
        return this.serviceName;
    }

    @Override
    public List<SearchResult> search(List<Tag> tags) {
        if (tags == null || tags.size() == 0) {
            return new ArrayList<SearchResult>();
        }
        String keyword = "";

        for (Tag tag : tags) {
            keyword += tag.getValue();
            keyword += " ";
        }

        URL searchURI = buildSearchURL(escape(keyword));
        String page = performSearch(searchURI);

        InfoQParser parser = new InfoQParser();
        return parser.parse(page);

    }

    private String performSearch(URL url) {
        try {
            String myString = IOUtils.toString(url);
            return myString;
        } catch (IOException e) {
            throw new RuntimeException("Error getting the input stream", e);
        }

    }


    /**
     * builds the search url from the basea search address and the escaped query string
     *
     * @param searchString
     * @return
     */
    private URL buildSearchURL(String searchString) {
        try {
            URL url = new URL(INFOQ_SEARCH_URL_PRE + searchString + INFOQ_SEARCH_URL_POST + searchString);
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

}
