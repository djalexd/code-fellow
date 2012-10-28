package org.codefellow.core.search.infoq;

import org.codefellow.core.SearchResult;

/**
 * Created with IntelliJ IDEA.
 * User: diseropi
 * Date: 10/28/12
 * Time: 3:49 AM
 * To change this template use File | Settings | File Templates.
 */
public class InfoQSearchResult implements SearchResult {
    private String title;
    private String body;
    private String link;

    public InfoQSearchResult(String title, String body, String link) {
        this.title = title;
        this.body=body;
        this.link=link;

    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public String getBody() {
        return body;
    }

    @Override
    public String getUri() {
        return link;
    }
}
