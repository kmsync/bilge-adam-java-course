package com.bilgeadam;

import com.bilgeadam.model.Bird;
import com.bilgeadam.model.Lion;

public class Main {

    public static void main(String[] args) {
        Lion lion = new Lion();
        System.out.println(lion.getName());
        System.out.println(lion.getHeight());
        System.out.println(lion.getWeight());

        Bird bird = new Bird();
        System.out.println(bird.getName());
        System.out.println(bird.getHeight());
        System.out.println(bird.getWeight());
    }
}
