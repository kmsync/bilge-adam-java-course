package tr.com.burakgul;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int a = 5;
        int b = 5;

        if (a == b) System.out.println("A sayısı B sayısına eşittir.");
        else System.out.println("A sayısı B sayısına eşit değildir.");

        if (a == b)
            System
                    .out
                    .println("A sayısı B sayısına eşittir.");
        else
            System
                    .out
                    .println("A sayısı B sayısına eşit değildir.");

        if (a == 6) {
            System
                    .out
                    .println("A sayısı B sayısına eşittir.");
        } else {
            System
                    .out
                    .println("A sayısı B sayısına eşit değildir.");
        }

        if (a == b) {
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
        } else {
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
        }


        if (a == 6) {
            System
                    .out
                    .println("A sayısı B sayısına eşittir.");
        } else if (a < 7) {
            System.out.println("A 7'den küçüktür. 1");
        } else if (a < 8) {
            System.out.println("A 7'den küçüktür. 2");
        }else if (a < 9) {
            System.out.println("A 7'den küçüktür. 3");
        }else {
            System
                    .out
                    .println("A sayısı B sayısına eşit değildir.");
        }

        if (a == 6) System.out.println("A sayısı B sayısına eşittir.");
        else if (a < 7) System.out.println("A 7'den küçüktür. 1");
        else if (a < 8) System.out.println("A 7'den küçüktür. 2");
        else if (a < 9) System.out.println("A 7'den küçüktür. 3");
        else System.out.println("A sayısı B sayısına eşit değildir.");


        System.out.println(a == 5 ? "A sayısı 5 değerine eşittir." : "A sayısı 5 değerine eşit değildir.");
        System.out.println(a == 6 ? "A sayısı 6 değerine eşittir." : "A sayısı 6 değerine eşit değildir.");

        String message = a == 5 ? "A sayısı 5 değerine eşittir." : "A sayısı 5 değerine eşit değildir.";

        System.out.println(message);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Integer bir değer giriniz: ");
        int value = scanner.nextInt();


        switch (value){
            case 1:
                System.out.println("Sayı 1");
                break;
            case 2:
                System.out.println("Sayı 2");
                break;
            case 3:
                System.out.println("Sayı 3");
                break;
            case 5:
                System.out.println("Sayı 5");
                break;
            default:
                System.out.println("Girmiş olduğunuz sayı hiç bir koşula uymamaktadır.");
        }

        returnInteger(value);
    }

    public static int returnInteger(int value){
        switch (value){
            case 1:
                System.out.println("Sayı 1");
                return 1;
            case 2:
                System.out.println("Sayı 2");
                return 2;
            case 3:
                System.out.println("Sayı 3");
                return 3;
            case 5:
                System.out.println("Sayı 5");
                return 4;
            default:
                System.out.println("Girmiş olduğunuz sayı hiç bir koşula uymamaktadır.");
                return 0;
        }
    }
}
