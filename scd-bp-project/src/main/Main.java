package main;
import java.sql.*;
public class Main {

	public static void main(String[] args) {
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con =
			DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","");
			Statement stmt=con.createStatement();
			stmt.executeUpdate("INSERT INTO `cart`(`Product_id`, `Product_name`, `Price`, `discount`, `quantity`, `user_id`) VALUES (3,'cloths',100,10,70,1);");

			con.close();
			} catch(Exception e)
			{
			System.out.println(e);
			}
	}
}
