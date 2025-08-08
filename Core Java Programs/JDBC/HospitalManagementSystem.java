package JDBC;

import java.util.Scanner;
import java.sql.*;

public class HospitalManagementSystem {

	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);
	        System.out.print("Enter Patient Name: ");
	        String name = sc.nextLine();
	        System.out.print("Enter Age: ");
	        int age = sc.nextInt();
	        sc.nextLine(); 
	        System.out.print("Enter Disease: ");
	        String disease = sc.nextLine();
	        System.out.print("Enter Admission Date (YYYY-MM-DD): ");
	        String admissionDate = sc.nextLine();
	        System.out.print("Enter Doctor Assigned: ");
	        String doctor = sc.nextLine();
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Hospital", "root", "Munny@05");
			
			// create a table patients
			
			/*Statement stmt=con.createStatement();
			
			String sql="CREATE TABLE IF NOT EXISTS patients("+"id INT PRIMARY KEY AUTO_INCREMENT,"
					+ "name VARCHAR(100),"+"age INT,"+"disease VARCHAR(100),"+"admission_date DATE,"+"doctor_assigned VARCHAR(100))";
			stmt.executeUpdate(sql);
			System.out.println("Table 'patients' created successfully.");*/
			
			//inserting a values
			
			String insertSQL = "INSERT INTO patients (name, age, disease, admission_date, doctor_assigned) VALUES (?, ?, ?, ?, ?)";
			 
	            PreparedStatement pstmt = con.prepareStatement(insertSQL);
	            pstmt.setString(1, name);
	            pstmt.setInt(2, age);
	            pstmt.setString(3, disease);
	            pstmt.setDate(4, Date.valueOf(admissionDate));
	            pstmt.setString(5, doctor);
	            int rowsInserted = pstmt.executeUpdate();
	            System.out.println("Patient registered successfully!");
	            
	            pstmt.close();
	            //stmt.close();
	            con.close();
	        } catch (ClassNotFoundException e) {
	            System.out.println(" JDBC Driver not found: " + e.getMessage());
	        } catch (SQLException e) {
	            System.out.println("Database error: " + e.getMessage());
	        }
	            
	}
}






