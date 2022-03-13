package com.bilgeadam.thread2;

public class Main {
    public static void main(String[] args){
        Thread thread1 = new Thread(new Printer("printer1"));
        Thread thread2 = new Thread(new Printer("printer2"));
        Thread thread3 = new Thread(new Printer("printer3"));
        thread1.start();
        thread2.start();
        thread3.start();

        System.out.println("main thread çalıştı.");
    }
}
