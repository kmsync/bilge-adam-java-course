package com.bilgeadam.model.aggreagation;

public class Student {
    private String name,surname;

    public Student(String name, String surname){
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }
}
