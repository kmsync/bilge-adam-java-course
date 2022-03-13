package com.bilgeadam.passenger;

import java.util.Scanner;

public class Passenger {

    public Passenger() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Harç ücretini ne kadar yatırdınız? Miktarı giriniz: ");
        this.departureFee = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Yurtdışı çıkış yasağınız var mı? (Evet / Hayır) : ");
        String isBanOnLeavingTheCountry = scanner.nextLine();
        if (isBanOnLeavingTheCountry.equals("Evet")) {
            this.isBanOnLeavingTheCountry = true;
        } else {
            this.isBanOnLeavingTheCountry = false;
        }

        System.out.print("Gideceğiniz ülkeye vizeniz var mı? (Evet / Hayır) : ");
        String visaStatus = scanner.nextLine();
        this.visaStatus = visaStatus.equals("Evet") ? true : false;
    }

    private int departureFee;
    private boolean isBanOnLeavingTheCountry;
    private boolean visaStatus;


    public int getDepartureFee() {
        return departureFee;
    }

    public boolean isBanOnLeavingTheCountry() {
        return isBanOnLeavingTheCountry;
    }

    public boolean isVisaStatus() {
        return visaStatus;
    }
}
