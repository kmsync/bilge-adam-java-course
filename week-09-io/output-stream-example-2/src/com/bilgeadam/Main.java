package com.bilgeadam;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;

public class Main {

    public static void main(String[] args) {
        //File file = new File("file.txt");
        OutputStream outputStream = null;
        try {
            outputStream = new FileOutputStream("file.txt", true);
            try {
                outputStream.write(65);

                String name = "Burak GÜL";
                byte[] nameBytes = name.getBytes(StandardCharsets.UTF_8);
                outputStream.write(nameBytes);
            } catch (IOException ioException) {
                System.out.println("Hatalı giriş.");
            }
        } catch (FileNotFoundException fileNotFoundException) {
            System.out.println("File bulunamadı.");
        } finally {
            try {
                if (outputStream != null) outputStream.close();
                //outputStream.write(65);
            } catch (IOException ioException) {
                System.out.println("Stream kapatıldı. {" + ioException.getMessage() + "}");
            }


        }
    }
}
