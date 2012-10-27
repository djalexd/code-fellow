package org.codefellow.core;

/**
 * @author Alex Dobjanschi
 * @since 10/27/12 6:18 PM
 */
public class NoOpTagParser implements TagParser {
    @Override
    public Tag parseRawTag(String rawTag) {
        return new TextTag(rawTag, rawTag);
    }
}
