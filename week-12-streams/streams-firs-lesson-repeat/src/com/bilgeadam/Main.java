package com.bilgeadam;

public class Main {

    public static void main(String[] args) {

        /*Function<Integer,Double,String> sumConvertToString = (x,y) -> {
            return String.valueOf(x.doubleValue()+y);
        };

        String sumString = sumConvertToString.apply(5,99.9);

        System.out.println(sumString);
        System.out.println(sumString.getClass().getSimpleName());*/

        LambdaCalculus lambdaCalculus = new LambdaCalculus();
        lambdaCalculus.getValueLambdaEquivalent();

    }
}
