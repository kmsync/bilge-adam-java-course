package com.bilgeadam.variableCapture5;

public class Person {

    public Person(String name, String surname){
        this.name = name;
        this.surname = surname;
    }

    private String name;
    private String surname;

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}
