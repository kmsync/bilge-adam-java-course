package com.bilgeadam;

public class Main {

    public static void main(String[] args) {

        CompareList compareList = new CompareList();

        Integer[] integers1 = new Integer[]{1,2,3,4,5};
        Integer[] integers2 = new Integer[]{1,2,3,4};

        System.out.println("integer 1 integer 1'e eşit mi? :" + compareList.arraysEqual(integers1,integers1));
        System.out.println("integer 1 integer 2'e eşit mi? :" + compareList.arraysEqual(integers1,integers2));

        Double[] doubles1 = new Double[]{1.0,100.0,7.0};
        Double[] doubles2 = new Double[]{1.0,100.0,7.0};

        System.out.println("doubles 1 doubles 1'e eşit mi? :" + compareList.arraysEqual(doubles1,doubles1));
        System.out.println("doubles 1 doubles 2'e eşit mi? :" + compareList.arraysEqual(doubles1,doubles2));

        String[] strings1 = new String[]{"A","B","C"};
        String[] strings2 = new String[]{"A","B","D"};

        System.out.println("strings 1 strings 1'e eşit mi? :" + compareList.arraysEqual(strings1,strings1));
        System.out.println("strings 1 strings 2'e eşit mi? :" + compareList.arraysEqual(strings1,strings2));

        System.out.println("strings 1 double 1e eşit mi? :" + compareList.arraysEqual(strings1, doubles1));
    }
}
