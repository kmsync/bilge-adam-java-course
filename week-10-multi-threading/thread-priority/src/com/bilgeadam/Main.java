package com.bilgeadam;

import com.bilgeadam.threads.MyThread;

public class Main {

    public static void main(String[] args) {
        MyThread[] threads = new MyThread[30];

        // int[] integers = new int[30];

        for (int i = 0 ; i < threads.length ; i++){
            threads[i] = new MyThread();
            if(i < 10){
                threads[i].setPriority(Thread.MAX_PRIORITY);
            } else if(i < 20){
                threads[i].setPriority(Thread.NORM_PRIORITY);
            } else {
                threads[i].setPriority(Thread.MIN_PRIORITY);
            }
        }

        for(Thread thread : threads){
            thread.start();

        }

        for(Thread thread : threads){
            try {
                thread.join();
            }catch (InterruptedException interruptedException){
                System.err.println(interruptedException.getMessage());
            }
        }


        System.out.println("Main thread sonlandı.");
    }
}
