package mypackage;

public class Car_Main {
	public static void main(String[] args) {
		Car myCar = new Car();
		myCar.setEngineStatus(true);
		myCar.setSpeed(60);
		myCar.setFuelLevel(30.4);
		System.out.println("Engine on: " + myCar.getEngineStatus());
		System.out.println("Speed: " + myCar.getSpeed());
		System.out.println("Fuel Level:  " + myCar.getFuelLevel());
    }
}
