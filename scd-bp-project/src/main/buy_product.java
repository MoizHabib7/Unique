package main;
import java.sql.*;

public class buy_product {
		public void add_to_cart(String add,String date,int pay,String user) {

			try{
				Class.forName("com.mysql.jdbc.Driver");
				Connection con =
				DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","");
				Statement stmt=con.createStatement();
				stmt.executeUpdate("INSERT INTO order(`address`, `date_of_delivery`, `payment mode`, `user_name`) VALUES ('"+add+"',"+date+","+pay+","+user+");");

				con.close();
				} catch(Exception e)
				{
				
				}
		}
}