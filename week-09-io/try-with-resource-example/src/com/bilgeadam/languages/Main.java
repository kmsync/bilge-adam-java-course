package com.bilgeadam.languages;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Dosyaya eklemek istediğiniz metin: ");
        String content = scanner.nextLine();


        try(FileWriter fileWriter = new FileWriter("file.txt",true)){
            fileWriter.write(content);
        }catch (IOException ioException){
            System.err.println(ioException.getMessage());
        }

    }
}
