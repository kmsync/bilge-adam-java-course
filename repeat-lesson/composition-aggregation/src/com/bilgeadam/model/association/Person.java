package com.bilgeadam.model.association;

public class Person {

    private String name, surname;

    public Person(String name, String surname){
        this.name = name;
        this.surname = surname;
    }

    @Override
    public String toString(){
        return this.name + " " + this.surname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }
}
