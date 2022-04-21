package com.bilgeadam.variableCapture4;

import com.bilgeadam.Function;

import java.util.concurrent.atomic.AtomicReference;

public class Main {

    public static void main(String[] args) {
        AtomicReference<String> stringValue = new AtomicReference<>("Test");
        String s = "Test";

        Function<String> function = (a) -> {
            // s = a;
            stringValue.set(a);
            return stringValue.get();
        };

        System.out.println(function.apply("Burak"));
    }
}
