package main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Cart_Handling {
	public int add_to_cart(String pro,int pri,int dis,int quan,int user) {

		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con =
			DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","");
			Statement stmt=con.createStatement();
			stmt.executeUpdate("INSERT INTO `cart`(`Product_name`, `Price`, `discount`, `quantity`, `user_id`) VALUES ('"+pro+"',"+pri+","+dis+","+quan+","+user+");");

			con.close();
			} catch(Exception e)
			{
			System.out.println(e);
			}
		return 0;
	}
}
