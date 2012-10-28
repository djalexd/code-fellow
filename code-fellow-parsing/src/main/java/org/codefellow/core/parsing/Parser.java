package org.codefellow.core.parsing;

import org.codefellow.core.SearchResult;

import java.util.List;

/**
 * @author Alex Dobjanschi
 * @since 10/27/12 8:50 PM
 */
public interface Parser {
    /**
     * Returns a list of search results, based on String input.
     * @param page
     * @return
     */
    List<SearchResult> parse(String page);
}
