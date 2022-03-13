package com.bilgeadam.tossable.model.base;

import com.bilgeadam.tossable.interfaces.Tossable;

public class Rock implements Tossable {

    @Override
    public void toss(){
        System.out.println("Rock class");
    }
}
