package mypackage;
import java.util.Arrays;


class Employe1 {
	 private String name;
	 private double salary;

	    public Employe1(String name, double salary) {
	        this.name = name;
	        this.salary = salary;
	    }

	    public String getName() {
	        return name;
	    }

	    public double getSalary() {
	        return salary;
	    }

	    public String toString() {
	        return name + " - " + salary;
	    }
}
	  


