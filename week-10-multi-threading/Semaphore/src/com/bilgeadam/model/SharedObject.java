package com.bilgeadam.model;

public class SharedObject {
    private static int value = 0;

    public static int incrementAndGet(){
        return ++value;
    }

    public static int decrementAndGet(){
        return --value;
    }
}
