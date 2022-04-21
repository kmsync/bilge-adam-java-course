package com.bilgeadam.concurrency;

import com.bilgeadam.model.SharedObject;

import java.util.concurrent.Semaphore;

public class MySemaphore extends Thread{
    private final Semaphore semaphore;
    private String name;
    private boolean increment;

    public MySemaphore(Semaphore semaphore, String name, boolean increment){
        this.semaphore = semaphore;
        this.name = name;
        this.increment = increment;
    }

    @Override
    public void run(){
        try {
            this.semaphore.acquire();

            if(increment){
                for(int i = 0; i< 5; i++){
                    System.out.println(this.name + " value: "+ SharedObject.incrementAndGet());
                    Thread.sleep(100);
                }
            }else {
                for (int i = 0; i < 5; i++){
                    System.out.println(this.name + " value: "+ SharedObject.decrementAndGet());
                    Thread.sleep(100);
                }
            }
        }catch (InterruptedException interruptedException){
            System.err.println(interruptedException.getMessage());
        }
        this.semaphore.release();
    }

}
