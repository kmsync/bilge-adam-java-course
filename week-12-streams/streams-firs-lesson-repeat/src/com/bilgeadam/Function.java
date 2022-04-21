package com.bilgeadam;

@FunctionalInterface
public interface Function<T,E,R> {

    R apply(T a, E b);
}
