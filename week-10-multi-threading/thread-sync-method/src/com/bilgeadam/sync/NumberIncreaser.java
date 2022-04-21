package com.bilgeadam.sync;

import com.bilgeadam.sync.model.DoubleStore;
import com.bilgeadam.sync.model.IntegerStore;

public class NumberIncreaser {

    private final DoubleStore lock1 = new DoubleStore();
    private final IntegerStore lock2 = new IntegerStore();

    public void increaseInteger() {
        synchronized (lock2) {
            try {
                Thread.sleep(2);
            } catch (InterruptedException e) {
                System.err.println(e.getMessage());
            }
            for (int i = 0; i < 1_000_000; i++) {

                lock2.setBasicInt(lock2.getBasicInt() + 1);
            }
            System.out.println(lock2.getBasicInt());
        }
    }

    public void asyncIncreaseInteger() {
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            for (int i = 0; i < 1_000_000; i++) {

                lock2.setBasicInt(lock2.getBasicInt() + 1);
            }
            System.out.println(lock2.getBasicInt());
    }
}
