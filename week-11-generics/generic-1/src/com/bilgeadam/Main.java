package com.bilgeadam;

import com.bilgeadam.runnable.DemoRunnable;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        GenericType<Integer> integerGenericType = new GenericType<>(7);
        integerGenericType.showType();
        Integer value = integerGenericType.getObj();
        System.out.println(value);

        GenericType<Double> doubleGenericType = new GenericType<>(5.5);
        doubleGenericType.showType();
        Double doubleValue = doubleGenericType.getObj();
        System.out.println(doubleValue);

        GenericType<String> stringGenericType = new GenericType<>("Burak");
        stringGenericType.showType();
        String StringValue = stringGenericType.getObj();
        System.out.println(StringValue);

        GenericType<Thread> threadGenericType = new GenericType<>(new Thread(new DemoRunnable()));
        threadGenericType.showType();
        threadGenericType.getObj().start();

        List<Integer> integers = new ArrayList<>();
        integers.add(5);
        // integers.add("NBasdasd"); Yanlış

    }
}
