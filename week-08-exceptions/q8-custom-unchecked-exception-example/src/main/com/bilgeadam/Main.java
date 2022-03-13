package com.bilgeadam;

import com.bilgeadam.exceptions.MultiplyException;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Sayı gir:");
        int variable = scanner.nextInt();
        if (variable == 1) {
            try {
                throw new MultiplyException("Çarpım hatası oluştu.");
            } catch (MultiplyException multiplyException) {
                System.out.println(multiplyException.getMessage());
                System.exit(1);
            }
        }
        System.out.println("Test");
    }
}
