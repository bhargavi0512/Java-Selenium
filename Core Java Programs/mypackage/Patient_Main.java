package mypackage;

public class Patient_Main {
	    public static void main(String[] args) {
	        Patient p = new Patient();

	        p.setName("Rani");
	        p.setHealthInfo("High Blood Pressure");  

	        System.out.println("Patient Name: " + p.getName());
	        System.out.println("Health Info: " + p.getHealthInfo());
	    }
}
