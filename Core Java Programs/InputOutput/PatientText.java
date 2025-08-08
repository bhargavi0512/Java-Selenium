package InputOutput;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class PatientText {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);

	        try (
	            BufferedWriter writer = new BufferedWriter(new FileWriter("patients.txt", true))
	        ) {
	            System.out.print("Enter Patient ID: ");
	            int id = sc.nextInt();
	            sc.nextLine(); 

	            System.out.print("Enter Name: ");
	            String name = sc.nextLine();

	            System.out.print("Enter Disease: ");
	            String disease = sc.nextLine();

	            writer.write("ID: " + id + ", Name: " + name + ", Disease: " + disease);
	            writer.newLine();

	            System.out.println("Patient record saved successfully.");

	        } catch (IOException e) {
	            System.out.println("An error occurred: " + e.getMessage());
	        }

	        sc.close();

	}

}
