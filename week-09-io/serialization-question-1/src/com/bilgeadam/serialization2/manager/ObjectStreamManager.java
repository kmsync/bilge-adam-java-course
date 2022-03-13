package com.bilgeadam.serialization2.manager;

import com.bilgeadam.serialization2.model.Person;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectStreamManager {

    private final ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("person-2.bin"));
    private final ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("person-2.bin"));

    public ObjectStreamManager() throws IOException {

    }

    public Person readObject(){

        try {
            Person person =(Person) this.objectInputStream.readObject();
            return person;
        }catch (IOException | ClassNotFoundException e){
            System.err.println(e.getMessage());
            return null;
        }
    }

    public void writeObject(Person person){
        try{
            this.objectOutputStream.writeObject(person);
        }catch (IOException ioException){
            System.err.println(ioException.getMessage());
        }
    }

    public void closeOutputStream(){
        try {
            this.objectOutputStream.close();
        }catch (IOException ioException){
            System.err.println(ioException.getMessage());
        }
    }

    public void closeInputStream(){
        try {
            this.objectInputStream.close();
        }catch (IOException ioException){
            System.err.println(ioException.getMessage());
        }
    }
}
