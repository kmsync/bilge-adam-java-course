package com.bilgeadam.thread5.threads;

import com.bilgeadam.thread5.io.NameReader;

import java.io.IOException;

public class NameThread extends Thread{
    @Override
    public void run(){
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try (NameReader nameReader = new NameReader()) {
            // System.out.println("Adınız: " + scanner.nextLine());
            System.out.println("Adınız: " + nameReader.readName());
        }catch (IOException ioException){
            System.err.println(ioException.getMessage());
        }

    }
}
