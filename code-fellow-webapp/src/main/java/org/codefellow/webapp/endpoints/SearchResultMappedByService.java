package org.codefellow.webapp.endpoints;

import org.codefellow.core.SearchResult;

import java.io.Serializable;
import java.util.List;

/**
 * @author Alex Dobjanschi
 * @since 10/27/12 7:23 PM
 */
public class SearchResultMappedByService implements Serializable {

    private final List<SearchResult> searchResults;
    private final String serviceName;

    public SearchResultMappedByService(List<SearchResult> searchResults, String serviceName) {
        this.searchResults = searchResults;
        this.serviceName = serviceName;
    }

    public List<SearchResult> getSearchResults() {
        return searchResults;
    }

    public String getServiceName() {
        return serviceName;
    }
}
