package com.bilgeadam;

public class MethodReferenceMain {

    public static void main(String[] args) {
        LambdaCalculus lambdaCalculus = new LambdaCalculus();

        /*lambdaCalculus.staticMethodReference(LambdaMethodReference::printHello,
                LambdaMethodReference::printHello,
                false);*/

        lambdaCalculus.methodReference(lambdaCalculus::getValueLambdaEquivalent);

        LambdaCalculus lambdaCalculus1 = lambdaCalculus.constructorReference(LambdaCalculus::new);

        System.out.println("constructor reference " + lambdaCalculus1.getValue());
    }
}
