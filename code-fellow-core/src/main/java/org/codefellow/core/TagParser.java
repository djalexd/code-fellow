package org.codefellow.core;

/**
 * @author Alex Dobjanschi
 * @since 10/27/12 3:06 PM
 */
public interface TagParser {

    /**
     * Parses and returns a modified tag. This is useful for semantical searches,
     * synonims, n-grams, etc.
     * @param rawTag The input tag.
     * @return
     */
    Tag parseRawTag(String rawTag);
}
