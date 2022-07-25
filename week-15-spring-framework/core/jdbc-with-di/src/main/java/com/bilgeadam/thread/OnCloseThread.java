package com.bilgeadam.thread;

import org.springframework.stereotype.Component;

import java.sql.Connection;
import java.sql.SQLException;

@Component
public class OnCloseThread extends Thread{
    private final Connection connection;

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
