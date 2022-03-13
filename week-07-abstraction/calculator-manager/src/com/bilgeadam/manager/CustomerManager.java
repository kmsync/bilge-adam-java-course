package com.bilgeadam.manager;

import com.bilgeadam.market.manager.model.abstaction.BaseShopCalculatorManager;

import java.util.Scanner;

public class CustomerManager {
    private final Scanner scanner = new Scanner(System.in);
    public BaseShopCalculatorManager shopCalculatorManager;

    public void doTheShopping(){
        System.out.println("----------------\n Ekmek Hesaplaması \n -------------------");
        System.out.print("Kaç ekmek almak istiyorsunuz? : ");
        int numberOfBread = this.scanner.nextInt();
        System.out.println("Ekmek Fiyatı: "+ this.shopCalculatorManager.getBreadPrice());
        System.out.println("İstemiş olduğunuz ekmek sayısı: "+ numberOfBread);
        System.out.println("Almış olduğunuz ekmeklerin fiyatı: "+ this.shopCalculatorManager.breadBuy(numberOfBread));
    }
}
