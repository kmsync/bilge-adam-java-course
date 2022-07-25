package com.bilgeadam.q1;

import java.util.Calendar;

public class UserManager{

    public UserManager(String name, String surname, int dateOfBirth){
        this.name = name;
        this.surname = surname;
        this.dateOfBirth = dateOfBirth;
    }

    Calendar calendar = Calendar.getInstance();

    String name,surname;
    int dateOfBirth;

    public String getUserFullName(){
        return this.name + " " + this.surname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int calculateAge(){
        return calendar.get(Calendar.YEAR) - dateOfBirth;
    }

    public void printXPlusTwo(int x){
        x += 2;
        System.out.println(x);
    }

    @Override
    public String toString(){
        return this.name + " " + this.surname + " " + dateOfBirth;
    }
}