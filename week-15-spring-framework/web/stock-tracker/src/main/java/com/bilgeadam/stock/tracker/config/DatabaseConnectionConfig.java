package com.bilgeadam.stock.tracker.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

@Configuration
public class DatabaseConnectionConfig {

    private final Logger logger = LoggerFactory.getLogger(DatabaseConnectionConfig.class);

    @Value("${app.stock.database.username}")
    private String USERNAME;

    @Value("${app.stock.database.password}")
    private String PASSWORD;

    @Value("${app.stock.database.dbName}")
    private String DB_NAME;

    @Value("${app.stock.database.hostname}")
    private String HOSTNAME;

    @Value("${app.stock.database.port}")
    private int PORT;


    @Bean
    public Connection connection() {
        // jdbc:postgresql://localhost:5432/stock
        String url = "jdbc:postgresql://" + HOSTNAME + ":" + PORT + "/" + DB_NAME;
        try {
            Connection connection = DriverManager.getConnection(url, USERNAME, PASSWORD);
            this.logger.info("Database bağlantısı başarıyla kuruldu.");
            return connection;
        } catch (SQLException e) {
            this.logger.error("Database bağlantısı kurulamadı." +
                    " SQL State: " + e.getSQLState() +
                    " Reason:" + e.getMessage());
        }
        return null;
    }
}
