package com.bilgeadam.threads2;

import java.util.concurrent.ArrayBlockingQueue;

public class Main2 {

    public static void main(String[] args) {
        ArrayBlockingQueue<Integer> queue = new ArrayBlockingQueue<>(10);

        Thread producer = new ProducerThread(queue);
        Thread consumer = new ConsumerThread(queue);
        producer.start();
        consumer.start();
        try {
            producer.join();
            consumer.join();
        } catch (InterruptedException interruptedException) {
            System.err.println(interruptedException.getMessage());
        }
    }
}
