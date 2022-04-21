package com.bilgeadam;

import java.util.concurrent.Semaphore;

public class GenericType<T> {

    private T obj;

    public GenericType(T obj){
        this.obj = obj;
    }

    public T getObj(){
        return obj;
    }

    public void showType() {
        System.out.println("Type: "+this.obj.getClass().getName());
    }

}
