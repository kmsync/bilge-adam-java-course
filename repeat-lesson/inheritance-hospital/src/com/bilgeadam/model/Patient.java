package com.bilgeadam.model;

public class Patient extends Person{

    public Patient(String name, String surname){
        //System.out.println("dsaasdasd");
        super(name,surname);
    }

    public void printName(){
        super.getName();
    }

    @Override
    public void setName(String name){
        System.out.println(name);
    }

    @Override
    public SpecificName getName() {
        return new SpecificName("");
    }
}
