package main;
import java.sql.*;
public class Add_to_cart {

	public static void main(String[] args) {
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con =
			DriverManager.getConnection("jdbc:mysql://localhost:3306/sql file","root","");
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery("select * from cart");

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
