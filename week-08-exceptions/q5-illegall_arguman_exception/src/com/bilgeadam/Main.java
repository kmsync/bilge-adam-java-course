package com.bilgeadam;

public class Main {

    public static void main(String[] args) {
        CircleWithException circleWithException = new CircleWithException();
        new CircleWithException();
        new CircleWithException();
        new CircleWithException();
        new CircleWithException();
        new CircleWithException();
        new CircleWithException();
        new CircleWithException();
        new CircleWithException();
        System.out.println(circleWithException.getRadius());
        try {
            circleWithException.setRadius(1);
        } catch (IllegalArgumentException illegalArgumentException) {
            System.out.println(illegalArgumentException.getMessage());
        } finally {
            System.out.println("finally bloğu çalıştı.");
            System.out.println(CircleWithException.numberOfObject);
        }
    }
}
