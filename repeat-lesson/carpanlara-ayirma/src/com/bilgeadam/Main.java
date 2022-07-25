package com.bilgeadam;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a;
        int b;
        int c;
        int delta;
        System.out.print("a'yı gir:");
        a = scanner.nextInt();
        System.out.println("b'yi gir:");
        b = scanner.nextInt();
        System.out.println("c'yi gir:");
        c = scanner.nextInt();

        delta = (b*b)-(4*a*c);
        System.out.println(delta);
        if(delta == 0){
            System.out.println("Çakışık 2 tane kökü var.");
        }else if(delta < 0) {
            System.out.println("Reelde kökü yok.");
        }else {
            System.out.println("Reelde iki kökü var.");
        }
    }
}
