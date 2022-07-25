package com.bilgeadam.model;

public class Hospital extends Object{

    public Hospital(Patient patient){
        this.patient = patient;
        this.doctor = new Doctor("sadsa","dasda");
        this.name = "Ankara Şehir Hastahanesi";
    }

    private Doctor doctor;
    private Patient patient;
    private String name;

    public String getName() {
        return name;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public Patient getPatient() {
        return patient;
    }

    @Override
    public String toString(){
        return "";
    }
}
