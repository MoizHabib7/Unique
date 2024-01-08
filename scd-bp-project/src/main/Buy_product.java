package main;
import java.sql.*;

public class buy_product {
		public void add_to_cart(String add,String date,int pay,String user) {
			try{
				Class.forName("com.mysql.jdbc.Driver");
				Connection con =
				DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","");
				PreparedStatement stmt=con.prepareStatement("INSERT INTO `order`(`user_name`, `address`, `date_of_delivery`, `payment mode`) VALUES (?,?,?,?);");
				stmt.setString(1, user);
				stmt.setString(2, add);
				stmt.setString(3, date);
				stmt.setInt(4, pay);				
				stmt.executeUpdate();
				con.close();
				} catch(Exception e)
				{
					e.printStackTrace();
				}
		}
}