package com.bilgeadam;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        InputOutput inputOutput = new InputOutput();
        inputOutput.showHeapSize();
        try{
            inputOutput.throwIOException();
            System.out.println("try bloğu başarılı bir şekilde çalıştı.");
        }catch (IOException ioException){
            ioException.printStackTrace();
        }
        inputOutput.showHeapSize();
        System.out.println("Program başarılı bir şekilde sonlandı.");
    }
}
