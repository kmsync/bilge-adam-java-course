package com.bilgeadam;

public class Main {

    public static void main(String[] args) {
        Division division = new Division();
        try{
            division.division(1,0);
        }catch (ArithmeticException arithmeticException){
            System.out.println("Program hatalı çalıştı. {"+arithmeticException.getMessage()+"}");
            throw arithmeticException;
        } finally {
            System.out.println("Program sonlandı.");
        }

        System.out.println("Çalışmaya devam edecek mi?");
    }
}
