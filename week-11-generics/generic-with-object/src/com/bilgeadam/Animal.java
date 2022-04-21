package com.bilgeadam;

public class Animal extends Object{

    public Animal(String type){
        this.type = type;
    }

    private String type;

    @Override
    public String toString(){
        return "Type: " + type;
    }

    public boolean isAlive(){
        return true;
    }
}
