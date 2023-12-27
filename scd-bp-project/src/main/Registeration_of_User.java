package main;
import java.sql.*;
public class Registeration_of_User {
	public int register_user(String email,String name,String password,int phone) {

		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con =
			DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","");
			Statement stmt=con.createStatement();
			
			String query ="INSERT INTO registeration(Phone_number, Full_Name, Email, Password) VALUES ("+phone+",'"+name+"','"+email+"','"+password+"')";

			System.out.println(query);
			
			stmt.executeUpdate(query);

			con.close();
			
			} catch(Exception e)
			{
			System.out.println(e);
			
			}
		return 0;

	}
}

