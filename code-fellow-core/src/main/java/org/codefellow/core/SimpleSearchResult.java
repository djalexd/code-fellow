package org.codefellow.core;

/**
 * A simple POJO class implementation of {@link SearchResult}. Can be used when no
 * additional data is available (DRY).
 *
 * @author Alex Dobjanschi
 * @since 10/27/12 9:20 PM
 */
public class SimpleSearchResult implements SearchResult {

    private final String title;
    private final String body;
    private final String uri;
    public SimpleSearchResult(String title, String body, String uri) {
        this.title = title;
        this.body = body;
        this.uri = uri;
    }

    @Override
    public String getTitle() {
        return this.title;
    }

    @Override
    public String getBody() {
        return this.body;
    }

    @Override
    public String getUri() {
        return this.uri;
    }
}
