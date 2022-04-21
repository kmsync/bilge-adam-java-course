package com.bilgeadam.runnable;

public class DemoRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i< 5 ; i++){
            System.out.println(i);
        }
    }
}
