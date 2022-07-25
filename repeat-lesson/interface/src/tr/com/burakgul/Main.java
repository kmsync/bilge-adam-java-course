package tr.com.burakgul;

import tr.com.burakgul.interfaces.Person;
import tr.com.burakgul.model.Professor;
import tr.com.burakgul.model.Student;

public class Main {

    public static void main(String[] args) {
        Professor person = new Professor();
        person.setSalary(50_000);

       /* Student person = new Student();
        person.setMajor("3");*/

        System.out.println(person.firstName);
        System.out.println(person.lastName);

        System.out.println(Person.firstName);
        System.out.println(Professor.lastName);
    }
}
