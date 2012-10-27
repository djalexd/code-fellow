package org.codefellow.core.search;

import com.google.common.base.Splitter;
import com.google.common.collect.ImmutableList;

import java.util.List;

/**
 * The default implementation of {@link QueryParser}. Uses a
 * {@link Splitter} that is configured to trim results and
 * omit empty strings.
 *
 * @author Alex Dobjanschi
 * @since 10/27/12 6:07 PM
 */
public class DefaultQueryParser implements QueryParser {

    private final Splitter splitter;
    public DefaultQueryParser(String separator) {
        this.splitter = Splitter.on(separator).trimResults().omitEmptyStrings();
    }

    @Override
    public List<String> parseQuery(String query) {
        return ImmutableList.copyOf(splitter.split(query));
    }
}
