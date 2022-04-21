package com.bilgeadam.threads;

import com.bilgeadam.ArrayOperations;

import java.util.Date;

public class Thread1 extends Thread{

    private final ArrayOperations arrayOperations;

    public Thread1(ArrayOperations arrayOperations){
        this.arrayOperations = arrayOperations;
    }

    @Override
    public void run(){
        int[] array = {1,2};
        System.out.println(this.getName() +": " + arrayOperations.sum(array));
    }
}
