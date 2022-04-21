package com.bilgeadam.thread2;

public class Main {

    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
        try{
            myThread.join();
        }catch (InterruptedException interruptedException){
            System.err.println("Threadde exception oluştuğu için catche düştü.");
        }
        System.out.println("Main Thread sonlandı.");
    }
}
