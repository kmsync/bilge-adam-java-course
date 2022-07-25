package com.bilgeadam;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        islem();
        islem(1);
        islem(1,"");
        islem("",1);

        System.out.println("------------------------------------------");

        System.out.println(sum(10));
        System.out.println("------------------------------------------");
        MethodCall methodCall = new MethodCall();
        System.out.println(methodCall.callFibonacciMethod(12));

        System.out.println("------------------------------------------");

        sum(999999999,99999999);

        System.out.println("------------------------------------------");

        int a,b;

        a = 5;
        b = 10;

        System.out.println(divide(a,b));
        System.out.println(multiply(a,b));
        System.out.println(substract(a,b));

        System.out.println("------------------------------------------");

        System.out.println(factorial(2));
        System.out.println(factorial(3));
        System.out.println(factorial(11));

        System.out.println("------------------------------------------");

        Scanner scanner = new Scanner(System.in);

        int c = scanner.nextInt();
        int d = scanner.nextInt();

        System.out.println(greaterThan(c,d));
    }

    public static boolean greaterThan(int a, int b){
        if(a > b) return true;
        return false;
    }

    public static long factorial(long n){
        if(n <= 1){
            return 1;
        } else {
            return n*factorial(n-1);
        }
    }

    public static int divide(int a, int b){
        return a/b;
    }

    public static int multiply(int a, int b){
        return a*b;
    }

    public static int substract(int a, int b){
        return a-b;
    }

    public static void sum(int a, int b){
        System.out.println(a+b);
    }

    public static void islem(){
        double a,b;
        a=5;
        b=6;

        System.out.println("Çarpım: " + a*b);
        System.out.println("Bölüm: " + a/b);
    }

    public static int islem(int a){
        return a;
    }

    public static int islem(int b,String a){
        return b;
    }

    public static int islem(String a,int b){
        return b;
    }

    public static int sum(int a){
        if(0 <= a){
            return a+ sum(a-1);
        }else {
            return 0;
        }
    }

    /**
     *
     * @param 12
     * 11 + 10
     * 10 9  9 8
     */
    public static int fibonacci(int n){
        if((n == 0) || (n ==1)){
            return n;
        }else {
            return fibonacci(n-1)+fibonacci(n-2);
        }
    }
}
