package com.bilgeadam.market.manager.model.abstaction;

public abstract class BaseShopCalculatorManager {

    private double breadPrice;

    public BaseShopCalculatorManager(double breadPrice){
        this.breadPrice = breadPrice;
    }

    public abstract double breadBuy(int numberOfBread);

    public void setBreadPrice(double breadPrice) {
        this.breadPrice = breadPrice;
    }

    public double getBreadPrice() {
        return breadPrice;
    }
}
