package com.bilgeadam.thread5;

import com.bilgeadam.thread5.threads.KeywordRunnable;
import com.bilgeadam.thread5.threads.NameThread;

public class Main {

    public static void main(String[] args){
        NameThread nameThread = new NameThread();
        Thread thread = new Thread(new KeywordRunnable());

        nameThread.start();
        thread.start();
    }
}
