package com.bilgeadam;

import org.springframework.stereotype.Component;

@Component
public class Service2 {

    private final Address address;
    private final Address address2;

    public Service2(Address address, Address address2){
        this.address = address;
        this.address2 = address2;
    }

    public int whatAddress1Number(){
        return this.address.getNumber();
    }

    public int intWhatAddress2Number(){
        return this.address2.getNumber();
    }
}
