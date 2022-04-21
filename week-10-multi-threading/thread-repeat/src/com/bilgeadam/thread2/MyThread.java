package com.bilgeadam.thread2;

public class MyThread extends Thread{

    @Override
    public void run(){
        for(int index = 0 ; index < 10000 ; index++){
            System.out.println("MyThread index: "+index);
        }
        System.out.println("MyThread sonlandı.");
    }

}
