package com.bilgeadam;

import java.util.concurrent.atomic.AtomicReference;

public class LambdaCalculus {

    public LambdaCalculus(){

    }

    double value = 10;

    // Bu metod ile getValueLambdaEquivalent metodunun içerisindeki lambda ifadesi
    // birbirlerine eşittir.
    public double getValue() {
        return 3.4;
    }

    public void getValueLambdaEquivalent() {
        DoubleFunction doubleFunction = () -> 3.4;

        DoubleFunction doubleFunction1 = () -> {
            value = 20;
            return value;
        };
        System.out.println("Lambda ifadesi çağrılmadan önce: " + value);
        doubleFunction1.apply();
        System.out.println("Lambda ifadesi çağrıldıktan sonra:" + value);


        double localValue = 10;

        DoubleFunction doubleFunction2 = () -> {
            // Bu local bir değişken olduğu için üzerinde değişiklik yapamıyoruz.
            // localValue = 20;
            return localValue;
        };

        System.out.println(doubleFunction2.apply());

        /*String localString = "Burak GÜL";

        Function<String,String,String> stringFunction = (a,b) -> {
            localString = localString + a + b;
            return localString;
        };*/

        AtomicReference<String> localString = new AtomicReference<>("Burak GÜL");

        Function<String, String, String> stringFunction = (a, b) -> {
            localString.set(localString.get() + " " + a + " " + b);
            return localString.get();
        };

        LambdaMethodReference lambdaMethodReference = new LambdaMethodReference();

        Function<String, String, String> stringFunction2 = lambdaMethodReference.stringFunction();
        stringFunction2.apply("Burak", "Burak");


        try {
            System.out.println(stringFunction.apply("Yazılım", "Mühendisi"));
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }

    }

    public void staticMethodReference(PrintFunction ifFunction,
                                      PrintFunction elseFunction,
                                      boolean ifOrElse) {
        System.out.println(value);

        if (ifOrElse) {
            ifFunction.apply("İf ifadesinin içi.");
        } else {
            elseFunction.apply("Else ifadesinin içi.");
        }
    }

    public void methodReference(VoidFunction voidFunction){
        voidFunction.apply();
    }

    public LambdaCalculus constructorReference(ConstructorFunction<LambdaCalculus> calculusConstructorFunction){
        return calculusConstructorFunction.apply();
    }
}
