package com.bilgeadam;

import java.io.*;

public class Main {

    public static void main(String[] args) {

        try (OutputStream outputStream = new FileOutputStream("info.log")){
            outputStream.write(65);
            outputStream.write(66);
        }catch (IOException ioException){
            System.err.println(ioException.getMessage());
        }
        InputStream inputStream = null;
        try{
             inputStream = new FileInputStream("info.log");
             int a = inputStream.read();
             int b = inputStream.read();
             int c = inputStream.read();
             char charA = (char) a;
            System.out.println(charA);
            System.out.println(b);
            System.out.println(c);
        }catch (IOException fileNotFoundException){
            System.err.println(fileNotFoundException.getMessage());
        }
        finally {
            if(inputStream != null){
                try {
                    inputStream.close();
                }catch (IOException ioException){
                    System.err.println(ioException.getMessage());
                }
            }
        }
    }
}
