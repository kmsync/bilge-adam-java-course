package com.bilgeadam.runnable;

import java.util.Date;

public class Task implements Runnable {

    private String name;

    public Task(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    @Override
    public void run(){
        System.out.println("İş yürütülüyor. İş adı - "+name+" Tarih - " + new Date(System.currentTimeMillis()));
    }
}
