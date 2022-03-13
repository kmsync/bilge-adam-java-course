package com.bilgeadam.market.manager.model;

import com.bilgeadam.market.manager.model.abstaction.BaseShopCalculatorManager;

public class MarketCalculatorManager extends BaseShopCalculatorManager {

    public MarketCalculatorManager(){
        super(1.5);
    }

    @Override
    public double breadBuy(int howMuchBread){
        return howMuchBread * this.getBreadPrice();
    }
}
