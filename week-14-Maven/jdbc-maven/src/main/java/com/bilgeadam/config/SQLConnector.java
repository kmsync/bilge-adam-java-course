package com.bilgeadam.config;

import java.sql.*;

public class SQLConnector {

    private final String USERNAME = "postgres";
    private final String PASSWORD = "postgres";
    private final String DB_NAME = "dvdrental";
    private final String HOSTNAME = "localhost";
    private final int PORT = 5432;
    public Connection connection = null;


    public SQLConnector(){
        // jdbc:postgresql://localhost:5432/dvdrental
        String url = "jdbc:postgresql://" + HOSTNAME + ":" + PORT + "/" + DB_NAME;
        try {
             connection = DriverManager.getConnection(url,USERNAME,PASSWORD);
            System.out.println("Database bağlantısı başarılı.");
        }catch (SQLException sqlException){
            System.err.println("Bağlantı sağlanamadı.");
            System.err.println(sqlException.getSQLState());
            System.err.println(sqlException.getMessage());
        }
    }
}
