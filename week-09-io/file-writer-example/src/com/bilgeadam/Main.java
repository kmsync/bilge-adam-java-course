package com.bilgeadam;

import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        FileWriter fileWriter = null;

        try {
            fileWriter = new FileWriter("file.txt", true);
            long startDateTime = System.currentTimeMillis();
            fileWriter.write("Merhaba\nBenim adım Burak GÜL.\n FileWriter sınıfının write metodunu test ediyorum.");
            System.out.println(System.currentTimeMillis()-startDateTime);
        } catch (IOException ioException) {
            System.out.println(ioException.getMessage());
        } finally {
            try {
                if (fileWriter != null) fileWriter.close();
            } catch (IOException ioException) {
                System.out.println(ioException.getMessage());
            }
        }
    }
}
