package com.bilgeadam;

import com.bilgeadam.generator.MessageGenerator;
import com.bilgeadam.threads.MyThread;

public class Main {

    public static void main(String[] args) {
        MessageGenerator messageGenerator = new MessageGenerator();

        MyThread thread1 = new MyThread("Tick",messageGenerator);
        MyThread thread2 = new MyThread("Tock", messageGenerator);

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        }catch (InterruptedException interruptedException){
            System.err.println(interruptedException.getMessage());
        }

        System.out.println("Main thread bitti.");
    }
}
