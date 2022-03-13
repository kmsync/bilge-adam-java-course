package com.bilgeadam.calculator;

import com.bilgeadam.exceptions.MultiplyException;
import com.bilgeadam.interfaces.Calculator;

public class CalculatorImplementation implements Calculator {

    @Override
    public double sum(double a, double b){
        return a+b;
    }

    @Override
    public double difference(double a, double b){
        return a-b;
    }

    @Override
    public double multiply(double a, double b) throws MultiplyException{
        if(a > 1000 || b > 1000){
            throw new MultiplyException("Çarpılmak istenen sayılar 1000'den büyük olamaz.");
        }else {
            return a*b;
        }

    }

    @Override
    public double divide(int a, int b){
        return a/b;
    }
}
