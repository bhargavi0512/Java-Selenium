package collections;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

class Patient2{
	private String id;
	private String name;

    public Patient2(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Patient2 patient = (Patient2) obj;
        return id.equals(patient.id);
    }

    public int hashCode() {
        return id.hashCode();
    }


    public void display() {
        System.out.println("Patient ID: " + id + ", Name: " + name);
    }
}


    public class HospitalQueue {

	    public static void main(String[] args) {
	    	Set<Patient2> patientSet = new HashSet<>();
	        Scanner scanner = new Scanner(System.in);
	        int choice;

	        do {
	            System.out.println("\n--- Hospital Patient Registration ---");
	            System.out.println("1. Register New Patient");
	            System.out.println("2. View All Registered Patients");
	            System.out.println("3. Exit");
	            System.out.print("Enter your choice: ");
	            choice = scanner.nextInt();
	            scanner.nextLine(); 

	            switch (choice) {
	                case 1:
	                    System.out.print("Enter Patient ID: ");
	                    String id = scanner.nextLine();
	                    System.out.print("Enter Patient Name: ");
	                    String name = scanner.nextLine();

	                    Patient2 newPatient = new Patient2(id, name);
	                    boolean added = patientSet.add(newPatient);  

	                    if (added) {
	                        System.out.println("Patient registered successfully.");
	                    } else {
	                        System.out.println("Patient with ID " + id + " is already registered.");
	                    }
	                    break;

	                case 2:
	                    System.out.println("\n--- Registered Patients ---");
	                    if (patientSet.isEmpty()) {
	                        System.out.println("No patients registered yet.");
	                    } else {
	                        for (Patient2 p : patientSet) {
	                            p.display();
	                        }
	                    }
	                    break;

	                case 3:
	                    System.out.println("Exiting...");
	                    break;

	                default:
	                    System.out.println("Invalid choice. Please try again.");
	            }

	        } while (choice != 3);

	        scanner.close();
	}
    

}
