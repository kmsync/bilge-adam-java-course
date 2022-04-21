package com.bilgeadam.threads;

import com.bilgeadam.ProducerConsumer;

public class ConsumerRunnable implements Runnable{

    private final ProducerConsumer producerConsumer;

    public ConsumerRunnable(ProducerConsumer producerConsumer){
        this.producerConsumer = producerConsumer;
    }

    @Override
    public void run() {
        this.producerConsumer.consume();
    }
}
