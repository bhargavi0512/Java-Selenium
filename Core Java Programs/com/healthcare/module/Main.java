package com.healthcare.module;

public class Main {
    public static void main(String[] args) {
        PatientServiceImp service = new PatientServiceImp();

        Patient p1 = new Patient(1, "Bhargavi", 20, "Fever");
        Patient p2 = new Patient(2, "Rani", 30, "Heart Pain");

        service.registerPatient(p1);
        service.registerPatient(p2);

        service.showPatientDetails(1);
        service.showPatientDetails(2);

        Doctor doc1 = new GeneralPhysician("Dr. Meena");
        Doctor doc2 = new Cardiologist("Dr. Ramesh");

        doc1.diagnose(p1);
        doc2.diagnose(p1);
        
        doc1.diagnose(p2);
        doc2.diagnose(p2);
    }
}


