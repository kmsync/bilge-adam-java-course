package com.bilgeadam.io;

import com.bilgeadam.model.entity.Task;

import java.io.Closeable;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Date;
import java.util.List;

public class TaskWriter implements Closeable {
    private final ObjectOutputStream outputStream;

    public TaskWriter() throws IOException {
        this.outputStream = new ObjectOutputStream(new FileOutputStream("tasks.bin"));
    }

    public void writeObject(List<Task> tasks) throws IOException{
        outputStream.writeObject(tasks);
    }

    @Override
    public void close() throws IOException {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder
                .append("[")
                .append(new Date(System.currentTimeMillis()))
                .append("] ")
                .append("obje kayıt işlemi başarılı.");
        try (LogWriter logWriter = new LogWriter()) {
            logWriter.write(stringBuilder.toString());
        } catch (IOException ioException) {
            try (ErrorWriter errorWriter = new ErrorWriter()) {
                errorWriter.write(ioException);
            } catch (IOException ioException1) {
                System.err.println(ioException.getMessage() + ioException1.getMessage());
            }
        }
        outputStream.close();
    }
}
