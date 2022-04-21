package com.bilgeadam;

public interface GenericFunction<T,Y,E> {
    E apply(T a, Y b);
}
