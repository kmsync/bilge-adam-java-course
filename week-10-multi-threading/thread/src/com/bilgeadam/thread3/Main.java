package com.bilgeadam.thread3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Thread thread1 = new Thread(new Runnable(){
            @Override
            public void run(){
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                    Scanner scanner = new Scanner(System.in);
                    System.out.print("Thread içerisinde Adınız: ");
                    String name = scanner.nextLine();
                    System.out.println("Thread içerisinde Soyadınız: ");
                    String surname = scanner.nextLine();
                    System.out.println(new NameSurnameManager(name,surname));
            }
        });

        Thread thread2 = new Thread(new Runnable(){
            @Override
            public void run(){
                try {
                    Thread.sleep(10000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                    Scanner scanner = new Scanner(System.in);
                    System.out.print("Aramak istediğiniz metni yazınız: ");
                    String searchKeyword = scanner.nextLine();
                    System.out.println("Aramak istediğiniz metin: " +searchKeyword);
            }
        });

        Thread thread3 = new Thread(new Runnable(){
            @Override
            public void run(){
                for(int i = 0 ; i< 10 ; i++){
                    System.out.println(i);
                }
            }
        });

        thread1.start();
        thread2.start();
        thread3.start();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Adınız: ");
        String name = scanner.nextLine();
        System.out.println("Soyadınız: ");
        String surname = scanner.nextLine();
        System.out.println(new NameSurnameManager(name,surname));
    }
}
