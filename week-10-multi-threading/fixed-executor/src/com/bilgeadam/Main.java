package com.bilgeadam;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) {

        Semaphore semaphore = new Semaphore(1, true);

        ExecutorService executorService = Executors.newFixedThreadPool(2);

        for (int i = 0; i < 100_000_000; i++) {
            executorService.submit(new IncrementSemaphore(semaphore));
            executorService.submit(new Worker("t" + (i + 1)));
        }
        executorService.shutdown();
        try {
            executorService.awaitTermination(1, TimeUnit.DAYS);
        } catch (InterruptedException interruptedException) {
            System.err.println(interruptedException.getMessage());
        }
        System.out.println("Toplam değer: "+ SharedContext.getValue());
        System.out.println("Bütün işler tamamlandı.");

        /*Thread t1 = new Thread(new Worker("t1", 1));
        Thread t2 = new Thread(new Worker("t2", 2));
        Thread t3 = new Thread(new Worker("t3", 3));
        Thread t4 = new Thread(new Worker("t4", 4));
        Thread t5 = new Thread(new Worker("t5", 5));
        Thread t6 = new Thread(new Worker("t6", 6));
        Thread t7 = new Thread(new Worker("t7", 7));

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        }catch (InterruptedException interruptedException){
            System.err.println(interruptedException.getMessage());
        }

        t3.start();
        t4.start();

        try{
            t3.join();
            t4.join();
        }catch (InterruptedException interruptedException){
            System.err.println(interruptedException.getMessage());
        }

        t5.start();
        t6.start();

        try{
            t5.join();
            t6.join();
        }catch (InterruptedException interruptedException){
            System.err.println(interruptedException.getMessage());
        }

        t7.start();

        try {
            t7.join();
        }catch (InterruptedException interruptedException){
            System.err.println(interruptedException.getMessage());
        }*/

        System.out.println("Main thread tamamlandı.");
    }
}
