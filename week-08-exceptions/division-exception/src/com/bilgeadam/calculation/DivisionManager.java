package com.bilgeadam.calculation;

public class DivisionManager {

    public void division(int a, int b){
        try {
            System.out.println(a/b);
        }catch (ArithmeticException arithmeticException){
            arithmeticException.printStackTrace();
            System.out.println("0'a bölüm hatası. Hata mesajı: "+arithmeticException.getMessage());
        }catch (Exception exception){
            System.out.println("Şu easdasd");
        }
    }
}
