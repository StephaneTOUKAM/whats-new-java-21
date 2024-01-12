package org.dojo_java_21.amber.standard;

public class StringBuilderRepeat {
    public static void main(String[] args) {
        var chaine = new StringBuilder().append("testtt").repeat("e",10).toString();
        System.out.println(chaine);
    }
}
