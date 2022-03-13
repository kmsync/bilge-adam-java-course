package com.bilgeadam.read;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Main {
    public static void main(String[] args){
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("user.bin"))){
            System.out.println(objectInputStream.readObject());
        }catch (IOException | ClassNotFoundException exception){
            System.err.println(exception.getMessage());
        }
    }
}
