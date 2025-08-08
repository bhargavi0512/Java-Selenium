package com.healthcare.module;

public class PatientServiceImp implements PatientService{
	    private Patient[] patients = new Patient[5];
	    
	    private int count = 0;
	    
	    public void registerPatient(Patient patient) {
	        if (count < patients.length) {
	            patients[count] = patient;
	            count++;
	        } else {
	            System.out.println("Patient list is full.");
	        }
	    }

	    public void showPatientDetails(int patientId) {
	        for (int i = 0; i < count; i++) {
	            if (patients[i].getId() == patientId) {
	                System.out.println("ID: " + patients[i].getId());
	                System.out.println("Name: " + patients[i].getName());
	                System.out.println("Age: " + patients[i].getAge());
	                System.out.println("Illness: " + patients[i].getIllness());
	                return;
	            }
	        }
	        System.out.println("Patient not found.");
	    }

	    public Patient[] getAllPatients() {
	        return patients;
	    }

	    public int getCount() {
	        return count;
	    }
	}

