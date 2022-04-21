package com.bilgeadam.threads3;

import com.bilgeadam.interfaces.ProducerConsumer;

import java.util.Random;

public class ProducerThread extends Thread{

    private final ProducerConsumer producerConsumer;

    private final Random random = new Random();

    public ProducerThread(ProducerConsumer producerConsumer){
        this.producerConsumer = producerConsumer;
    }

    @Override
    public void run(){
        for(int i = 0 ; i < 1000 ; i++){
            producerConsumer.produce();
        }
    }
}
