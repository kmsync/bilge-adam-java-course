package com.bilgeadam.model;

public class Vehicle {

    private int passenger;

    private int speed;

    protected void printPassenger(){
        System.out.println(passenger);
    }


    public int findSpeed(){
        return this.speed;
    }

    public int findSpeed(int time, int distinct){
        return distinct / time;
    }
}
