package mypackage;

public class EmployeeDetails {
	    String name;
	    String department;
	    int id;
	    double salary;
	    void addEmployeeDetails(String empName, String empDepartment, int empId, double empSalary) {
	        name = empName;
	        department = empDepartment;
	        id = empId;
	        salary = empSalary;
	    }
	    void displayEmployeeDetails() {
	        System.out.println("Employee Details");
	        System.out.println("Name  : " + name);
	        System.out.println("Department : " + department);
	        System.out.println("Id   : " + id);
	        System.out.println("Salary  : ₹" + salary);
	    }

	    public static void main(String[] args) {

	        EmployeeDetails emp1 = new EmployeeDetails();

	        emp1.addEmployeeDetails("Bhargavi", "IT", 201, 25000);
	        emp1.displayEmployeeDetails();
	    }
	}


