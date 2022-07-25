package com.bilgeadam;

import com.bilgeadam.config.DIConfig;
import com.bilgeadam.service.CityService;
import com.bilgeadam.thread.OnCloseThread;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JDBCApplication {
    private static final AnnotationConfigApplicationContext applicationContext =
            new AnnotationConfigApplicationContext(DIConfig.class);

    public static void main(String[] args){
        Runtime.getRuntime().addShutdownHook(applicationContext.getBean("onCloseThread", OnCloseThread.class));
        System.out.println(applicationContext.getBean("cityService", CityService.class).findLastCityRecord());


        /*DatabaseConfig databaseConfig = new DatabaseConfig();
        Connection connection = databaseConfig.connection();
        CityRepository cityRepository = new CityRepository(connection);
        CityService cityService = new CityService(cityRepository);
        cityService.findLastCityRecord();*/
    }
}
