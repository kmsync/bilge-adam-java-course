package com.bilgeadam;

import java.util.ArrayList;
import java.util.Date;

public class ArrayOperations {

    private final Object lock1 = new Object();
    private final ArrayList<Integer> lock2 = new ArrayList<>();

    private int sum = 0;

    // 10.18 0 ----> Thread1 ----> 1  10.19
    // 10.18 0 ----> Thread2 ----> 1  10.19

    //Sonuçta sum 1 10.19



    /*public synchronized int sum(int[] array){
        System.out.println("Thread Name: " + Thread.currentThread().getName() + " Date: " + new Date(System.currentTimeMillis()));

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            System.err.println(e.getMessage());
        }

        *//*Object lock1 = new Object();
        Object lock2 = new ArrayList<>();
        Object lock3 = new HashMap<>();

        // Thread 1  10.22 Thread 2 10.23

        synchronized (lock1){
            sum += 1;
        }

        synchronized (lock2){
            sum += 1;
        }

        synchronized (lock3){
            sum += 1;
        }*//*

        for(int value: array){
            sum += value;
            System.out.println("Toplam: "+sum + " Thread Name: " + Thread.currentThread().getName());

            try{
                Thread.sleep(10);
            }catch (InterruptedException interruptedException){
                System.err.println(interruptedException.getMessage());
            }
        }
        return sum;
    }*/

    public int sum(int[] array){
        synchronized (lock1){
            System.out.println("Thread Name: " + Thread.currentThread().getName() + " Date: " + new Date(System.currentTimeMillis()));

            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                System.err.println(e.getMessage());
            }

            for(int value: array){
                sum += value;
                System.out.println("Toplam: "+sum + " Thread Name: " + Thread.currentThread().getName());

                try{
                    Thread.sleep(10);
                }catch (InterruptedException interruptedException){
                    System.err.println(interruptedException.getMessage());
                }
            }
            return sum;
        }
    }

    /*public synchronized int getSum(){
        System.out.println("Thread Name: " + Thread.currentThread().getName() + " Date: " + new Date(System.currentTimeMillis()));
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.err.println(e.getMessage());
        }
        return sum;
    }*/

    public int getSum(){
        synchronized (lock1){
            System.out.println("Thread Name: " + Thread.currentThread().getName() + " Date: " + new Date(System.currentTimeMillis()));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.err.println(e.getMessage());
            }
            return sum;
        }
    }
}
