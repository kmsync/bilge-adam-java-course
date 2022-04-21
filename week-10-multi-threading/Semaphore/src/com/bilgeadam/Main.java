package com.bilgeadam;

import com.bilgeadam.concurrency.MySemaphore;

import java.util.concurrent.Semaphore;

public class Main {

    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(1,true);

        MySemaphore semaphore1 = new MySemaphore(semaphore,"Incrementor1", true);

        MySemaphore semaphore3 = new MySemaphore(semaphore,"Incrementor2", true);

        MySemaphore semaphore2 = new MySemaphore(semaphore, "Decrementor1", false);

        MySemaphore semaphore4 = new MySemaphore(semaphore, "Decrementor2", false);

        semaphore1.start();
        semaphore2.start();
        semaphore3.start();
        semaphore4.start();

        try {
            semaphore1.join();
            semaphore2.join();
            semaphore3.join();
            semaphore4.join();
        }catch (InterruptedException interruptedException){
            System.err.println(interruptedException.getMessage());
        }

        System.out.println("Main thread sonlandı.");
    }
}
