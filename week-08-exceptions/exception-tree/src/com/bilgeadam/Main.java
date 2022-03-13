package com.bilgeadam;

import java.io.IOException;

public class Main {

    public static void main(String[] args){
        Throwable throwable = new Throwable();

        Exception exception = new Exception();

        //Checked Exception
        ClassNotFoundException classNotFoundException = new ClassNotFoundException();
        IOException ioException = new IOException();

        //Unchecked Exception
        RuntimeException runtimeException = new RuntimeException();
        ArithmeticException arithmeticException = new ArithmeticException();
        NullPointerException nullPointerException = new NullPointerException();
        IndexOutOfBoundsException indexOutOfBoundsException = new IndexOutOfBoundsException();
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException();

        //Errors
        Error error = new Error();
        LinkageError linkageError = new LinkageError();
        VirtualMachineError virtualMachineError = new VirtualMachineError() {
            @Override
            public String getMessage() {
                return super.getMessage();
            }
        };

        try {
            throw new IOException("Bir hata oluştu.");
        }catch (IOException e){
            e.printStackTrace();
        }
        System.out.println("Kod başarılı bir şekilde sonlandı.");


    }
}
