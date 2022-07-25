package com.bilgeadam.webstart.model.dto;

import com.bilgeadam.webstart.model.entity.Person;

public class PersonResponse {

    public PersonResponse(Person person){
        this.id = person.getId();
        this.name = person.getName();
        this.surname = person.getSurname();
        this.socialSecurityNumber = person.getSocialSecurityNumber();
    }

    private Integer id;
    private String name;
    private String surname;
    private Integer socialSecurityNumber;

    public Integer getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSocialSecurityNumber(Integer socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }
}
