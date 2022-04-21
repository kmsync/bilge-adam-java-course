package com.bilgeadam;

import com.bilgeadam.exceptions.ArithmeticCheckedException;

public interface Function {

    int sum(int a, int b) throws ArithmeticCheckedException;
}
