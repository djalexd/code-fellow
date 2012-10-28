package org.codefellow.core.parsing;

import com.google.common.base.Joiner;
import org.codefellow.core.Tag;

import java.util.List;

/**
 * @author Alex Dobjanschi
 * @since 10/27/12 9:08 PM
 */
public class SimpleTagKeywordJoiner implements TagKeywordJoiner {

    private final Joiner joiner;
    public SimpleTagKeywordJoiner(String separator) {
        this.joiner = Joiner.on(separator).skipNulls();
    }

    @Override
    public String joinTags(List<Tag> tags) {
        // TODO Not check for null.
        return this.joiner.join(tags);
    }
}
