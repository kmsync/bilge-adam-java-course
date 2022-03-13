package com.bilgeadam;

import java.io.IOException;

public class InputOutput {

    public void throwIOException() throws IOException{
        System.out.println("Metot yürütülmeye başladı.");
        throw new IOException();
    }

    public void showHeapSize(){
        System.out.println(Runtime.getRuntime().availableProcessors());
    }
}
