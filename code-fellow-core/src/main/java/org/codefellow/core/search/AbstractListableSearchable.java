package org.codefellow.core.search;

import com.google.common.base.Preconditions;
import com.google.common.collect.Lists;
import org.codefellow.core.SearchResult;
import org.codefellow.core.Tag;

import java.util.List;

/**
 * Base class for {@link Searchable} implementation. Does provide a
 * serviceName, along with a check for {@link #search(java.util.List)} when
 * the list is <code>null</code> or empty.
 *
 * @author Alex Dobjanschi
 * @since 10/27/12 8:40 PM
 */
public abstract class AbstractListableSearchable implements ListableSearcheable {

    private final String serviceName;
    protected AbstractListableSearchable(String serviceName) {
        this.serviceName = Preconditions.checkNotNull(serviceName);
    }

    @Override
    public final String getServiceName() {
        return this.serviceName;
    }

    @Override
    public final List<SearchResult> search(List<Tag> tags) {
        if (tags == null || tags.isEmpty())
            return Lists.newArrayList();

        return this.doSearch(tags);
    }

    /**
     * Delegate the search to subclasses.
     *
     * @param tags
     * @return
     */
    protected abstract List<SearchResult> doSearch(@com.sun.istack.internal.NotNull List<Tag> tags);
}
