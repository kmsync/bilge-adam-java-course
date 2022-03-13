package com.bilgeadam;

import com.bilgeadam.editor.TextEditor;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        while (true){
            TextEditor textEditor = null;
            Scanner scanner = new Scanner(System.in);
            System.out.print("Dosyanın içeriğini tutmak istiyor musunuz? (Evet/Hayır) Girdi: ");
            String keepFileContent = scanner.nextLine();
            System.out.print("Dosya eklemek istediğiniz içeriği yazınız: ");
            String content = scanner.nextLine();
            try{
                if(keepFileContent.equals("Evet")){
                    textEditor = new TextEditor("file.txt",true);
                }else {
                    textEditor = new TextEditor("file.txt",false);
                }
                textEditor.write(content);

            }catch (IOException e){
                System.err.println(e.getMessage());
            }finally {
                try {
                    if(textEditor != null) textEditor.close();
                }catch (IOException ioException){
                    System.err.println(ioException.getMessage());
                }
            }
            System.out.println("Çıkış yapmak için -1 giriniz.");
            if(scanner.nextInt() == -1){
                break;
            }
        }
    }
}
