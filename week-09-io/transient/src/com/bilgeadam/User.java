package com.bilgeadam;

import java.io.Serializable;

public class User implements Serializable {
    public User(String id, String username, String password) {
        objectCount++;
        this.id = id;
        this.username = username;
        this.password = password;
    }

    private String id;
    private String username;
    private transient String password;
    public static int objectCount = 0;

    @Override
    public String toString(){
        return "id: "+id+ " username: " + username + " password:"+password + " object count: " +objectCount;
    }
}
