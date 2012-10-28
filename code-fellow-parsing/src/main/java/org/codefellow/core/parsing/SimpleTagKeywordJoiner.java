package org.codefellow.core.parsing;

import com.google.common.base.Function;
import com.google.common.base.Joiner;
import com.google.common.collect.Collections2;
import org.codefellow.core.Tag;

import javax.annotation.Nullable;
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
        return this.joiner.join(Collections2.transform(tags, new Function<Tag, String>() {
            @Override
            public String apply(@Nullable Tag input) {
                return input.getValue();
            }
        }));
    }
}
