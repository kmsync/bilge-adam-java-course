package com.bilgeadam.thread5.io;

import java.io.BufferedReader;
import java.io.Closeable;
import java.io.FileReader;
import java.io.IOException;

public class NameReader implements Closeable {
    public final BufferedReader fileReader;

    public NameReader() throws IOException{
        this.fileReader = new BufferedReader(new FileReader("name.txt"));
    }

    public String readName(){
        try {
            return this.fileReader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "Exception Oluştu.";
    }

    @Override
    public void close() throws IOException {
        this.fileReader.close();
    }
}
