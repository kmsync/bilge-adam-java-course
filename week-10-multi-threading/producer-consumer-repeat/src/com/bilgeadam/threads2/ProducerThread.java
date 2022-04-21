package com.bilgeadam.threads2;

import com.bilgeadam.interfaces.ProducerConsumer;

import java.util.Random;
import java.util.concurrent.BlockingQueue;

public class ProducerThread extends Thread{

    private final BlockingQueue<Integer> arrayBlockingQueue;

    private final Random random = new Random();

    public ProducerThread(BlockingQueue<Integer> arrayBlockingQueue){
        this.arrayBlockingQueue = arrayBlockingQueue;
    }

    public void produce(){
        Integer value = random.nextInt();
        try {
            arrayBlockingQueue.put(value);
            System.out.println("Producer üretiyor: "+value);
        }catch (InterruptedException interruptedException){
            System.err.println(interruptedException.getMessage());
        }
    }

    @Override
    public void run(){
        for(int i = 0 ; i < 1000 ; i++){
            produce();
        }
    }
}
