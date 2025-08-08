package collections;

import java.util.LinkedList;
import java.util.Scanner;
 
public class PatientQueueDemo {
public static void main(String[] args) {
 
	LinkedList<String> patientQueue=new LinkedList<>();   
	Scanner sc = new Scanner(System.in);
	int choice;
	
	while(true) {
		System.out.println("\n Hospital Patient Queue_ _ _ :");
		System.out.println("1. Add New Patient(normal)");
		System.out.println("2. Add emergeny patient");
		System.out.println("3. Remove patient");
		System.out.println("4. View all Patient");
		System.out.println("5. View first and last patient");
		System.out.println("6. Exit");
		System.out.println("Enter your choice :");
		choice =sc.nextInt();
		sc.nextLine();
		
	switch(choice)
	{
	case 1:
		System.out.println("Enter patient name :");
        String patient =sc.nextLine();
        patientQueue.addLast(patient);
	    System.out.println("Added to queue.");
	    break;    
	case 2:
		System.out.println("Enter emergency patient name :");
		String emergencyPatient= sc.nextLine();
        patientQueue.addFirst(emergencyPatient);
	    System.out.println("Emergency pateint added to front :");
	    break;
	    
	case 3:
	    System.out.print("Enter patient name to remove: ");
	    String removeName = sc.nextLine();
	    boolean removed = patientQueue.remove(removeName);
	    if (removed) {
	        System.out.println(removeName + " removed from the queue.");
	    } else {
	        System.out.println(removeName + " not found in the queue.");
	    }
	    break;
	    
	case 4:
		System.out.println("Current Queue :" +patientQueue);
        break;
        
	case 5:
		if(!patientQueue.isEmpty())
		{
			System.out.println("First :" +patientQueue.getFirst());
			System.out.println("Last :" +patientQueue.getLast());
		}
        else
		{
			System.out.println("Queue is empty");
		}
        break;
	case 6:
		System.out.println("Exiting......");
		break;
    
	default:
		System.out.println("Invalid Choice");
	}
    
	//sc.close();
}
    }
}
