package com.bilgeadam.thread1;

public class Printer extends Thread {

    public Printer(String name){
        this.name = name;
    }

    private String name;

    @Override
    public void run(){
        long startTime = System.currentTimeMillis();
        try {
            System.out.println(name + " çalışmaya başladı.");

            for(int index = 0 ; index < 10 ; index++){
                System.out.println(name+" "+index);
                Thread.sleep(1000);
            }
        }catch (InterruptedException interruptedException){
            System.err.println(interruptedException.getMessage());
        }
        System.out.println("Bitiş süresi: "+(System.currentTimeMillis() - startTime));
    }
}
