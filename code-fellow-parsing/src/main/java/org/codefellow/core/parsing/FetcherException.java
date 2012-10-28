package org.codefellow.core.parsing;

/**
 * Fetch exceptions.
 *
 * @author Alex Dobjanschi
 * @since 10/27/12 8:56 PM
 */
public class FetcherException extends RuntimeException {

    public FetcherException() {
    }

    public FetcherException(String message) {
        super(message);
    }

    public FetcherException(String message, Throwable cause) {
        super(message, cause);
    }

    public FetcherException(Throwable cause) {
        super(cause);
    }
}
