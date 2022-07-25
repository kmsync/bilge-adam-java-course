package com.bilgeadam;

import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class PersonGetter {

    private final Person person;

    public PersonGetter(Person person){
        this.person = person;
    }

    @EventListener(ApplicationReadyEvent.class)
    public void printPersonName(){
        System.out.println(this.person.getName());
    }
}
