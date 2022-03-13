package com.bilgeadam.io;

import com.bilgeadam.model.entity.Task;

import java.io.Closeable;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Date;
import java.util.List;

public class TaskReader implements Closeable {
    private final ObjectInputStream objectInputStream;

    public TaskReader() throws IOException{
        this.objectInputStream = new ObjectInputStream(new FileInputStream("tasks.bin"));
    }

    public List<Task> readObject() throws IOException, ClassNotFoundException {
        return (List<Task>) this.objectInputStream.readObject();
    }

    @Override
    public void close() throws IOException {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder
                .append("[")
                .append(new Date(System.currentTimeMillis()))
                .append("] ")
                .append("obje okuma işlemi başarılı.");
        try (LogWriter logWriter = new LogWriter()) {
            logWriter.write(stringBuilder.toString());
        } catch (IOException ioException) {
            try (ErrorWriter errorWriter = new ErrorWriter()) {
                errorWriter.write(ioException);
            } catch (IOException ioException1) {
                System.err.println(ioException.getMessage() + ioException1.getMessage());
            }
        }
        this.objectInputStream.close();
    }
}
