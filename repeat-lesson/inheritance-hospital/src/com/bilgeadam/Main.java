package com.bilgeadam;

import com.bilgeadam.model.Hospital;
import com.bilgeadam.model.Patient;

public class Main {

    public static void main(String[] args) {
        Patient patient = new Patient("dasda","dasdas");
        Hospital hospital = new Hospital(patient);
        System.out.println(hospital.getDoctor().getName());
        hospital = null;
        System.out.println(patient.getName());
        System.out.println(hospital.getDoctor().getName());
    }
}
