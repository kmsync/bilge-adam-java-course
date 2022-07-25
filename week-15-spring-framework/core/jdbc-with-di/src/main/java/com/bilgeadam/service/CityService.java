package com.bilgeadam.service;

import com.bilgeadam.repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CityService {
    @Autowired
    private CityRepository cityRepository;

    public int findLastCityRecord(){
        return this.cityRepository.findLastCityRecord();
    }
}
