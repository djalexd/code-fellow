package org.codefellow.core;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;

import java.util.List;

/**
 * The default implementation of {@link ListTagParser}. It uses a
 * {@link TagParser} to process individual tags.
 *
 * @author Alex Dobjanschi
 * @since 10/27/12 5:56 PM
 */
public class DefaultListTagParser implements ListTagParser {

    private final TagParser tagParser;
    public DefaultListTagParser(TagParser tagParser) {
        this.tagParser = tagParser;
    }

    @Override
    public List<Tag> parseRawTag(List<String> rawTags) {
        List<Tag> parsedTags = Lists.newArrayListWithCapacity(rawTags.size());
        for (String rawTag : rawTags) {
            parsedTags.add(tagParser.parseRawTag(rawTag));
        }
        return ImmutableList.copyOf(parsedTags);
    }
}
