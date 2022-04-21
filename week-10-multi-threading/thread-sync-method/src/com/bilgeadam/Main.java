package com.bilgeadam;

import com.bilgeadam.threads.Thread1;
import com.bilgeadam.threads.Thread2;

public class Main {

    public static void main(String[] args) {
        ArrayOperations arrayOperations = new ArrayOperations();
        Thread1 thread1 = new Thread1(arrayOperations);
        Thread2 thread2 = new Thread2(arrayOperations);

        thread1.start();
        thread2.start();
    }
}
