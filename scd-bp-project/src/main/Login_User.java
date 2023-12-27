package main;
import java.sql.*;
public class Login_User {
	public int  login(int id) {
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con =
			DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","");
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery("SELECT Password FROM `registeration` WHERE User_ID="+id+"");
	
			while(rs.next())
			{
			System.out.println("Password: " + rs.getInt(1));
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
