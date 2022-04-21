package com.bilgeadam.threads;

import com.bilgeadam.ProducerConsumer;

public class ProducerThread extends Thread {

    private final ProducerConsumer producerConsumer;

    public ProducerThread(ProducerConsumer producerConsumer){
        this.producerConsumer = producerConsumer;
    }

    @Override
    public void run(){
        this.producerConsumer.produce();
    }
}
