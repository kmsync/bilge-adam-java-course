package com.bilgeadam.phone.manager.abstraction;

public abstract class BasePhoneManager {
    private String phoneBrand;
    private String phoneModel;

    public BasePhoneManager(String phoneBrand, String phoneModel){
        this.phoneBrand = phoneBrand;
        this.phoneModel = phoneModel;
    }

    public String getPhoneModel() {
        return phoneModel;
    }

    public String getPhoneBrand() {
        return phoneBrand;
    }

    public BasePhoneManager(){

    }

    public abstract double buyTelephone(int price, double otv);
}
