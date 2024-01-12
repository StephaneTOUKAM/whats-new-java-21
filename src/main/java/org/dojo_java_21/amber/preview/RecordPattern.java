package org.dojo_java_21.amber.preview;

public class RecordPattern {
    record Point(int x, int y) {}

    static void printSum(Object obj) {
        if (obj instanceof Point(int x, int y)) {
            System.out.println(x+y);
        }
    }
}
