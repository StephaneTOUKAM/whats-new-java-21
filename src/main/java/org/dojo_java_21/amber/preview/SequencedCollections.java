package org.dojo_java_21.amber.preview;

import java.util.ArrayList;
import java.util.SequencedCollection;

public class SequencedCollections {
    public static void main(String[] args) {
        SequencedCollection<String> seqColl = new ArrayList<>();
        seqColl.add("element 1");
        seqColl.add("element 2");
        seqColl.add("element 3");

        String firstElement = seqColl.getFirst();
        String lastElement = seqColl.getLast();
        SequencedCollection<String> reversedView = seqColl.reversed();
        System.out.println(firstElement);
        System.out.println(lastElement);
        System.out.println(reversedView);
    }
}
