package tr.com.burakgul;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("-------------------------------------------------------------------------------------------");
        Scanner scanner = new Scanner(System.in);
        System.out.print("İlk kardeşin yaşını giriniz: ");
        int first = scanner.nextInt();
        System.out.print("İkinci kardeşin yaşını giriniz: ");
        int second = scanner.nextInt();

        if(first+second > 30){
            System.out.println("Yaşlar toplamı 30'dan büyüktür.");
        }

        System.out.println("-------------------------------------------------------------------------------------------");

        System.out.print("100'lük sistemden 5'lik sisteme çevirmek istediğiniz notunuzu giriniz:");
        int userGrade = scanner.nextInt();
        if(userGrade < 50){
            System.out.println("1");
        }else if(userGrade >= 50 && userGrade < 60){
            System.out.println("2");
        } else if(userGrade >= 60 && userGrade < 70){
            System.out.println("3");
        } else if(userGrade >= 70 && userGrade < 80){
            System.out.println("4");
        }else {
            System.out.println("5");
        }

        System.out.println("-------------------------------------------------------------------------------------------");


        System.out.print("İlk sayıyı giriniz: ");
        int number1 = scanner.nextInt();
        System.out.print("İkinci sayıyı giriniz: ");
        int number2 = scanner.nextInt();
        System.out.print("Üçüncü sayıyı giriniz: ");
        int number3 = scanner.nextInt();

        if(number1 > number2 && number1 > number3){
            System.out.println(number1);
        } else if( number2 > number1 && number2 > number3){
            System.out.println(number2);
        }else if(number3 > number2 && number3 > number1){
            System.out.println(number3);
        }

        System.out.println("-------------------------------------------------------------------------------------------");

        System.out.print("Tek mi çift mi olduğunu bulmak istediğiniz sayıyı giriniz: ");

        int odd = scanner.nextInt();

        if(odd % 2 == 1){
            System.out.println("Sayı tektir.");
        }else {
            System.out.println("Sayı çifttir.");
        }

        System.out.println("-------------------------------------------------------------------------------------------");
        scanner.nextLine();

        System.out.println("Animal name: ");
        String animalName = scanner.nextLine();

        switch (animalName){
            case "DOG":
            case "CAT":
            case "TIGER":
            case "ELEPHANT":
            case "WOLF":
                System.out.println("True animal name.");
                break;
            default:
                System.out.println("Wrong animal name.");
                break;
        }

        switch (animalName){
            case "DOG":
            case "CAT":
                System.out.println("Domestic animal.");
                break;
            case "TIGER":
            case "ELEPHANT":
            case "WOLF":
                System.out.println("Wild animal.");
                break;
            default:
                System.out.println("Unknown animal.");
                break;
        }

    }
}
