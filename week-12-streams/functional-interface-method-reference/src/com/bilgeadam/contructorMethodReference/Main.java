package com.bilgeadam.contructorMethodReference;

public class Main {

    static Person newPersonInstance(PersonFunction personFunction, String name, String surname){
        return personFunction.apply(name,surname);
    }

    public static void main(String[] args) {
        Person person = newPersonInstance(Person::new,"Burak","Gül");
        System.out.println(person);
    }
}
