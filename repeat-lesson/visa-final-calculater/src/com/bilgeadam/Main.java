package com.bilgeadam;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int vize;
        int finalNotu;
        System.out.print("Vize Notu: ");
        vize = scanner.nextInt();
        System.out.print("Final Notu: ");
        finalNotu = scanner.nextInt();
        double ortalama;
        if(finalNotu > 50){
            ortalama = vize*(30.0/100.0) + finalNotu * (70.0/100.0);
            if(ortalama > 50){
                System.out.println("Geçti.");
            } else {
                System.out.println("Kaldı.");
            }
        } else {
            System.out.println("Kaldı.");
        }
    }
}
