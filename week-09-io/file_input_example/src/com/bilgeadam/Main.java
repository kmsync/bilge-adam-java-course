package com.bilgeadam;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Main {

    public static void main(String[] args) {
        InputStream inputStream = null;

        try {
            inputStream = new FileInputStream("file.txt");

            /*int aCharInt = inputStream.read();
            System.out.println(aCharInt);
            System.out.println((char) aCharInt);*/

            int value;

            String loremIpsumText = "";

            int index = 0;

            inputStream.skip(57);

            while ((value = inputStream.read()) != -1 && index < 81) {
                loremIpsumText += (char) value;

                index++;
            }

            System.out.println(loremIpsumText);

        }catch (IOException fileNotFoundException){
            System.out.println(fileNotFoundException.getMessage());
        }
    }
}
