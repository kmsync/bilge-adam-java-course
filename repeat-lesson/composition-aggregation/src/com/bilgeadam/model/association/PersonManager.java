package com.bilgeadam.model.association;

public class PersonManager {

    private Person person;

    public void setPerson(Person person) {
        this.person = person;
    }

    public void printPersonInformation(){
        System.out.println(this.person.getName() + " " + this.person.getSurname());
    }
}
