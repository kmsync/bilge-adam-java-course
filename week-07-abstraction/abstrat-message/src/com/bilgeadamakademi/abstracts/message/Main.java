package com.bilgeadamakademi.abstracts.message;

import com.bilgeadamakademi.abstracts.message.model.FirstMessage;
import com.bilgeadamakademi.abstracts.message.model.SecondMessage;

public class Main {

    public static void main(String[] args) {
        System.out.println(new FirstMessage().message());
        System.out.println(new SecondMessage().message());
    }
}
