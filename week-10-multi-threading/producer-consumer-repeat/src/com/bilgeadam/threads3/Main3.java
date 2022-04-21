package com.bilgeadam.threads3;

import com.bilgeadam.ProducerConsumerImpl;
import com.bilgeadam.interfaces.ProducerConsumer;

public class Main3 {

    public static void main(String[] args){
        ProducerConsumer producerConsumer = new ProducerConsumerImpl();

        Thread consumer = new ConsumerThread(producerConsumer);
        Thread producer = new ProducerThread(producerConsumer);

        producer.start();
        consumer.start();

        try {
            producer.join();
            consumer.join();
        }catch (InterruptedException interruptedException){
            System.err.println(interruptedException.getMessage());
        }
    }
}
