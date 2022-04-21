package com.bilgeadam.threads;

import com.bilgeadam.util.DateUtil;

public class MyThread extends Thread{
    private final Object lock;

    public MyThread(Object lock){
        this.lock = lock;
    }

    @Override
    public void run(){
        while (true){
            if(DateUtil.afterFromNowDate("2022/04/03 14:11:05")){
                synchronized (lock){
                    lock.notify();
                }
                break;
            }
        }

    }
}
