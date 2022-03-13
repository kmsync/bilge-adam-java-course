package com.bilgeadam.serialization2.model;

import java.io.Serializable;

public class Person implements Serializable {

    public Person(String name, int age,boolean isAlive){
        this.name = name;
        this.age = age;
        this.isAlive = isAlive;
    }

    private static final long serialVersionUID = 1001;

    private String name;
    private int age;
    private boolean isAlive;


    @Override
    public String toString(){
        return "İsim: "+ name + "\n"+
                "Yaş: "+ age + "\n"+
                "Yaşıyor Mu?" + isAlive;
    }
}
