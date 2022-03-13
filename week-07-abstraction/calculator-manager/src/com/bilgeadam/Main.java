package com.bilgeadam;

import com.bilgeadam.manager.CustomerManager;
import com.bilgeadam.market.manager.model.MarketCalculatorManager;

public class Main {

    public static void main(String[] args) {
        CustomerManager customerManager = new CustomerManager();
        customerManager.shopCalculatorManager = new MarketCalculatorManager();
        customerManager.shopCalculatorManager = new MarketCalculatorManager();
        customerManager.doTheShopping();
    }
}
