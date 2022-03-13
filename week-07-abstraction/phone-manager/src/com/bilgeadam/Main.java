package com.bilgeadam;

import com.bilgeadam.phone.manager.CustomerManager;
import com.bilgeadam.phone.manager.model.ApplePhoneManager;

public class Main {

    public static void main(String[] args) {
        CustomerManager customerManager = new CustomerManager();
        customerManager.setPhoneManager(new ApplePhoneManager("17"));
        customerManager.infoMessage();
        customerManager.doTheShopping();
    }
}
