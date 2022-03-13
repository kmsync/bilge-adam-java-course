package com.bilgeadam.thread2;

public class Printer implements Runnable{

    public Printer(String name){
        this.name = name;
    }

    private String name;

    @Override
    public void run() {
        try {
            System.out.println(name + " threadi çalıştı.");
            for(int index = 0 ; index < 10 ; index++){
                long startTime = System.currentTimeMillis();
                System.out.println(name + " " + index);
                System.out.println(name + " " + index + " numaralı döngüsü " + (System.currentTimeMillis() - startTime) + "sürede çalıştı.");
            }
            Thread.sleep(1000);
        }catch (InterruptedException interruptedException){
            System.err.println(interruptedException.getMessage());
        }
    }
}
