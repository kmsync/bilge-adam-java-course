package com.bilgeadam.staticMethodReference;

public class Main {

    static boolean numberTest(IntFunctions intFunctions, int value) {
        return intFunctions.test(value);
    }

    public static void main(String[] args) {
        IntFunctions intFunctions = (a) -> {
            if (a < 2) {
                return false;
            }
            return true;
        };

        numberTest(MyClass::isPrimo, 54);

        numberTest(intFunctions, 5);


        numberTest((a) -> {
            if (a < 2) {
                return false;
            }
            return true;
        }, 5);
    }
}
