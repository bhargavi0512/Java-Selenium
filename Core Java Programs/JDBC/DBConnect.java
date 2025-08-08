package JDBC;
//import java.sql.DriverManager;
 
import java.sql.*;
 
public class DBConnect
{
public static void main(String[] args)
	{
 
	try {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Hospital", "root", "Munny@05");
		
        // creating a table
		/*Statement stmt=con.createStatement();
		String sql="CREATE TABLE IF NOT EXISTS patient("+"id INT PRIMARY KEY AUTO_INCREMENT,"
				+ "name VARCHAR(100),"+"age INT,"+"disease VARCHAR(100))";
		stmt.executeUpdate(sql);
		System.out.println("Table 'patient' created successfully.");*/
		
		
		// inserting a values to patient table
		
		/*String sql="INSERT INTO patient(name, age, disease) VALUES(?, ?, ?)";
		PreparedStatement pstmt=con.prepareStatement(sql);
		String[][] data=
			{
					{"Sana", "22", "Fever"},
					{"Sri", "23", "Cold"},
					{"Suma", "22", "headche"},
					{"Sam", "22", "Pain"},
					{"Siri", "20","Cough"}
			};
				for(String[] row : data)
			{
				pstmt.setString(1, row[0]);
				pstmt.setInt(2, Integer.parseInt(row[1]));
				pstmt.setString(3, row[2]);
				pstmt.executeUpdate();
			}
			System.out.println(" All patients inserted successfully");*/
		
		//update a patient
		
        /*String sql="UPDATE patient SET name=? WHERE name=?";
		PreparedStatement pstmt=con.prepareStatement(sql);
        pstmt.setString(1, "Sony");
		pstmt.setString(2, "Siri");
		int rows=pstmt.executeUpdate();
		System.out.println("Patient name updated successfully");*/
		
		String[][] nameUpdates = {
	            {"Sony", "Siri"},
	            {"Pooja", "Sam"},
	            {"Anshu", "Sri"}
	        };

		
		String sql = "UPDATE patient SET name = ? WHERE name = ?";
        PreparedStatement pstmt = con.prepareStatement(sql);

        for (String[] update : nameUpdates) {
            pstmt.setString(1, update[0]);
            pstmt.setString(2, update[1]); 

            int rows = pstmt.executeUpdate();
            System.out.println("Updated " + rows + " row(s): " + update[1] + " → " + update[0]);
        }

		
		con.close();
	}
		catch (Exception e)
	{
			e.printStackTrace();
			
		}
	}
}
 
 