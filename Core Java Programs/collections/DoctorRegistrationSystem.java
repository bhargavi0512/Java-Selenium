package collections;

import java.util.*;

class Doctor{
	private String licenseNumber;
	private String name;
	private String department;
	
	public Doctor(String licenseNumber, String name, String department) {
		this.licenseNumber=licenseNumber;
		this.name=name;
		this.department=department;
	}
	
	public String getLicenseNumber() {
		return licenseNumber;
	}
	
	public String getName() {
		return name;
	}
	
	public String getDepartment() {
		return department;
	}
	
	 public boolean equals(Object obj) {
	        if (this == obj) return true; 
	        if (!(obj instanceof Doctor)) return false; 
	        Doctor doctor = (Doctor) obj;
	        return licenseNumber.equals(doctor.licenseNumber); 
	    }

	    public int hashCode() {
	        return Objects.hash(licenseNumber);
	    }

	    public String toString() {
	        return "Doctor [License Number: " + licenseNumber + ", Name: " + name + ", Department: " + department + "]";
	    }
	}

public class DoctorRegistrationSystem {

	public static void main(String[] args) {

		Set<Doctor> doctorSet = new HashSet<>();
	        Scanner scanner = new Scanner(System.in);
	        int choice;

	        do {
	            System.out.println("\n--- Doctor Registration System ---");
	            System.out.println("1. Add New Doctor");
	            System.out.println("2. Display All Doctors");
	            System.out.println("3. Exit");
	            System.out.print("Enter your choice: ");
	            choice = scanner.nextInt();
	            scanner.nextLine(); 

	            switch (choice) {
	                case 1:
	                    System.out.print("Enter License Number: ");
	                    String license = scanner.nextLine();
	                    System.out.print("Enter Name: ");
	                    String name = scanner.nextLine();
	                    System.out.print("Enter Department: ");
	                    String dept = scanner.nextLine();

	                    Doctor doctor = new Doctor(license, name, dept);
	                    boolean added = doctorSet.add(doctor); 

	                    if (added) {
	                        System.out.println("Doctor registered successfully.");
	                    } else {
	                        System.out.println("Doctor with this license number is already registered!");
	                    }
	                    break;

	                case 2:
	                    System.out.println("\nRegistered Doctors:");
	                    if (doctorSet.isEmpty()) {
	                        System.out.println("No doctors registered yet.");
	                    } else {
	                        for (Doctor d : doctorSet) {
	                            System.out.println(d);
	                        }
	                    }
	                    break;

	                case 3:
	                    System.out.println("Exiting...");
	                    break;

	                default:
	                    System.out.println("Invalid choice! Please try again.");
	            }

	        } while (choice != 3);

	        scanner.close();

	}

}
