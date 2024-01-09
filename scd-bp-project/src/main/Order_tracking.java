package main;
import java.sql.*;
public class order_tracking {
		public Order track(int id) {
			Order order = null;
			
			try{
				Class.forName("com.mysql.jdbc.Driver");
				Connection con =
				DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","");
				Statement stmt=con.createStatement();
				ResultSet rs=stmt.executeQuery("SELECT * FROM `order` WHERE order_id="+id+"");
		
				rs.next();
				
				order = new Order();
				
				order.id = rs.getInt(1);
				order.name = rs.getString(2);
				order.address = rs.getString(3);
				order.dateOfDelivery = rs.getString(4);
				order.payment = rs.getInt(5);

				con.close();
			}
			catch(Exception e)
				{
				System.out.println(e);
				}
		return order;	
		}

}
