package com.bilgeadam;

import com.bilgeadam.exceptions.MultiplyException;

public class Multiply {

    public void multiply(int a, int b) throws IllegalArgumentException, MultiplyException, RuntimeException{
            if(a < 1000 && b < 1000){
                System.out.println(a*b);
            }else{
                throw new MultiplyException("a veya b 1000'den büyük olamaz.");
            }
    }
}
