package org.codefellow.webapp.endpoints;

import com.google.common.base.Function;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import org.codefellow.core.SearchResult;
import org.codefellow.core.search.IListableSearchableManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.Nullable;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;
import java.util.Map;

/**
 * @author Alex Dobjanschi
 * @since 10/27/12 4:34 PM
 */
@Component // Used for @Autowire and Spring-servlet filter.
@Path("search")
@Produces({MediaType.APPLICATION_JSON})
public class Search {

    private static final Logger LOGGER = LoggerFactory.getLogger(Search.class);

    @Autowired
    IListableSearchableManager manager;

    @GET
    public Map<String, SearchResultMappedByService> doSearch(@QueryParam("query") final String query,
                                                @QueryParam("service") @DefaultValue("*") final String service) {

        if (service.equals("*")) {
            // Use a list to accumulate results.
            final List<SearchResultMappedByService> mappedResults =
                    Lists.newArrayListWithExpectedSize(manager.getAvailableServices().size());

            // Search on all available services.
            for (String oneService : manager.getAvailableServices()) {

                try {
                    List<SearchResult> resultsForAService = manager.search(query, oneService);
                    mappedResults.add(new SearchResultMappedByService(resultsForAService, oneService));
                } catch (Throwable t) {
                    LOGGER.error("Search is not available for service {}", oneService, t);
                    // Don't add anything for the service.
                }

            }

            return Maps.uniqueIndex(mappedResults, new Function<SearchResultMappedByService, String>() {
                @Override
                public String apply(@Nullable SearchResultMappedByService input) {
                    return input.getServiceName();
                }
            });

        } else {
            // Search on a particular service.
            return ImmutableMap.of(service,
                    new SearchResultMappedByService(manager.search(query, service), service));
        }
    }
}
