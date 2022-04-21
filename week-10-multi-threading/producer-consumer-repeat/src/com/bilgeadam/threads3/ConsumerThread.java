package com.bilgeadam.threads3;

import com.bilgeadam.interfaces.ProducerConsumer;

public class ConsumerThread extends Thread{

    private final ProducerConsumer producerConsumer;

    public ConsumerThread(ProducerConsumer producerConsumer){
        this.producerConsumer = producerConsumer;
    }

    @Override
    public void run(){
        for(int i = 0 ; i < 1000 ; i++){
            producerConsumer.consume();
        }
    }
}
