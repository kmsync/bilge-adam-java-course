package com.bilgeadam.phone.manager.model;

import com.bilgeadam.phone.manager.abstraction.BasePhoneManager;

public class ApplePhoneManager extends BasePhoneManager {

    public ApplePhoneManager(String phoneModel){
        super("Apple",phoneModel);
    }

    @Override
    public double buyTelephone(int price, double otv){
        return (price+ (price*otv));
    }
}
