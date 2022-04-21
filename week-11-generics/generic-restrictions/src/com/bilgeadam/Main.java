package com.bilgeadam;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> integers = new ArrayList<>();

        NumericOperator<Double,String, ArrayList<String>> doubleNumericOperator = new NumericOperator<>(5.5, new ArrayList<String>());
        NumericOperator<Integer,String, ArrayList<String>> integerNumericOperator = new NumericOperator<>(10, new ArrayList<String>());

        // TODO liste içerisine farklı tipte veri ekleyebiliyorum. Neden?
        doubleNumericOperator.getList().add("Burak");
        // doubleNumericOperator.addList(5);
        doubleNumericOperator.printList();

        if (doubleNumericOperator.isDividableByTen()) {
            System.out.println(doubleNumericOperator.getObj() + " 10'a bölünebilir.");
        } else {
            System.out.println(" 10'a bölünemez.");
        }

        if (integerNumericOperator.isDividableByTen()) {
            System.out.println(integerNumericOperator.getObj() + " 10'a bölünebilir.");
        } else {
            System.out.println(" 10'a bölünemez.");
        }
    }
}
