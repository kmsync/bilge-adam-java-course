package com.bilgeadam.model;

import java.io.Serializable;

public class Student implements Serializable {
    private String name;
    private String id;
    private String branch;
    private String lessons;

    public Student(String name, String id, String branch){
        this.name = name;
        this.id = id;
        this.branch = branch;
    }

    @Override
    public String toString(){
        return "Öğrenci Adı: " + name +
                "\nÖğrenci Numarası: " + id +
                "\nÖğrenci Bölüm: " + branch;
    }
}
