package com.bilgeadam.threads2;

import com.bilgeadam.interfaces.ProducerConsumer;

import java.util.concurrent.BlockingQueue;

public class ConsumerThread extends Thread{

    private final BlockingQueue<Integer> arrayBlockingQueue;

    public ConsumerThread(BlockingQueue<Integer> arrayBlockingQueue){
        this.arrayBlockingQueue = arrayBlockingQueue;
    }

    public void consume(){
        try {
            Integer value = arrayBlockingQueue.take();
            System.out.println("Consumer tüketiyor: "+ value);
        }catch (InterruptedException e){
            System.err.println(e.getMessage());
        }

    }

    @Override
    public void run(){
        for(int i = 0 ; i < 1000 ; i++){
            consume();
        }
    }
}
