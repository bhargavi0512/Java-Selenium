package collections;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

class Patient1 {
    private String id;
    private String name;

    public Patient1(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void display() {
        System.out.println("Patient ID: " + id + ", Name: " + name);
    }
}

public class HospitalRegistration {
    public static void main(String[] args) {
    	
        Set<Patient1> patientSet = new HashSet<>();
        Set<String> idSet = new HashSet<>();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Hospital Registration System ---");
            System.out.println("1. Register New Patient");
            System.out.println("2. View All Registered Patients");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.print("Enter patient ID: ");
                    String id = scanner.nextLine();
                    if (idSet.contains(id)) {
                        System.out.println("Patient with ID " + id + " is already registered.");
                    } else {
                        System.out.print("Enter patient Name: ");
                        String name = scanner.nextLine();

                        Patient1 newPatient = new Patient1(id, name);
                        patientSet.add(newPatient);
                        idSet.add(id);
                        System.out.println("Patient registered successfully.");
                    }
                    break;

                case 2:
                    if (patientSet.isEmpty()) {
                        System.out.println("No patients registered.");
                    } else {
                        System.out.println("Registered Patients:");
                        for (Patient1 p : patientSet) {
                            p.display();
                        }
                    }
                    break;

                case 3:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 3);

        scanner.close();
    }
}