package com.bilgeadam.webstart.controller;

import com.bilgeadam.webstart.model.dto.PersonRequest;
import com.bilgeadam.webstart.model.dto.PersonResponse;
import com.bilgeadam.webstart.model.entity.Person;
import com.bilgeadam.webstart.service.PersonService;
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/persons")
public class PersonController {

    private final PersonService personService;

    public PersonController(PersonService personService){
        this.personService = personService;
    }

    @RequestMapping(method = RequestMethod.POST)
    public List<PersonResponse> save(@RequestBody List<PersonRequest> personRequests){
        return this.personService.save(personRequests);
    }

    @GetMapping
    public List<PersonResponse> findAll(){
        return this.personService.findAll();
    }

    @PutMapping
    public PersonResponse update(@RequestBody PersonRequest person){
        return this.personService.update(person);
    }
}
