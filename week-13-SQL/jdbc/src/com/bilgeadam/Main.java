package com.bilgeadam;

import com.bilgeadam.config.SQLConnector;
import com.bilgeadam.event.OnCloseThread;
import com.bilgeadam.model.City;
import com.bilgeadam.repository.CityRepository;

import java.sql.Date;

public class Main {

    public static void main(String[] args) {
        SQLConnector sqlConnector = new SQLConnector(); // Connection Oluşturmak.

        CityRepository cityRepository = new CityRepository(sqlConnector.connection); //Connection aracılığıyla sorgu atmak.
        Runtime.getRuntime().addShutdownHook(new OnCloseThread(sqlConnector.connection)); // Uygulama kapanırken connection'ı kapatmak.
        City city = new City();
        city.setCity("Ankara");
        city.setCountryId(97);
        city.setLastUpdate(new Date(System.currentTimeMillis()));
        cityRepository.saveCity(city);
        for(City savedCity : cityRepository.findAllCity()){
            System.out.println(savedCity);
        }
        cityRepository.deleteCityById(cityRepository.findLastCityRecord());
        for(City savedCity2 : cityRepository.findAllCity()){
            System.out.println(savedCity2);
        }

        /* try {
            sqlConnector.getConnection().close();
            System.out.println("Bağlantı Kapatıldı.");
        }catch (SQLException e){
            System.err.println(e.getMessage());
        } */
    }
}
