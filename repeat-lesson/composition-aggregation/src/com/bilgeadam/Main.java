package com.bilgeadam;

import com.bilgeadam.model.aggreagation.Classroom;
import com.bilgeadam.model.aggreagation.Student;
import com.bilgeadam.model.association.Person;
import com.bilgeadam.model.association.PersonManager;
import com.bilgeadam.model.comkposition.House;

public class Main {

    public static void main(String[] args) {
        //Aggregation

        Student student = new Student("Burak", "GÜL");

        Classroom classroom = new Classroom(student);

        System.out.println(classroom);

        classroom = null;

        System.out.println(student);

        //Composition

        House house = new House();

        System.out.println(house);

        //Association

        Person person = new Person("asd", "asd");

        PersonManager personManager = new PersonManager();

        personManager.printPersonInformation(person);

        // this.a();
    }

    public static void a() {

    }
}
