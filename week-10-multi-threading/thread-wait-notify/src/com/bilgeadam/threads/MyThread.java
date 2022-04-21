package com.bilgeadam.threads;

import com.bilgeadam.generator.MessageGenerator;

public class MyThread extends Thread{

    private final MessageGenerator messageGenerator;

    public MyThread(String name, MessageGenerator messageGenerator){
        super(name);
        this.messageGenerator = messageGenerator;
    }

    @Override
    public void run(){
        System.out.println(this.getName() + " is starting.");

        // Tick thread
        if(this.getName().equals("Tick")){
            for(int i = 0; i < 5 ; i++){
                messageGenerator.tick(true);
            }
            messageGenerator.tick(false);
        }
        // Tock thread
        else {
            for(int i = 0; i < 5 ; i++){
                messageGenerator.tock(true);
            }
            messageGenerator.tock(false);
        }

        System.out.println(this.getName()+ " is finishing.");
    }
}
