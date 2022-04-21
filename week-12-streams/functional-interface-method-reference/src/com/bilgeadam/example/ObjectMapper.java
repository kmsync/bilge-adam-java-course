package com.bilgeadam.example;

public class ObjectMapper {

    public Employee personMapToEmployee(Person person){
        Employee employee = new Employee();
        employee.setName(person.getName());
        employee.setSurname(person.getSurname());
        employee.setSalary(50000);
        return employee;
    }

    public Person employeeMapToPerson(Employee employee){
        Person person = new Person();
        person.setName(employee.getName());
        person.setSurname(employee.getSurname());
        return person;
    }

    public Manager personMapToManager(Person person){
        Manager manager = new Manager();
        manager.setName(person.getName());
        manager.setSurname(person.getSurname());
        manager.setSalary(100_000);
        manager.setChargeArea("Constructor Zone");
        return manager;
    }
}
