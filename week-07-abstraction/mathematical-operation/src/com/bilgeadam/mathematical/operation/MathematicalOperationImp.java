package com.bilgeadam.mathematical.operation;

import com.bilgeadam.mathematical.operation.interfaces.MathematicalOperation;

public class MathematicalOperationImp implements MathematicalOperation {

    @Override
    public double sum(double a, double b){
        return a+b;
    }

    @Override
    public double difference(double a, double b){
        return a - b;
    }

    @Override
    public double multiply(double a, double b){
        return a * b;
    }

    @Override
    public double divide(double a, double b){
        return a/b;
    }
}
