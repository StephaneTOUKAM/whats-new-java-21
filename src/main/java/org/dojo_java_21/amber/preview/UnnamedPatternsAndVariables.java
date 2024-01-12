package org.dojo_java_21.amber.preview;

import java.util.Arrays;
import java.util.List;

public class UnnamedPatternsAndVariables {
    public static void main(String[] args) {
        record Grade(String code, String designation) {}
        record Employe(String nom, String prenom, Grade grade) {}

        Object o = new Employe("Nom1", "Prenom1", new Grade("DEV", "Développeur"));

        // Exemple d'utilisation de l'underscore dans un Record
        if (o instanceof Employe(var nom, var prenom, _)) {
            System.out.println("Employe : " + nom + " " + prenom);
        }

        // Utilisation de l'underscore pour ignorer la variable de l'itération
        int[] tableau = {1, 2, 3, 4, 5};
        for (int _ : tableau) {
            System.out.println("Ignoré");
        }

        // Exemple d'utilisation de l'underscore dans une lambda expression
        List<String> strings = Arrays.asList("a", "b", "c");
        strings.forEach(_ -> System.out.println("Element non utilisé"));

    }
}
