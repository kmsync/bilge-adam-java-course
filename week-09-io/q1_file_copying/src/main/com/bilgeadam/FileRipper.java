package com.bilgeadam;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.LinkedList;

//TODO bu sınıfın her seferinde readFile metodunu çalıştırmasıyla contentin üzerine yazılmamasını sağlayınız. fileRipper 2 kere çağrılsa ne olacak?
public class FileRipper {
    private final LinkedList<Integer> content = new LinkedList<>();

    public void readFile(String fileName){
        InputStream inputStream = null;
        try{
            inputStream = new FileInputStream(fileName);

            int value;

            while ((value = inputStream.read()) != -1){
                this.content.add(value);
            }
        }catch (IOException ioException){
            System.out.println("Okuma hatası.");
        }finally {
            try{
                if(inputStream != null) inputStream.close();
            }catch (IOException ioException){
                System.out.println("stream zaten kapatıldı.");
            }
        }
    }

    public void copyFile(String fileName){
        FileOutputStream outputStream = null;

        try {
            outputStream = new FileOutputStream(fileName);

            for(int value : this.content){
                outputStream.write(value);
            }

        }catch (IOException ioException){
            System.out.println(ioException.getMessage());
        }
    }
}
