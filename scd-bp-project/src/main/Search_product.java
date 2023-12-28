package main;
import java.sql.*;
public class Search_product {
	public Searching search(int id) {
		Searching sear=null;
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con =
			DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","");
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery("select * from product where product_id="+id+"");
			sear=new Searching();
			sear.id=rs.getInt(1);
			sear.name=rs.getString(2);
			sear.price=rs.getInt(3);
			sear.discount=rs.getInt(4);
			con.close();
			}
		catch(Exception e)
			{
			System.out.println(e);
			}
		return sear;
	}
}