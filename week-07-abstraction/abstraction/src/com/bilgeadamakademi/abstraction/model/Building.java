package com.bilgeadamakademi.abstraction.model;

import com.bilgeadamakademi.abstraction.interfaces.Height;

public class Building implements Height {
    public Building(){

    }

    @Override
    public double heightCm() {
        return 5;
    }

    @Override
    public double heightM() {
        return 200;
    }

    @Override
    public double heightKm() {
        return 0.4;
    }
}
