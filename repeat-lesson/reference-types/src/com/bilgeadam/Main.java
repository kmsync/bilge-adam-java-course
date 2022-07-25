package com.bilgeadam;

public class Main {

    public static void main(String[] args) {
        String name = "Burak";

        String name2 = name;

        name2 = "GÜL";

        System.out.println(name);


        /**
         * Stack
         * Heap
         * int tanımı yaptığımızda stack üzerinde saklanır.
         * String name = "Burak";
         *
         * STACK
         * name -> Heap'in içerisindeki Burak değerinin bulunduğu
         * alanı işaret ediyor. 0x000000049
         *
         * HEAP
         * "Burak"
         */

        int a = 5;

        System.out.println(a);

        Person person = new Person();

        Person person1 = person;

        person.setName("Burak");

        System.out.println(person);

        // person1 identifier'ı stack hafıza alanına sorgu gönderiyor.
        // Göndermiş olduğu değer stackte bulunan person'ın işaret etmiş olduğu pointer.
        // 0x0000000051 heap'te bulunan bu bellek alanından veriyi getirip yazdırıyor.
        System.out.println(person1);

        /**
         * STACK
         * person -> 0x0000000051
         * person1 -> person
         *
         * HEAP
         * 0x0000000051 "Burak"
         */
    }
}
