package com.bilgeadam;

public class Main {

    public static void main(String[] args) {
        GenericFunction<Integer,Integer,Integer> sum = (a,b) -> a+b;

        System.out.println(sum.apply(5,6));

        GenericFunction<Integer, Double, String> sumConvertToString = (a,b) -> {
            return String.valueOf(a.doubleValue() + b);
        };

        System.out.println(sumConvertToString.apply(5,20.8));
    }
}
