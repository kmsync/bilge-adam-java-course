package com.bilgeadam.manager;

import com.bilgeadam.calculator.CalculatorImplementation;
import com.bilgeadam.exceptions.MultiplyException;

import java.util.Scanner;

public class CalculatorManager {

    Scanner scanner = new Scanner(System.in);
    CalculatorImplementation calculator = new CalculatorImplementation();

    public void calculate() {
        while (true) {
            System.out.println("Yapmak istediğiniz işlemi seçiniz:");
            System.out.println("1- Çarpma");
            System.out.println("2- Bölme");
            System.out.println("3- Toplama\n4- Çıkarma\n(Çıkış yapmak için -1 girişi yapınız.)");

            System.out.print("Giriş:");
            int selectedOption = scanner.nextInt();

            int a = 0;
            int b = 0;

            if(selectedOption != -1){
                System.out.print("İlk değeri giriniz:");
                a = scanner.nextInt();
                System.out.print("İkinci değeri giriniz:");
                b = scanner.nextInt();
            }

            switch (selectedOption) {
                case 1:
                    try {
                        System.out.println("Sonuç: "+calculator.multiply(a, b));
                    } catch (MultiplyException multiplyException) {
                        System.out.println(multiplyException.getMessage());
                    }
                    break;
                case 2:
                    System.out.println("Sonuç: "+calculator.divide(a,b));
                    break;
                case 3:
                    System.out.println("Sonuç: "+calculator.sum(a,b));
                    break;
                case 4:
                    System.out.println("Sonuç: "+calculator.difference(a,b));
                    break;
                case -1:
                    System.out.println("Çıkış yapılıyor.");
                    System.exit(0);
                default:
                    System.out.println("Girilen değer için işlem bulunamadı.");
            }
        }

    }
}
