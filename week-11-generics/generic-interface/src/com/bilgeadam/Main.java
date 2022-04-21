package com.bilgeadam;

public class Main {

    public static void main(String[] args) {

        Integer[] integers = {1,2,3,4,5,6};

        GenericInterfaceImpl<Integer> integerGenericInterface = new GenericInterfaceImpl<>(integers);

        System.out.println(integerGenericInterface.contains(5));

        String[] strings = {"A","B","C"};

        GenericInterfaceImpl<String> stringGenericInterface = new GenericInterfaceImpl<>(strings);

        System.out.println(stringGenericInterface.contains("A"));
    }
}
