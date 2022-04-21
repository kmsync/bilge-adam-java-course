package com.bilgeadam;

public class Main {

    public static void main(String[] args) {
        MyFunc myFunc = (a,b) -> {
            System.out.println("Metnin karakter sayısı: " + b.length());
            System.out.println(a+" "+b);
        };

        myFunc.apply(5,"Sayı");
    }
}
