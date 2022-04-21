package com.bilgeadam.instanceMethodReference;

public class Ma {

    static void predicate(IntPredicate intPredicate , int value){
        intPredicate.test(value);
    }

    public static void main(String[] args) {

        // Lambda ifadesiyle bir function tanımladım.
        IntPredicate isPrimoByLambda = (a) -> {
            if( a < 2){
                return false;
            }
            return true;
        };

        // Sınıftan bir instance oluşturdum.
        MyIntPredicates myIntPredicates = new MyIntPredicates();

        IntPredicate isPrimoByMethodReference = myIntPredicates::isPrimo;

        predicate(isPrimoByMethodReference,10);

        predicate(myIntPredicates::isPrimo,10);

        predicate(isPrimoByLambda,10);
    }
}
