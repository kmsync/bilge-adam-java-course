package com.bilgeadam.serialization2;

import com.bilgeadam.serialization2.manager.ObjectStreamManager;
import com.bilgeadam.serialization2.model.Person;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        try {
            ObjectStreamManager objectStreamManager = new ObjectStreamManager();

            Person person1 = new Person("Burak",30,true);
            Person person2 = new Person("Duman",30,true);
            objectStreamManager.writeObject(person1);
            objectStreamManager.writeObject(person2);

            objectStreamManager.closeOutputStream();

            Person person3 = (Person) objectStreamManager.readObject();
            Person person4 = (Person) objectStreamManager.readObject();

            objectStreamManager.closeInputStream();


            System.out.println("Person 1"+person1);
            System.out.println("Person 2"+person2);
            System.out.println("Person 3"+person3);
            System.out.println("Person 4"+person4);


        }catch (IOException ioException){
            System.err.println(ioException.getMessage());
        }

    }
}
