package com.bilgeadam.variableCapture5;

import com.bilgeadam.Function;

public class Main {

    public static void main(String[] args) {
        Person person = new Person("Burak","GÜL");
        final String string = "Burcu";
        String nonFinalString = "Meriç";
        Function<String> function = (a) -> {
            System.out.println(string);
            System.out.println(nonFinalString);
            // string = "";
            // nonFinalString = "";
            person.setName(a);
            return person.toString();
        };

        System.out.println(function.apply("Burcu"));
    }
}
