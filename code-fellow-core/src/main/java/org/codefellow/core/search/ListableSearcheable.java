package org.codefellow.core.search;

/**
 * @author Alex Dobjanschi
 * @since 10/27/12 5:25 PM
 */
public interface ListableSearcheable extends Searchable {
    /**
     * Returns the name of service where search is performed.
     * Example: github.com
     * @return
     */
    String getServiceName();
}
