package org.codefellow.webapp.endpoints;

import org.springframework.stereotype.Component;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * @author Alex Dobjanschi
 * @since 10/27/12 4:34 PM
 */
@Component // Used for @Autowire and Spring-servlet filter.
@Path("search")
@Produces({MediaType.APPLICATION_JSON})
public class Search {

    @GET
    public String doSearch() {
        return "test";
    }
}
