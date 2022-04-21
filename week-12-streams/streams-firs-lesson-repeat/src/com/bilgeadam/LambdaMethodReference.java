package com.bilgeadam;

public class LambdaMethodReference {

    public Function<String,String,String> stringFunction(){
        Function<String,String,String> lambda = (a,b) -> a+b;
        return lambda;
    }

    public DoubleFunction doubleFunction(){
        return () -> 3.4;
    }

    public void useFunction(){
        System.out.println(doubleFunction().apply());

    }

    public static void printHello(String s){
        System.out.println(s);
    }
}
