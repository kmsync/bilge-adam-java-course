package com.bilgeadam.variableCapture3;

import com.bilgeadam.Function;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Integer value = 10;

        String[] strings = new String[2];

        List<String> stringList = new ArrayList<>();

        Function<Integer> function = (a) -> {
            strings[1] = "Burak";
            stringList.add("Burak");
            /*stringList = new ArrayList<>();
            value = 20;*/
            return a;
        };
    }
}
