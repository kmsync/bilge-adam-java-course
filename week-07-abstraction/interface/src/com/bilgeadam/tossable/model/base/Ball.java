package com.bilgeadam.tossable.model.base;

import com.bilgeadam.tossable.interfaces.Tossable;

public abstract class Ball implements Tossable {
    private String brandName;

    public Ball(String brandName){
        this.brandName = brandName;
    }

    public String getBrandName() {
        return brandName;
    }

    public void bounce(){
        System.out.println("bounce");
    }
}
