package com.bilgeadam.webstart.model.entity;

import com.bilgeadam.webstart.model.dto.PersonRequest;

public class Person {
    private Integer id;
    private String name;
    private String surname;
    private Integer socialSecurityNumber;

    public Person(Integer id){
        this.id = id;
    }

    public Person(){

    }

    public Person(PersonRequest personRequest){
        this.id = personRequest.getId();
        this.name = personRequest.getName();
        this.surname = personRequest.getSurname();
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Integer getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(Integer socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
