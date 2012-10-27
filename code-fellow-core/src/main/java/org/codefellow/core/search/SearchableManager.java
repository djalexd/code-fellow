package org.codefellow.core.search;

import com.google.common.base.Function;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import org.codefellow.core.ListTagParser;
import org.codefellow.core.SearchResult;
import org.codefellow.core.Tag;

import java.util.List;
import java.util.Map;

/**
 * Serves as a wrapper for multiple {@link Searchable search platfoms}. Should be
 * used for aggregated searches.
 *
 * @author Alex Dobjanschi
 * @since 10/27/12 5:25 PM
 */
public class SearchableManager implements ISearchableManager {

    private static final String NO_SEARCHABLE_NAME = "No Searchable found for specified name %s";

    private final Map<String, ListableSearcheable> searchableMap;
    private final QueryParser queryParser;
    private final ListTagParser listTagParser;

    public SearchableManager(List<ListableSearcheable> searcheables, QueryParser queryParser, ListTagParser listTagParser) {
        this.searchableMap = ImmutableMap.copyOf(
                Maps.uniqueIndex(searcheables, new Function<ListableSearcheable, String>() {
                    @Override
                    public String apply(@javax.annotation.Nullable ListableSearcheable input) {
                        return input.getServiceName();
                    }
                }));
        this.queryParser = queryParser;
        this.listTagParser = listTagParser;
    }

    @Override
    public List<SearchResult> search(String query, String searchableName) {
        // Parse the input query to a list of tags.
        final List<String> rawTags = queryParser.parseQuery(query);

        // Generate a list of parsed tags.
        final List<Tag> parsedTags = listTagParser.parseRawTag(rawTags);

        final Searchable searchable = getSearchableByName(searchableName);
        return searchable.search(parsedTags);
    }

    private Searchable getSearchableByName(String searchableName) {
        if (!searchableMap.containsKey(searchableName)) {
            throw new IllegalArgumentException(String.format(NO_SEARCHABLE_NAME, searchableName));
        }

        return searchableMap.get(searchableName);
    }
}
