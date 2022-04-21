package com.bilgeadam;

public class Person {

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    private String name;
    private String surname;
    private int age;

    @Override
    public String toString() {
        return "Name: " + name + System.lineSeparator() + "Surname: " + surname + System.lineSeparator() + "Age: " + age;
    }

    public int getSalary(){
        return 15000;
    }
}
