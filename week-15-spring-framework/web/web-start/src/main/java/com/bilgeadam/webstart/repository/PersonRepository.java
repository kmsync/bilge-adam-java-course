package com.bilgeadam.webstart.repository;

import com.bilgeadam.webstart.model.entity.Person;

import java.util.List;

public interface PersonRepository {

    List<Person> save(Person person);
    List<Person> findAll();
    Person update(Person person);
}
