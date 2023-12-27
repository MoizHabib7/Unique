package main;
import java.sql.*;
public class Search_product {
	public int search(int id) {
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con =
			DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","");
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery("select * from product where product_id="+id+"");
	
			while(rs.next())
			{
			System.out.println("ID: " + rs.getInt(1) + " name: " + rs.getString(2) + " price: "
			+ rs.getInt(3) + " discount: " + rs.getInt(4));
			}
			con.close();
			}
		catch(Exception e)
			{
			System.out.println(e);
			}
	return 0;	
	}
	}
	//return 0;
