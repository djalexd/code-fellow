package org.codefellow.webapp.endpoints;

import org.codefellow.core.SearchResult;
import org.codefellow.core.search.ISearchableManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import java.util.List;

/**
 * @author Alex Dobjanschi
 * @since 10/27/12 4:34 PM
 */
@Component // Used for @Autowire and Spring-servlet filter.
@Path("search")
@Produces({MediaType.APPLICATION_JSON})
public class Search {

    @Autowired
    ISearchableManager manager;

    @GET
    public List<SearchResult> doSearch(@QueryParam("query") final String query) {
        return manager.search(query, "github.com");
    }
}
