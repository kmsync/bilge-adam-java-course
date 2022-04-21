package com.bilgeadam;

import java.util.ArrayList;

public class NumericOperation<T extends Number> {
    private T obj;

    public NumericOperation(T obj){
        this.obj = obj;
    }

    public T getObj(){
        return obj;
    }

    public void absEqual(ArrayList<? extends Number> numbers){
        for( int i = 0; i< numbers.size() ; i++){
            System.out.println(Math.abs(this.obj.doubleValue()) == Math.abs(numbers.get(i).doubleValue()));
        }
    }
}
