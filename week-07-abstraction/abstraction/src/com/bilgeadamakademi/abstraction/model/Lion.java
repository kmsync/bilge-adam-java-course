package com.bilgeadamakademi.abstraction.model;

import com.bilgeadamakademi.abstraction.model.base.Animal;

public class Lion extends Animal {

    private String name;

    public Lion(int height, int weight){
        super(height, weight);
    }

    public Lion(int height, int weight, String name){
        super(height, weight);
        this.name = name;
    }

    @Override
    public boolean isAlive(){
        return true;
    }

    @Override
    public double heightCm(){
        return super.getHeight();
    }

    @Override
    public double heightM(){
        return this.getHeight() / 100.0;
    }

    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

    @Override
    public double weightGram() {
        return 0;
    }

    @Override
    public double weightKilogram() {
        return 0;
    }
}
