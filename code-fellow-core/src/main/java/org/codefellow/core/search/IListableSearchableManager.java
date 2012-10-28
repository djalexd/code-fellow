package org.codefellow.core.search;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;

/**
 * A searchable manager that exposes the available services.
 * @author Alex Dobjanschi
 * @since 10/27/12 7:26 PM
 */
public interface IListableSearchableManager extends ISearchableManager {

    ImmutableSet<String> getAvailableServices();

}
