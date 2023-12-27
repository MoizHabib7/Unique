package main;
import java.sql.*;
public class Main {
		public int track(int id) {
			try{
				Class.forName("com.mysql.jdbc.Driver");
				Connection con =
				DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","");
				Statement stmt=con.createStatement();
				ResultSet rs=stmt.executeQuery("select * from order where product_id="+id+"");
		
				while(rs.next())
				{
				System.out.println("ID: " + rs.getInt(1) + " name: " + rs.getString(2) + " address: "
				+ rs.getString(3) + " date_of_delivery: " + rs.getString(4)+ " payment: " + rs.getInt(5));
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