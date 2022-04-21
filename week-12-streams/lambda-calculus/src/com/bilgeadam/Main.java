package com.bilgeadam;

public class Main {

    public static void main(String[] args) {
        SumImpl sumImpl = new SumImpl();
        System.out.println(sumImpl.sum(5,6));

        Sum sumLambda = (a,b) -> a+b;
        System.out.println(sumLambda.sum(5,6));
    }
}
