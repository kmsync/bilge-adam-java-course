package com.bilgeadamakademi.abstraction.interfaces;

public interface Height {
    public final int a = 0;

    static String definition(){
        return "Bu interface içerisinde tanımlanmış static bir metoddur";
    }

    double heightCm();
    double heightM();
    default double heightKm(){
        return 0.0;
    }
}
