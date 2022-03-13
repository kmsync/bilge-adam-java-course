package com.bilgeadam.bufferedWriter;

import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
  
   public static void main(String[] args) {
        try {
            FileWriter fileWriter = new FileWriter("student.txt");
            String studentInfo1 = "Ahmet Ağılkaya,Bilgisayar Mühendisliği";
            fileWriter.write(studentInfo1);
            Thread.sleep(5000);
            fileWriter.close();
            FileReader fileReader = new FileReader("student.txt");
            System.out.println(fileReader.read());
            fileReader.close();
            /*String studentInfo2 = "Ahmet Ağılkaya,Bilgisayar Mühendisliği";
            fileWriter.write(studentInfo2);
            String studentInfo3 = "Ahmet Ağılkaya,Bilgisayar Mühendisliği";
            fileWriter.write(studentInfo3);
            String studentInfo4 = "Ahmet Ağılkaya,Bilgisayar Mühendisliği";
            fileWriter.write(studentInfo4);
            String studentInfo5 = "Ahmet Ağılkaya,Bilgisayar Mühendisliği";
            fileWriter.write(studentInfo5);*/
        } catch (IOException ioException) {
            System.err.println(ioException.getMessage());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("student2.txt"));

            String studentInfo1 = "Ahmet Ağılkaya,Bilgisayar Mühendisliği";
            bufferedWriter.write(studentInfo1);
            Thread.sleep(5000);
            bufferedWriter.close();
            try (FileReader fileReader = new FileReader("student.txt");) {
                System.out.println(fileReader.read());
            }catch (IOException ioException){
                System.err.println(ioException.getMessage());
            }
           /* String studentInfo2 = "Ahmet Ağılkaya,Bilgisayar Mühendisliği";
            bufferedWriter.write(studentInfo2);
            String studentInfo3 = "Ahmet Ağılkaya,Bilgisayar Mühendisliği";
            bufferedWriter.write(studentInfo3);
            String studentInfo4 = "Ahmet Ağılkaya,Bilgisayar Mühendisliği";
            bufferedWriter.write(studentInfo4);
            String studentInfo5 = "Ahmet Ağılkaya,Bilgisayar Mühendisliği";
            bufferedWriter.write(studentInfo5);*/
        } catch (IOException ioException) {
            System.err.println(ioException.getMessage());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
}
