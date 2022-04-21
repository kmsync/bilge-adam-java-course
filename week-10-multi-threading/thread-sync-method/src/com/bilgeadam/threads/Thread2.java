package com.bilgeadam.threads;

import com.bilgeadam.ArrayOperations;

import java.util.Date;

public class Thread2 extends Thread{
    private final ArrayOperations arrayOperations;

    public Thread2(ArrayOperations arrayOperations){
        this.arrayOperations = arrayOperations;
    }

    @Override
    public void run(){
        System.out.println(this.getName() +": " + arrayOperations.getSum());
    }
}
