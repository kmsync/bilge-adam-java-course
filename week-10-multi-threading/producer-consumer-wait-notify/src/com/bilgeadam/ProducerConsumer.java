package com.bilgeadam;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class ProducerConsumer {
    private final Random random = new Random();
    private final Object lock = new Object();
    private final int LIMIT = 10;
    Queue<Integer> queue = new LinkedList<>();

    public void produce(){
        while (true){
            synchronized (this.lock){
                if(this.queue.size() == this.LIMIT){
                    try {
                         this.lock.wait(); // wait() çağrıldığında beklemeye başlar.
                    }catch (InterruptedException interruptedException){
                        System.err.println(interruptedException.getMessage());
                    }
                }
                Integer value = this.random.nextInt();
                this.queue.offer(value);
                System.out.println("Producer üretiyor: "+value);
                this.lock.notify();
            }
        }
    }

    public void consume(){
        while (true){
            synchronized (this.lock) {

                if(this.queue.size() == 0){
                    try {
                        this.lock.wait();
                    } catch (InterruptedException e) {
                        System.err.println(e.getMessage());
                    }
                }

                Integer value = this.queue.poll();
                System.out.println("Consumer tüketiyor: "+ value);
                System.out.println("Queue size: "+ this.queue.size());
                this.lock.notify();
            }
        }
    }
}
