package com.bilgeadam.manager;

import com.bilgeadam.exceptions.BanOnLeavingTheCountryException;
import com.bilgeadam.exceptions.DepartureFeeException;
import com.bilgeadam.exceptions.VisaException;
import com.bilgeadam.passenger.Passenger;

public class AirportManager {

    public void checkPassenger(Passenger passenger) {

        try {
            if (passenger.getDepartureFee() < 100) {
                throw new DepartureFeeException("Harç ücreti 100 liradan düşük olamaz.");
            }
        } catch (DepartureFeeException departureFeeException) {
            System.out.println(departureFeeException.getMessage());
        }

        try {
            if (passenger.isBanOnLeavingTheCountry()) {
                throw new BanOnLeavingTheCountryException("Yurtdışı çıkış yasağı bulunanlar yurt dışına çıkamaz.");
            }
        } catch (BanOnLeavingTheCountryException banOnLeavingTheCountryException) {
            System.out.println(banOnLeavingTheCountryException.getMessage());
        }

        try {
            if (!passenger.isVisaStatus()) {
                throw new VisaException("Vizeniz olmadağan yurtdışına çıkış yapamazsınız.");
            }
        } catch (VisaException visaException) {
            System.out.println(visaException.getMessage());
        }


        System.out.println("Yatırmış olduğunuz harç miktarı:" + passenger.getDepartureFee());
        System.out.println(passenger.isBanOnLeavingTheCountry() ? "Yurtdışı çıkış yasağınız bulunmaktadır." : "Yurtdışı çıkış yasağınız bulunmamaktadır.");
        System.out.println(passenger.isVisaStatus() ? "Vizeniz bulunmaktadır." : "Vizeniz bulunmamaktadır.");
    }
}
