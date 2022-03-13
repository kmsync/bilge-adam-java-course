package com.bilgeadam;

import com.bilgeadam.exceptions.MultiplyException;

public class Main {

    public static void main(String[] args) {
        Multiply multiply = new Multiply();
        try{
            multiply.multiply(10001,1111111);
        }catch (IllegalArgumentException e){

        }catch (MultiplyException e){

        }catch (RuntimeException r){

        }


    }
}
