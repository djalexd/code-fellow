package org.codefellow.core.parsing;

import org.codefellow.core.Tag;

import java.util.List;

/**
 * @author Alex Dobjanschi
 * @since 10/27/12 9:02 PM
 */
public interface TagKeywordJoiner {

    String joinTags(List<Tag> tags);
}
