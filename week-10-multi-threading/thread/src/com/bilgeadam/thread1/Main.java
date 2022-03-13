package com.bilgeadam.thread1;

public class Main {

    public static void main(String[] args){
        Printer printer1 = new Printer("printer1");
        Printer printer2 = new Printer("printer2");
        Printer printer3 = new Printer("printer3");
        printer1.start();
        printer2.start();
        printer3.start();
        System.out.println("main thread çalışmaya başladı.");
    }
}
