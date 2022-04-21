package com.bilgeadam;

public class Worker implements Runnable {
    private String name;

    public Worker(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println("Worker " + name + " işe başladı.");
        System.out.println("Worker " + name + " işi bitirdi.");
    }
}
