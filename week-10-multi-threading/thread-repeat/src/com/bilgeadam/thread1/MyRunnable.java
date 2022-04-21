package com.bilgeadam.thread1;

public class MyRunnable implements Runnable{
    @Override
    public void run(){
        for(int index = 0 ; index < 10000 ; index++){
            System.out.println("MyRunnable index: "+index);
        }
        System.out.println("MyRunnable Thread sonlandı.");
    }
}
