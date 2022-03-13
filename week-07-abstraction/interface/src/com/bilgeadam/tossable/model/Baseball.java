package com.bilgeadam.tossable.model;

import com.bilgeadam.tossable.model.base.Ball;

public class Baseball extends Ball {
    public Baseball(String brandName){
        super(brandName);
    }

    @Override
    public void toss(){
        System.out.println("Baseball toss");
    }

    @Override
    public void bounce() {
        System.out.println("Baseball bounce");
    }
}
