package mypackage;

import java.util.Scanner;

public class Vehicle_Main {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter 'bike' to start the engine:");
	        String input = sc.nextLine();

	        if (input.equalsIgnoreCase("bike")) {
	            Vehicle v = new Bike();
	            v.startEngine();
	        } else {
	            System.out.println("Unknown vehicle.");
	        }

	        sc.close();
	    }
}


