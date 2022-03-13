package com.bilgeadam.phone.manager;

import com.bilgeadam.phone.manager.abstraction.BasePhoneManager;

import java.util.Scanner;

public class CustomerManager {

    private BasePhoneManager phoneManager;
    private Scanner scanner = new Scanner(System.in);
    private int phonePrice;
    private double phoneOTV;

    public void setPhoneManager(BasePhoneManager phoneManager) {
        this.phoneManager = phoneManager;
    }

    public void infoMessage() {
        System.out.println("--------------------- \n Telefon Ücretleri \n ------------------------");
        System.out.print("Telefon geliş ücreti: ");
        phonePrice = scanner.nextInt();

        if (phonePrice >= 3000) {
            phoneOTV = 0.4;
        } else if (phonePrice <= 3000 && phonePrice >= 1500) {
            phoneOTV = 0.25;
        } else {
            phoneOTV = 0.15;
        }
        System.out.println("Hükümlü olduğunuz ÖTV Oranı: %" + phoneOTV * 100);
    }

    public void doTheShopping() {
        System.out.println("----------------------- \n Telefon Bilgileri \n -------------------------");
        System.out.println("Telefon Markası: " + phoneManager.getPhoneBrand());
        System.out.println("Telefon Modeli: " + phoneManager.getPhoneModel());
        System.out.println("------------------------ \n Telefon Hesaplaması \n -----------------------");
        System.out.println("Telefonun vergiler dahil fiyatı: " + phoneManager.buyTelephone(phonePrice, phoneOTV));
    }
}
