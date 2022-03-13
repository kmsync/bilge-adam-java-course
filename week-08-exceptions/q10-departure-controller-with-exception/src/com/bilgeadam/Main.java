package com.bilgeadam;

import com.bilgeadam.manager.AirportManager;
import com.bilgeadam.passenger.Passenger;

public class Main {

    public static void main(String[] args) {
        Passenger passenger = new Passenger();
        AirportManager airportManager = new AirportManager();
        airportManager.checkPassenger(passenger);
    }
}
