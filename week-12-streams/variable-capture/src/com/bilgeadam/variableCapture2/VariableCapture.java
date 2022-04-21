package com.bilgeadam.variableCapture2;

import com.bilgeadam.Function;

public class VariableCapture {

    private int value;

    public void capture(){
        value = 10;
        Function<Integer> function = (a) -> {
            value = 20;
            return a * value;
        };

        System.out.println(value);
        System.out.println(function.apply(5));
        System.out.println(value);
    }
}
