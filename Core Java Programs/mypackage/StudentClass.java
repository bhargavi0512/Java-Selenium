package mypackage;
import java.util.Scanner;

public class StudentClass {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        
	        System.out.print("Enter number of classes: ");
	        int numClasses = sc.nextInt();

	        
	        int[][] classes = new int[numClasses][];

	        
	        for (int i = 0; i < numClasses; i++) {
	            System.out.print("Enter number of students in Class " + (i + 1) + ": ");
	            int numStudents = sc.nextInt();

	            classes[i] = new int[numStudents]; 

	            for (int j = 0; j < numStudents; j++) {
	                System.out.print("Enter roll number for student " + (j + 1) + ": ");
	                classes[i][j] = sc.nextInt(); 
	            }
	        }

	       
	        System.out.println("\nStudent Roll Numbers Class-wise:");
	        for (int i = 0; i < classes.length; i++) {
	            System.out.print("Class " + (i + 1) + ": ");
	            for (int j = 0; j < classes[i].length; j++) {
	                System.out.print(classes[i][j] + " ");
	            }
	            System.out.println(); 
	        }
	    
	    }
}


