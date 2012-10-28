package org.codefellow.core.search;

import org.codefellow.core.SearchResult;
import org.codefellow.core.Tag;
import org.codefellow.core.parsing.Fetcher;
import org.codefellow.core.parsing.Parser;
import org.codefellow.core.parsing.TagKeywordJoiner;

import javax.annotation.Nonnull;
import java.util.List;

/**
 * The default implementation of a {@link Searchable}. It uses other components to
 * delegate tasks. However, everything is blocking.
 *
 * @author Alex Dobjanschi
 * @since 10/27/12 9:01 PM
 */
public class DefaultListableSearchable extends AbstractListableSearchable {

    private final Fetcher fetcher;
    private final Parser parser;
    private final TagKeywordJoiner joiner; // TODO needs to be moved to a fetcher implementation. Fetcher interface needs to be changed (0.3)

    public DefaultListableSearchable(String serviceName, TagKeywordJoiner joiner, Fetcher fetcher, Parser parser) {
        super(serviceName);
        this.fetcher = fetcher;
        this.parser = parser;
        this.joiner = joiner;
    }

    @Override
    protected List<SearchResult> doSearch(@Nonnull List<Tag> tags) {
        // Use the joiner to construct a unified representation of the
        // specified list of tags.
        final String keyword = this.joiner.joinTags(tags);

        // Retrieve the html page.
        final String page = this.fetcher.getPage(keyword);

        return this.parser.parse(page);
    }
}
