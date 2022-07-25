package com.bilgeadam;

import sun.dc.pr.PRError;

public class Person extends Object{
    private String name;
    private int age;
    public final String SURNAME;
    private final String MAX_SALARY;

    public Person(){
        this.SURNAME = "";
        this.MAX_SALARY = "";
        System.out.println("Constructor Öğreniyorum.");
    }

    public Person(int age){
        this.age = age;
        this.MAX_SALARY = "";
        this.SURNAME = "";
    }

    public Person(String name){
        this.name = name;
        this.MAX_SALARY = "";
        this.SURNAME = "";
    }

    public Person(String name, int age, String surname){
        this.name = name;
        this.age = age;
        this.MAX_SALARY = "";
        this.SURNAME = surname;
    }

    @Override
    public String toString(){
        return this.name+this.age;
    }
}
