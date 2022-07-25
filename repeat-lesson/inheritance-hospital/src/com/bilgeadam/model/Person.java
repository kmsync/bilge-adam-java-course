package com.bilgeadam.model;

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

    public Name getName() {
        return new Name(this.name);
    }

    public String getSurname() {
        return surname;
    }
}
