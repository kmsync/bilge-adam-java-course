package com.bilgeadam.example;

public class Manager extends Employee{

    public Manager(String name, String surname, Integer salary, String chargeArea){
        super(name,surname,salary);
        this.chargeArea = chargeArea;
    }

    public Manager(){

    }

    private String chargeArea;

    public void setChargeArea(String chargeArea) {
        this.chargeArea = chargeArea;
    }

    public String getChargeArea() {
        return chargeArea;
    }
}
