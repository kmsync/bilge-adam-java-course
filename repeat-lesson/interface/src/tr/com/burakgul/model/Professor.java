package tr.com.burakgul.model;

import tr.com.burakgul.interfaces.Person;

public class Professor implements Person {
    private int salary;

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getFirstName(){
        return firstName;
        // return Person.firstName;
    }
}
