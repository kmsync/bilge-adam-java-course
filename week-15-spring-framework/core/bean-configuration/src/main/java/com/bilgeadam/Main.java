package com.bilgeadam;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args){
        /*Address address = new Address("ads",312);
        Address address1 = new Address("saddasdas",423);
        Company company = new Company(address1);
        Service service = new Service(address,company);*/

        //IoC containerı oluşturmak.
        AnnotationConfigApplicationContext acac = new AnnotationConfigApplicationContext(Config.class);

        // Bu container içerisinden Service beanini çağırıyorum.
        Service service = acac.getBean("service",Service.class);
        System.out.println(service.whichNumber());
        System.out.println(service.whichCompanyNumber());
        service.changeNumber();

        // Bu container içerisinden Service2 beanini çağırıyorum.
        Service2 service2 = acac.getBean("service2",Service2.class);

        System.out.println(service2.intWhatAddress2Number());
        System.out.println(service2.whatAddress1Number());

        Address address = acac.getBean("address",Address.class);
        System.out.println(address.getNumber());
    }
}
