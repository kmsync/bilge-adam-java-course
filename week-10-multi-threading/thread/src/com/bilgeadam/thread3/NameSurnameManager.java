package com.bilgeadam.thread3;

public class NameSurnameManager {

    public NameSurnameManager(String name, String surname){
        this.name = name;
        this.surname = surname;
    }

    private String name;
    private String surname;

    @Override
    public String toString(){
        return "Ad: " + name + " Soyad: " + surname;
    }
}
