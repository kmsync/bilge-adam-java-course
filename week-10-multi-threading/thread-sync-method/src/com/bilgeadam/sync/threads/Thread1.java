package com.bilgeadam.sync.threads;


import com.bilgeadam.sync.NumberIncreaser;

public class Thread1 extends Thread{

    private final NumberIncreaser numberIncreaser;


    public Thread1(NumberIncreaser numberIncreaser){
        this.numberIncreaser = numberIncreaser;
    }

    @Override
    public void run(){
        numberIncreaser.increaseInteger();
    }
}
