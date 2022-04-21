package com.bilgeadam;

import java.util.concurrent.Semaphore;

public class IncrementSemaphore implements Runnable {

    private Semaphore semaphore;

    public IncrementSemaphore(Semaphore semaphore) {
        this.semaphore = semaphore;
    }

    @Override
    public void run() {
        try {
            this.semaphore.acquire();
            for (int i = 0; i < 5; i++) {
                System.out.println(SharedContext.incrementAndGet());
            }
        } catch (InterruptedException interruptedException) {
            System.err.println(interruptedException.getMessage());
        }
        this.semaphore.release();
    }
}
