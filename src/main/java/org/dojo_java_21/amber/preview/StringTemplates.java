package org.dojo_java_21.amber.preview;

import static java.lang.StringTemplate.STR;

public class StringTemplates {

    // Preview
    public static void main(String[] args) {
        String prenom = "Stephane";
        int age = 28;
        String message = STR."Bonjour \{prenom}, tu as \{age} ans";
        System.out.println(message);
    }

}
