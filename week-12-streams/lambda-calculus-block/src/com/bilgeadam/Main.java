package com.bilgeadam;

public class Main {

    public static void main(String[] args) {

        NumericFunc returnItSelf = (x) -> x;

        NumericFunc biggestFactorBesidesItSelf = (x) -> {
            int result = 1;
            x = x<0 ? -x : x;

            for(int i = 2 ; i <= x/2 ; i++){
                if(x % i == 0){
                    result = i;
                }
            }
            return result;
        };

        System.out.println(returnItSelf.func(5));
        System.out.println(biggestFactorBesidesItSelf.func(20));
        System.out.println(biggestFactorBesidesItSelf.func(37));
    }
}
