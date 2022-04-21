package com.bilgeadam.sync.threads;

import com.bilgeadam.sync.NumberIncreaser;

public class Thread2 extends Thread{

    private final NumberIncreaser numberIncreaser;


    public Thread2(NumberIncreaser numberIncreaser){
        this.numberIncreaser = numberIncreaser;
    }

    @Override
    public void run(){
        numberIncreaser.asyncIncreaseInteger();
    }
}
