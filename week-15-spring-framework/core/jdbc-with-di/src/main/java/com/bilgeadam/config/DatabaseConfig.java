package com.bilgeadam.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

@Configuration
public class DatabaseConfig {
    private final String USERNAME = "postgres";
    private final String PASSWORD = "postgres";
    private final String DB_NAME = "dvdrental";
    private final String HOSTNAME = "localhost";
    private final int PORT = 5432;

    @Bean
    public Connection connection(){
        // jdbc:postgresql://localhost:5432/dvdrental
        String url = "jdbc:postgresql://" + HOSTNAME + ":" + PORT + "/" + DB_NAME;
        try {
            System.out.println("Database bağlantısı başarılı.");
            return DriverManager.getConnection(url,USERNAME,PASSWORD);
        }catch (SQLException sqlException){
            System.err.println("Bağlantı sağlanamadı.");
            System.err.println(sqlException.getSQLState());
            System.err.println(sqlException.getMessage());
        }
        return null;
    }
}
