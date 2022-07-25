package com.bilgeadam.webstart.service;

import com.bilgeadam.webstart.model.dto.PersonRequest;
import com.bilgeadam.webstart.model.dto.PersonResponse;
import com.bilgeadam.webstart.model.entity.Person;
import com.bilgeadam.webstart.repository.PersonRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Service
public class PersonService {

    private final PersonRepository personRepository;

    public PersonService(PersonRepository personRepository){
        this.personRepository = personRepository;
    }


    public List<PersonResponse> save(List<PersonRequest> personRequests){
        List<PersonResponse> personResponses = new ArrayList<>();
        for(PersonRequest personRequest : personRequests){
            Person person = new Person(new Random().nextInt(1000));
            person.setName(personRequest.getName());
            person.setSurname(personRequest.getSurname());
            person.setSocialSecurityNumber(new Random().nextInt());
            this.personRepository.save(person);

            PersonResponse personResponse = new PersonResponse(person);

            personResponses.add(personResponse);
        }
        return personResponses;
    }

    public List<PersonResponse> findAll() {
        List<PersonResponse> personResponses = new ArrayList<>();
        for(Person person : this.personRepository.findAll()){
            PersonResponse personResponse = new PersonResponse(person);
            personResponses.add(personResponse);
        }
        return personResponses;
    }

    public PersonResponse update(PersonRequest personRequest){
        Person person = new Person(personRequest);
        Person updatedPerson = this.personRepository.update(person);
        return new PersonResponse(updatedPerson);
    }
}
