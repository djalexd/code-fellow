package org.codefellow.core.search;

import org.codefellow.core.SearchResult;
import org.codefellow.core.Tag;

import java.util.List;

/**
 *
 *
 * @author Alex Dobjanschi
 * @since 10/27/12 2:58 PM
 */
public interface Searchable {
    /**
     * Search on a specific service for a given list of tags.
     * @param tags
     * @return
     */
    List<SearchResult> search(List<Tag> tags);
}
