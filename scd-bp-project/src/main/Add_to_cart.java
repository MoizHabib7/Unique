package main;
import java.sql.*;
public class Add_to_cart {
	public void getcartdetails(String userid) {
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","");
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery("select * from cart where user_id=1");

			while(rs.next())
			{
			System.out.println("product_id " + rs.getString(1) + " product_Name: " + rs.getString(2) + "price: "+ rs.getInt(3) +"discount:"+rs.getInt(4)+"quantity:"+rs.getInt(5));
			}
			con.close();
			}
		catch(Exception e)
			{
			System.out.println(e);
			}
	}
}
