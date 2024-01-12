package org.dojo_java_21.amber.standard;

public final class SwitchPatternMatching {

    public static void main(String[] args) {
        formatterPatternSwitch(1);
    }

    static String formatterPatternSwitch(Object obj) {
        return switch (obj) {
            case null -> "On a une valeur null";
            case Integer i -> String.format("int %d", i);
            case Long l    -> String.format("long %d", l);
            case Double d  -> String.format("double %f", d);
            case String s  -> String.format("String %s", s);
            default        -> obj.toString();
        };
    }
}
