package mypackage;
import java.util.Scanner;

abstract class Vehicle {
	abstract void startEngine();
	}
	class Bike extends Vehicle {
	    void startEngine() {
	        System.out.println("Bike engine started.");
	    }
	}
