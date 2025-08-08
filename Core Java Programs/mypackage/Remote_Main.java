package mypackage;

import java.util.Scanner;

public class Remote_Main {
	    public static void main(String[] args) {
	        
	    	Scanner sc = new Scanner(System.in);
	        System.out.println("Enter 'ac' to press remote button:");
	        String input = sc.nextLine();

	        if (input.equalsIgnoreCase("ac")) {
	            Remote r = new ACRemote();
	            r.pressButton();
	        } else {
	            System.out.println("Unknown remote.");
	        }

	        sc.close();
	    }
}



