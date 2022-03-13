package com.bilgeadam;

import com.bilgeadam.mathematical.operation.MathematicalOperationImp;
import com.bilgeadam.mathematical.operation.interfaces.MathematicalOperation;

public class Main {

    public static void main(String[] args) {
        MathematicalOperation mathematicalOperation = new MathematicalOperationImp();
        System.out.println(mathematicalOperation.difference(9, 3));
        System.out.println(mathematicalOperation.divide(999, 555));
        System.out.println(mathematicalOperation.multiply(1000, 52.5));
        System.out.println(mathematicalOperation.sum(99, 55));
    }
}
