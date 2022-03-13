package com.bilgeadam.phone.manager.model;

import com.bilgeadam.phone.manager.abstraction.BasePhoneManager;

public class SamsungPhoneManager extends BasePhoneManager {

    public SamsungPhoneManager(String phoneModel) {
        super("Samsung", phoneModel);
    }

    @Override
    public double buyTelephone(int price, double otv) {
        double totalTax = ((price * 0.18) + (price * 0.1) + (price * 0.01));
        return (price + (price * otv) + totalTax) - 250;
    }
}
