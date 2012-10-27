package org.codefellow.core;

import java.util.List;

/**
 * A parser that accepts a list of raw String tags and generates
 * a list of {@link Tag tags}. It is usually implemented using a
 * {@link TagParser}.
 *
 * @author Alex Dobjanschi
 * @since 10/27/12 5:55 PM
 */
public interface ListTagParser {
    /**
     * A parser that accepts
     * @param rawTags
     * @return
     */
    List<Tag> parseRawTag(List<String> rawTags);
}
