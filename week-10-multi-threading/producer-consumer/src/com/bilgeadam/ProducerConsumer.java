package com.bilgeadam;

import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;

public class ProducerConsumer {

    Random random = new Random();

    private ArrayBlockingQueue<Integer> queue = new ArrayBlockingQueue<>(10);

    public void produce(){
        try {
            Integer value = this.random.nextInt();
            this.queue.put(value);
            System.out.println("Producer üretiyor: "+value);
        }catch (InterruptedException interruptedException){
            System.err.println(interruptedException.getMessage());
        }
    }

    public void consume(){
        try {
            /*Thread.sleep(10000);*/
            Integer value = this.queue.take();
            System.out.println("Consumer tüketiliyor: "+value);
        }catch (InterruptedException interruptedException){
            System.err.println(interruptedException.getMessage());
        }

    }
}
