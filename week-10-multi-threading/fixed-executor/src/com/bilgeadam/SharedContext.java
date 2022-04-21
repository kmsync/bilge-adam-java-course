package com.bilgeadam;

public class SharedContext {
    private static int value = 0;

    public static int incrementAndGet() {
        return ++value;
    }

    public static int decrementAndGet() {
        return --value;
    }

    public static int getValue() {
        return value;
    }
}
