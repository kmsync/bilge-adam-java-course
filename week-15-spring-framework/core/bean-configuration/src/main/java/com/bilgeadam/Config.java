package com.bilgeadam;

import com.bilgeadam.company.Company;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.bilgeadam")
public class Config {

    @Bean
    public Address address(){
        return new Address("Osmanbey Caddesi",18);
    }

    @Bean
    public Address address2(){
        return new Address("Altay Caddesi",15);
    }
}
