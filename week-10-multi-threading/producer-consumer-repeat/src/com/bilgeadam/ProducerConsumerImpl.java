package com.bilgeadam;

import com.bilgeadam.interfaces.ProducerConsumer;

import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;

public class ProducerConsumerImpl implements ProducerConsumer {
    private final Random random = new Random();
    private final ArrayBlockingQueue<Integer> queue = new ArrayBlockingQueue<>(10);

    @Override
    public void produce() {
        Integer value = random.nextInt();
        try {
            queue.put(value);
            System.out.println("Producer üretiyor: " + value);
        } catch (InterruptedException interruptedException) {
            System.err.println(interruptedException.getMessage());
        }
    }

    @Override
    public void consume() {
        try {
            Integer value = queue.take();
            System.out.println("Consumer tüketiyor: "+value);
        }catch (InterruptedException interruptedException){
            System.err.println(interruptedException.getMessage());
        }

    }

}
