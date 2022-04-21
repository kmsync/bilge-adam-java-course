package com.bilgeadam.constructorMethodReference2;

public class Main {

    public static void main(String[] args) {
        StringFunction stringFunction = String::new;

        char[] chars = new char[]{'B','u','r','a','k'};

        String newString = stringFunction.build(chars);
        System.out.println(newString);
    }
}
