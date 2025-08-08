package collections;

import java.util.LinkedList;
import java.util.Scanner;

class Patients{
	private String name;
	private String id;
	
	public Patients(String name, String id) {
		this.name=name;
		this.id=id;
	}
	public String getName() {
		return name;
	}
	public String getId() {
		return id;
	}
	public void display() {
		System.out.println("Patient Name:" + name);
		System.out.println("ID: " + id);
	}
}

public class SmartHospitalQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 LinkedList<Patients> queue = new LinkedList<>();
	        Scanner sc = new Scanner(System.in);
	        int choice;

	        do {
	            System.out.println("\n--- Smart Hospital Queue System ---");
	            System.out.println("1. Add Normal Patient");
	            System.out.println("2. Add Emergency Patient");
	            System.out.println("3. Cancel Appointment (by ID)");
	            System.out.println("4. View All Patients");
	            System.out.println("5. View Next Patient");
	            System.out.println("6. View Last Patient");
	            System.out.println("7. Exit");
	            System.out.print("Enter your choice: ");
	            choice = sc.nextInt();
	            sc.nextLine(); 

	            switch (choice) {
	                case 1:
	                    System.out.print("Enter patient name: ");
	                    String name = sc.nextLine();
	                    System.out.print("Enter patient ID: ");
	                    String id = sc.nextLine();

	                    if (isDuplicate(queue, id)) {
	                        System.out.println("Patient with ID " + id + " already exists!");
	                    } else {
	                        queue.addLast(new Patients(name, id));
	                        System.out.println("Patient added to the end of the queue.");
	                    }
	                    break;

	                case 2:
	                    System.out.print("Enter emergency patient name: ");
	                    String eName = sc.nextLine();
	                    System.out.print("Enter emergency patient ID: ");
	                    String eId = sc.nextLine();

	                    if (isDuplicate(queue, eId)) {
	                        System.out.println("Patient with ID " + eId + " already exists!");
	                    } else {
	                        queue.addFirst(new Patients(eName, eId));
	                        System.out.println("Emergency patient added to the front of the queue.");
	                    }
	                    break;

	                case 3:
	                    System.out.print("Enter patient ID to cancel appointment: ");
	                    String cancelId = sc.nextLine();
	                    boolean removed = false;

	                    for (int i = 0; i < queue.size(); i++) {
	                        if (queue.get(i).getId().equals(cancelId)) {
	                            queue.remove(i);
	                            System.out.println("Appointment for ID " + cancelId + " canceled.");
	                            removed = true;
	                            break;
	                        }
	                    }

	                    if (!removed) {
	                        System.out.println("No patient found with ID " + cancelId);
	                    }
	                    break;

	                case 4:
	                    if (queue.isEmpty()) {
	                        System.out.println("No patients in queue.");
	                    } else {
	                        System.out.println("All Patients in Queue:");
	                        for (Patients p : queue) {
	                            p.display();
	                        }
	                    }
	                    break;

	                case 5:
	                    if (!queue.isEmpty()) {
	                        System.out.println("Next Patient:");
	                        queue.getFirst().display();
	                    } else {
	                        System.out.println("Queue is empty.");
	                    }
	                    break;

	                case 6:
	                    if (!queue.isEmpty()) {
	                        System.out.println("Last Patient:");
	                        queue.getLast().display();
	                    } else {
	                        System.out.println("Queue is empty.");
	                    }
	                    break;

	                case 7:
	                    System.out.println("Exiting system...");
	                    break;

	                default:
	                    System.out.println("Invalid choice. Try again.");
	            }
	        } while (choice != 7);

	        sc.close();
	    }

	    public static boolean isDuplicate(LinkedList<Patients> queue, String id) {
	        for (Patients p : queue) {
	            if (p.getId().equals(id)) {
	                return true;
	            }
	        }
	        return false;

	}

}
