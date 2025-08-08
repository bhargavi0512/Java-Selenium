package com.healthcare.module;

public class Cardiologist extends Doctor {
    public Cardiologist(String name) {
        super(name, "Cardiologist"); 
    }
    public void diagnose(Patient patient) {
        System.out.println(name + "(Cardiologist)");
        if (patient.getIllness().toLowerCase().contains("heart")) {
            System.out.println("Diagnosis: This is a heart-related issue.");
        } else {
            System.out.println("Diagnosis: This is not a heart-related issue.");
        }
    }
}


