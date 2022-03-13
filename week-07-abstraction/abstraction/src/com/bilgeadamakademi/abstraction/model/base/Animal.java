package com.bilgeadamakademi.abstraction.model.base;

import com.bilgeadamakademi.abstraction.interfaces.Height;
import com.bilgeadamakademi.abstraction.interfaces.Weight;

public abstract class Animal implements Height, Weight {
    private int height;
    private int weight;

    public Animal(int height, int weight){
        this.height = height;
        this.weight = weight;
    }

    public Animal(){
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public abstract boolean isAlive();
}
