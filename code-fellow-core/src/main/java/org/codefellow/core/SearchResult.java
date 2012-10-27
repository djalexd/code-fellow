package org.codefellow.core;

/**
 * @author Alex Dobjanschi
 * @since 10/27/12 3:42 PM
 */
public interface SearchResult {
    /**
     * Title of this search result.
     * @return
     */
    String getTitle();

    /**
     * Description of this search result.
     * @return
     */
    String getBody();

    /**
     * URI when this search result can be found.
     * @return
     */
    String getUri();
}
