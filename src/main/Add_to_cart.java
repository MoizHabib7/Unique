import java.sql.*;
package main;

public class Add_to_cart {

	public static void main(String[] args) {
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con =
			DriverManager.getConnection("jdbc:mysql://localhost:3306/tutorial","root","");
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery("select * from teacher");

			while(rs.next())
			{
			System.out.println("ID: " + rs.getInt(1) + " Name: " + rs.getString(2) + " Designation: "
			+ rs.getString(3));
			}
			con.close();
			} catch(Exception e)
			{
			System.out.println(e);
			}
	}

}
