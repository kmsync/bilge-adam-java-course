package com.bilgeadam;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //int sayi;
        //int sayac=1;

        int sayi = Integer.parseInt(args[0]);
        int sayac= Integer.parseInt(args[1]);

        /*Scanner scanner = new Scanner(System.in);
        System.out.print("Sayıyı giriniz: ");
        sayi = scanner.nextInt();*/

        while (sayi >= 10){
            sayi = sayi / 10;
            sayac++;
        }
        System.out.println(sayac);
    }
}
