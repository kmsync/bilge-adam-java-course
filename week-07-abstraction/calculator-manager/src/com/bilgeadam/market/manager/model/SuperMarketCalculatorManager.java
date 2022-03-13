package com.bilgeadam.market.manager.model;

import com.bilgeadam.market.manager.model.abstaction.BaseShopCalculatorManager;

public class SuperMarketCalculatorManager extends BaseShopCalculatorManager {

    public SuperMarketCalculatorManager() {
        super(2.5);
    }

    @Override
    public double breadBuy(int numberOfBread){
        return numberOfBread * this.getBreadPrice();
    }
}
