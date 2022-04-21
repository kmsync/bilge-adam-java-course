package com.bilgeadam;

public class GenericInterfaceImpl<T> implements ContainChecker<T>{

    T[] values;

    public GenericInterfaceImpl(T[] values){
        this.values = values;
    }

    @Override
    public boolean contains(T obj) {
        for(T value : this.values){
            if(value.equals(obj)){
                return true;
            }
        }
        return false;
    }
}
