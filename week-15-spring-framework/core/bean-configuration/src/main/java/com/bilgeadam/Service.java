package com.bilgeadam;

import com.bilgeadam.company.Company;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class Service {

    private final Address address;
    private final Company company;

    public Service(Address address, Company company){
        this.address = address;
        this.company = company;
    }

    public int whichNumber(){
        return address.getNumber();
    }

    public int whichCompanyNumber(){
        return company.getAddress().getNumber();
    }

    public void changeNumber(){
        address.setNumber(new Random(10).nextInt());
    }
}
