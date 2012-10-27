package org.codefellow.core.search;

import org.codefellow.core.SearchResult;

import java.util.List;

/**
 * @author Alex Dobjanschi
 * @since 10/27/12 5:59 PM
 */
public interface ISearchableManager {
    List<SearchResult> search(String query, String searchableName);
}
