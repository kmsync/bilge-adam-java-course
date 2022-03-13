package com.bilgeadam.io;

import com.bilgeadam.model.entity.Task;

import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

public class LogWriter implements Closeable {
    private final BufferedWriter bufferedWriter;

    public LogWriter() throws IOException{
        this.bufferedWriter = new BufferedWriter(new FileWriter("info.log",true));
    }

    public void write(Task task) throws IOException{
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder
                .append("[")
                .append(new Date(System.currentTimeMillis()))
                .append("] ")
                .append(task.getId())
                .append(" id'li task kaydedildi.");
        this.bufferedWriter.write(stringBuilder.toString()+"\n");
    }

    public void write(String infoMessage) throws IOException{
        this.bufferedWriter.write(infoMessage+"\n");
    }

    @Override
    public void close() throws IOException {
        bufferedWriter.close();
    }
}
