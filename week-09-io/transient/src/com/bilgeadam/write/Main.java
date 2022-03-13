package com.bilgeadam.write;

import com.bilgeadam.User;

import java.io.*;
import java.util.UUID;

public class Main {

    public static void main(String[] args) {
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("user.bin"))){
            User user = new User(UUID.randomUUID().toString(),"burakgul","123456");
            System.out.println(user);
            objectOutputStream.writeObject(user);
        }catch (IOException ioException){
            System.err.println(ioException.getMessage());
        }
    }

}
