package com.bilgeadam;

public class CircleWithException {

    private double radius;

    public static int numberOfObject = 0;

    public CircleWithException(){
        this(1.0);
    }

    public CircleWithException(double radius){
        this.radius = radius;
        numberOfObject++;
    }

    public void setRadius(double radius){
        if(radius > 0){
            this.radius = radius;
        }else {
            throw new IllegalArgumentException("Radius cannot be negative.");
        }
    }

    public double getRadius() {
        return radius;
    }
}
