package com.bilgeadam;

public class Address {
    private String street;
    private int number;

    public Address(String street, int number){
        this.street = street;
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public String getStreet() {
        return street;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    @Override
    public String toString(){
        return this.street + " " + this.number;
    }
}
