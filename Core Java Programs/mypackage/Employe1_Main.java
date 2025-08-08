package mypackage;

import java.util.Arrays;

public class Employe1_Main {
	    public static void main(String[] args) {
	        Employe1[] employees = {
	            new Employe1("Aray", 45000),
	            new Employe1("Bhargavi", 30000),
	            new Employe1("Chandini", 55000)
	        };

	        System.out.println("Before sorting:");
	        for (Employe1 e : employees) {
	            System.out.println(e);
	        }

	        Arrays.sort(employees, (e1, e2) -> Double.compare(e1.getSalary(), e2.getSalary()));

	        System.out.println("\nAfter sorting by salary:");
	        for (Employe1 e : employees) {
	            System.out.println(e);
	        }
	    }
}






