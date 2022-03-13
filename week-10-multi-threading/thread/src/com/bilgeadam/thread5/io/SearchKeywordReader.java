package com.bilgeadam.thread5.io;

import java.io.BufferedReader;
import java.io.Closeable;
import java.io.FileReader;
import java.io.IOException;

public class SearchKeywordReader implements Closeable {
    private final BufferedReader bufferedReader;

    public SearchKeywordReader() throws IOException {
        this.bufferedReader = new BufferedReader(
                new FileReader("search-keyword.txt"));
    }

    public String readSearchKeyword(){
        try {
            return this.bufferedReader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "Hata oluştu.";
    }

    @Override
    public void close() throws IOException {
        this.bufferedReader.close();
    }
}
