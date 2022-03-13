package com.bilgeadam.tossable.model;

import com.bilgeadam.tossable.model.base.Ball;

public class Football extends Ball {
    public Football(String brandName){
        super(brandName);
    }

    @Override
    public void toss() {
        System.out.println("Football toss");
    }

    @Override
    public void bounce(){
        System.out.println("Football Bounce");
    }

}
