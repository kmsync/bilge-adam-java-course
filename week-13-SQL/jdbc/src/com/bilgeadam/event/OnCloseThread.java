package com.bilgeadam.event;

import java.sql.Connection;
import java.sql.SQLException;

public class OnCloseThread extends Thread{
    private Connection connection;

    public OnCloseThread(Connection connection){
        this.connection = connection;
    }

    @Override
    public void run(){
        try {
            connection.close();
            System.out.println("Bağlantı kapatıldı.");
        }catch (SQLException se){
            System.err.println(se.getMessage());
        }
    }
}
