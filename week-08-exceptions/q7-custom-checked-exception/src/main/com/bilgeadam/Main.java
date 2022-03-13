package com.bilgeadam;

public class Main {

    public static void main(String[] args) {
        ExceptionManager exceptionManager = new ExceptionManager();
        try {
            exceptionManager.throwException();
        } catch (Exception exception) {
            System.exit(0);
        }
    }
}
