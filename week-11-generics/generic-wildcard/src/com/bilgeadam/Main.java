package com.bilgeadam;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        NumericOperation<Double> doubleNumericOperation = new NumericOperation<>(100.0);

        ArrayList<Integer> strings = new ArrayList<>();
        strings.add(-100);
        strings.add(2);

        doubleNumericOperation.absEqual(strings);
    }
}
