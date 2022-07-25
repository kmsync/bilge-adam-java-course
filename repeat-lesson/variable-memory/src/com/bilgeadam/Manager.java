package com.bilgeadam;

public class Manager {
    private static String name = "Burak";
    private String surname = "GÜL";

    public void printManagerSurname(){
        String a = "A";
        System.out.println(surname);
    }

    public void printManagerNameAndSurname(){
        String hello = "Hello Java";
        for(int i = 0 ; i < 10 ; i++){
            String notAccesable = "Not accesable";
            System.out.println(hello);
        }
        // System.out.println(notAccesable);
    }

    public static void printManagerNameWithStatic(){
        String a = "A";
        System.out.println(name);
        a = "B";
    }
}
