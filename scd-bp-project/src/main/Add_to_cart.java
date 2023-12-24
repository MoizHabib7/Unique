package main;
import java.sql.*;
public class Add_to_cart {
	try{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","");
		Statement stmt=con.createStatement();
		ResultSet rs=stmt.executeQuery("select * from cart where user_id=" + userid + ";");

		while(rs.next())
		{
		System.out.println("product_id " + rs.getString(1) + " produvt_Name: " + rs.getString(2) + "price: "+ rs.getint(3)+"discount:"+rs.getint(4)+"quantity:"+rs.getint);
		}
		con.close();
		}
	catch(Exception e)
		{
		System.out.println(e);
		}
}
