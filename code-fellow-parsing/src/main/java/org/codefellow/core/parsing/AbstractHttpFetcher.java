package org.codefellow.core.parsing;

import com.google.common.base.Preconditions;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.net.URI;

/**
 * @author Alex Dobjanschi
 * @since 10/27/12 8:53 PM
 */
public abstract class AbstractHttpFetcher implements Fetcher {

    private static final String UNABLE_TO_FETCH_MSG = "Unable to fetch uri %s";

    private final HttpClient httpClient;
    public AbstractHttpFetcher(HttpClient httpClient) {
        this.httpClient = Preconditions.checkNotNull(httpClient);
    }

    /**
     * Constructs a URI from keyword. This is service specific.
     * @param keyword
     * @return
     */
    protected abstract URI createUriForKeyword(String keyword);

    @Override
    public String getPage(String keyword) {

        final URI uri = createUriForKeyword(keyword);
        try {
            final HttpResponse response = httpClient.execute(new HttpGet(uri));
            return EntityUtils.toString(response.getEntity());

        } catch (IOException e) {
            throw new FetcherException(String.format(UNABLE_TO_FETCH_MSG, uri), e);
        }
    }
}
