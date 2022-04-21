package com.bilgeadam.variableCapture1;

import com.bilgeadam.Function;

public class Main {
    static Integer value;

    public static void main(String[] args) {
        value = 10;

        Function<Integer> integerFunction = (a) -> {
            value = 20;
            return value * a;
        };

        System.out.println(value);
        System.out.println(integerFunction.apply(5));
    }
}
