package com.bilgeadam.editor;

import java.io.Closeable;
import java.io.FileWriter;
import java.io.IOException;

public class TextEditor implements Closeable {
    private FileWriter fileWriter;

    public TextEditor(String fileName, boolean append) throws IOException {
        this.fileWriter = new FileWriter(fileName,append);
    }

    @Override
    public void close() throws IOException {
        if(this.fileWriter != null) this.fileWriter.close();
    }

    public void write(String a) throws IOException {
        fileWriter.write(a);
    }
}
