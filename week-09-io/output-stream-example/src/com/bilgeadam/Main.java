package com.bilgeadam;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class Main {

    public static void main(String[] args) {
        FileOutputStream fileOutputStream = null;
        File file = new File("file.txt");
        try {
            fileOutputStream = new FileOutputStream(file);
            long startDateTime = System.currentTimeMillis();
            fileOutputStream.write(66);
            fileOutputStream.write(85);
            fileOutputStream.write(82);
            fileOutputStream.write(65);
            fileOutputStream.write(75);
            fileOutputStream.write(33);
            fileOutputStream.write(33);

            String name = "Burak GÜL";
            System.out.println(name);
            byte[] nameByteArray = name.getBytes(StandardCharsets.UTF_8);
            fileOutputStream.write(nameByteArray);
            System.out.println(System.currentTimeMillis()-startDateTime);
        }catch (FileNotFoundException fileNotFoundException){
            System.out.println(fileNotFoundException.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            try{
                fileOutputStream.close();
            }catch (IOException ioException){
                System.out.println(ioException.getMessage());
            }
        }
    }
}
