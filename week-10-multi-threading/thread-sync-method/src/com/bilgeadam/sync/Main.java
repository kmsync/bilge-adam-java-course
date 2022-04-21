package com.bilgeadam.sync;

import com.bilgeadam.sync.threads.Thread1;
import com.bilgeadam.sync.threads.Thread2;

public class Main {

    public static void main(String[] args){
        NumberIncreaser numberIncreaser = new NumberIncreaser();
        Thread1 thread1 = new Thread1(numberIncreaser);
        Thread2 thread2 = new Thread2(numberIncreaser);

        thread1.start();
        thread2.start();
    }
}
