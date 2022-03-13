package com.bilgeadam.io;

import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

public class ErrorWriter implements Closeable {

    private final BufferedWriter bufferedWriter;

    public ErrorWriter() throws IOException{
        bufferedWriter = new BufferedWriter(new FileWriter("error.log",true));
    }

    public void write(Throwable throwable) throws IOException{
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder
                .append("[")
                .append(throwable.toString())
                .append("] ")
                .append(new Date(System.currentTimeMillis()))
                .append(" ").append(throwable.getMessage())
                .append("\n");
        bufferedWriter.write(stringBuilder.toString());
    }

    @Override
    public void close() throws IOException {
        bufferedWriter.close();
    }
}
