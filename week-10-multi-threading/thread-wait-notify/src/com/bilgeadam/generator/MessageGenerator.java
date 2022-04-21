package com.bilgeadam.generator;

public class MessageGenerator {

    private String state;

    public synchronized void tick(boolean running){
        if(!running){
            state = "ticked";
            notify();
            return;
        }
        System.out.println("Tick ");
        state = "ticked";
        notify();

        try {
            while (!state.equals("tocked")){
                wait();
            }
        }catch (InterruptedException interruptedException){
            System.err.println(interruptedException.getMessage());
        }
    }

    public synchronized void tock(boolean running){
        if(!running){
            state = "tocked";
            notify();
            return;
        }

        System.out.println("tock");
        state = "tocked";
        notify();

        try {
            while (!state.equals("ticked")){
                wait();
            }
        }catch (InterruptedException interruptedException){
            System.out.println(interruptedException.getMessage());
        }
    }
}
