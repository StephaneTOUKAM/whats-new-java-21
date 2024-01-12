package org.dojo_java_21.loom.standard;

import java.util.Arrays;
import java.util.Collections;
import java.util.random.RandomGenerator;

public class VirtualThread {
    public static void main(String[] args) {
        var emojiCode = 12;
        System.out.println(Character.isEmoji(emojiCode));

        System.out.println(Character.isEmojiComponent(emojiCode));

        System.out.println(Character.isEmojiModifier(emojiCode));

        System.out.println(Character.isExtendedPictographic(emojiCode));
    }
}
