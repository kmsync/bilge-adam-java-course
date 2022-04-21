package com.bilgeadam;

import java.util.concurrent.Semaphore;

public class DecrementSemaphore implements Runnable {

    private Semaphore semaphore;

    public DecrementSemaphore(Semaphore semaphore) {
        this.semaphore = semaphore;
    }

    @Override
    public void run() {
        try {
            this.semaphore.acquire();
            for (int i = 0; i < 5; i++) {
                System.out.println(SharedContext.decrementAndGet());
            }
        } catch (InterruptedException interruptedException) {
            System.err.println(interruptedException.getMessage());
        }

        this.semaphore.release();
    }
}
