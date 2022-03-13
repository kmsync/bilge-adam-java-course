package com.bilgeadam.serialization1;

import com.bilgeadam.serialization1.manager.ObjectStreamManager;
import com.bilgeadam.serialization1.model.Person;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args){

        ObjectStreamManager objectStreamManager = new ObjectStreamManager();

        objectStreamManager.writeObject(new Person("Burak",25,true,"GÜL"),new Person("Burak",33,true,"GÜL"));

        ArrayList<Person> people = objectStreamManager.readObject();

        for (Person person : people){
            System.out.println(person);
        }

    }
}
