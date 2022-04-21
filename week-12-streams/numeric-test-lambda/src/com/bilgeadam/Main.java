package com.bilgeadam;

public class Main {

    public static void main(String[] args) {
        NumericTest isFactor = (m,n) -> m % n == 0;
        System.out.println("isFactor: "+isFactor.test(5,5));

        NumericTest lessThan = (x,y) -> (x < y);
        System.out.println("lessThan: "+lessThan.test(5,6));

        NumericTest absEqual = (a,b) -> (a < 0 ? -a : a) == (b < 0 ? -b : b);
        System.out.println("absEqual: "+absEqual.test(-30,30));

        // (6 < 5) ? ("Doğru") : ("Yanlış")
    }
}
