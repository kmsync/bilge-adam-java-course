package com.bilgeadam.webstart.repository;

import com.bilgeadam.webstart.model.entity.Person;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class PersonRepositoryImpl implements PersonRepository{

    private final List<Person> persons = new ArrayList<>();

    @Override
    public List<Person> save(Person person) {
        this.persons.add(person);
        return persons;
    }

    @Override
    public List<Person> findAll() {
        return persons;
    }

    @Override
    public Person update(Person person) {
        int index = 0;
        for(Person person1:persons){
            if(person.getId().equals(person1.getId())){
                person.setSocialSecurityNumber(person1.getSocialSecurityNumber());
                index = persons.indexOf(person1);
                persons.add(person);
            }
            persons.remove(index);
        }
        return person;
    }
}
