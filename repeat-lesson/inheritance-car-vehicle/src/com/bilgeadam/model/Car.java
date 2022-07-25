package com.bilgeadam.model;

import com.bilgeadam.model.Vehicle;

class Car extends Vehicle {

    public static int COUNT = 1;

    public Car(){
    }

    protected void printBaggage(){
        System.out.println(baggage);
        this.printPassenger();
    }

    public static int baggage;
}
