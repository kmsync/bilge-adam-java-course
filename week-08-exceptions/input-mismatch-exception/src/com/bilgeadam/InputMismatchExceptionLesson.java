package com.bilgeadam;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMismatchExceptionLesson {
    private Scanner scanner = new Scanner(System.in);

    public void getInputByUser(){
        boolean continueInput = true;

        do {
            try {
                System.out.print("Bir integer giriniz: ");
                int number = scanner.nextInt();

                System.out.println("Girmiş olduğunuz integer: "+number);
                continueInput = false;
            }catch (InputMismatchException e){
                String nl =  scanner.nextLine();
                System.out.println(nl);
            }
        } while (continueInput);
    }
}
