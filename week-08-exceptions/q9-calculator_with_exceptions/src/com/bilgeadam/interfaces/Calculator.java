package com.bilgeadam.interfaces;

import com.bilgeadam.exceptions.MultiplyException;

public interface Calculator {
    double sum(double a, double b);
    double difference(double a, double b);
    double multiply(double a, double b) throws MultiplyException;
    double divide(int a, int b);
}
