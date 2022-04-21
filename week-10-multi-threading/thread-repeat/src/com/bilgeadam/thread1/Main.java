package com.bilgeadam.thread1;

public class Main {

    public static void main(String[] args) {
        Thread thread = new Thread(new MyRunnable());
        thread.start();
        try {
            thread.join();
        } catch (InterruptedException e) {
            System.err.println(e.getMessage());
        }
        System.out.println("Main thread sonlandı.");
    }
}
