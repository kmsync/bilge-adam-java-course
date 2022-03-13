package com.bilgeadam.serialization1.manager;

import com.bilgeadam.serialization1.model.Person;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class ObjectStreamManager {

    public ArrayList<Person> readObject(){

        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("person.bin"))){
            ArrayList<Person> people = new ArrayList<>();
            Person person3 = (Person) objectInputStream.readObject();
            Person person4 = (Person) objectInputStream.readObject();
            people.add(person3);
            people.add(person4);
            return people;
        }catch (IOException | ClassNotFoundException e){
            System.err.println(e.getMessage());
            return new ArrayList<>();
        }

    }

    public void writeObject(Person person1, Person person2){
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("person.bin"))){
            objectOutputStream.writeObject(person1);
            objectOutputStream.writeObject(person2);
        }catch (IOException ioException){
            System.err.println(ioException.getMessage());
        }
    }
}
