package com.bilgeadam.model;

public class Animal {

    private String name;
    private int height;
    private int weight;

    public Animal(String name, int height, int weight){
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    public Animal(){

    }

    public String getName() {
        return name;
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }
}
