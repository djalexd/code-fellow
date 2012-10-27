package org.codefellow.core.search;

import java.util.List;

/**
 * @author Alex Dobjanschi
 * @since 10/27/12 5:51 PM
 */
public interface QueryParser {
    /**
     * Parses the given query to a list of raw tags.
     *
     * @param query
     * @return
     */
    List<String> parseQuery(String query);
}
