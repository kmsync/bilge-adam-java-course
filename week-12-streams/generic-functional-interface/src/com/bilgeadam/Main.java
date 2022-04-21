package com.bilgeadam;

public class Main {

    public static void main(String[] args) {
        NumericTest<Integer> lessThan = (x,y) -> x < y;
        System.out.println(lessThan.test(5,4));
        System.out.println(lessThan.test(6,7));
        System.out.println(lessThan.test(8,8));

        NumericTest<Double> doubleLessThan = (x,y) -> x < y;

        System.out.println("Double less than: " + doubleLessThan.test(5.0,6.0));

        NumericTest<String> stringCompare = (x,y) -> x.equals(y);

        if(lessThan.test(6,7)){
            System.out.println("İkinci sayı birinci sayıdan büyüktür.");
        }else {
            System.out.println("Birinci sayı ikinci sayıdan büyüktür.");
        }

        if(stringCompare.test("Burak","Burak")){
            System.out.println("İki değer birbirine eşittir.");
        }else {
            System.out.println("İki değer birbirinden farklıdır.");
        }
    }
}
