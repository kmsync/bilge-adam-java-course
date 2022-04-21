package com.bilgeadam;

import com.bilgeadam.exceptions.ArithmeticCheckedException;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws ArithmeticCheckedException {

        Function function = (a,b) -> {

            if(a < 0 || b < 0 ){
                throw new ArithmeticCheckedException("Sayı 0'dan küçük olamaz.");
            }

            try{
                if(a < 0 || b < 0 ){
                    throw new ArithmeticCheckedException("Sayı 0'dan küçük olamaz.");
                }
            }catch (ArithmeticCheckedException e) {
                System.out.println(e.getMessage()+" " + e);
            }

            if(a < 0 || b < 0 ){
                throw new ArithmeticException("Sayı 0'dan küçük olamaz.");
            }

            return a+b;
        };

        function.sum(5,-5);
    }
}
