package com.bilgeadam;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(new BufferedReader(new FileReader("student.txt")))){
            while (scanner.hasNextLine()){
                String studentInfo = scanner.nextLine();
                String[] array = studentInfo.split(",");
                if(array[1].equals("Bilgisayar Mühendisliği")){
                    System.out.println("Öğrenci Bilgisi: "+studentInfo);
                }
            }
        }catch (IOException ioException){
            System.err.println(ioException.getMessage());
        }
    }
}
