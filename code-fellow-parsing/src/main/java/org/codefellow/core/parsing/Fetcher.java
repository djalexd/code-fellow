package org.codefellow.core.parsing;

/**
 * Abstracts the reading of html page
 *
 * @author abserban
 * @author Alex Dobjanschi
 * @since 10/27/12 8:49 PM
 */
public interface Fetcher {

    /**
     * Reads the content of page based on the specified keywords
     *
     * @param keyword used for search for a page
     * @return the body of a html page
     * @throws FetcherException thrown if any IO exceptions occur.
     */
    String getPage(String keyword) throws FetcherException;
}
