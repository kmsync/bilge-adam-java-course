package com.bilgeadam;

public class Main {

    public static void main(String[] args) {
        
        MyThread thread1 = new MyThread();

        MyThread thread2 = new MyThread();

        thread1.start();
        thread2.start();

        try{
            thread1.join();
            thread2.join();
        }catch (InterruptedException interruptedException){
            System.err.println(interruptedException.getMessage());
        }
    }
}
