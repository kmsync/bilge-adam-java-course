package com.bilgeadam.example;

public class Employee {

    public Employee(String name, String surname, Integer salary){
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    public Employee(){

    }

    private String name;
    private String surname;
    private Integer salary;

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public Integer getSalary() {
        return salary;
    }
}
