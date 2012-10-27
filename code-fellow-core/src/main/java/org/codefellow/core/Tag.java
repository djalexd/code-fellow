package org.codefellow.core;

/**
 * Represents a well-formatted tag.
 *
 * @author Alex Dobjanschi
 * @since 10/27/12 3:01 PM
 */
public interface Tag {
    /**
     * Original value of the tag.
     * @return
     */
    String getOriginalValue();

    /**
     * The well-formatted tag, as parsed by {@link TagParser}.
     * @return
     */
    String getValue();
}
