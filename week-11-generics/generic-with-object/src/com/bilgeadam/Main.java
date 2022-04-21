package com.bilgeadam;

public class Main{

    public static void main(String[] args) {
        Object person = new Person("Lebron", "James",  40);
        System.out.println(person);
        System.out.println(((Person)person).getSalary());
        person = new Animal("Lion");
        System.out.println(((Animal)person).isAlive());

        Sum sum = new Sum();
        System.out.println((double)sum.sum(5.5,5.5));
    }
}
