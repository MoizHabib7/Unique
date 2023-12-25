package main;
import java.sql.*;
import java.util.Calendar;

public class order_placed {
	    public static void main(String[] args) {
	        // JDBC connection parameters
	        String url = "jdbc:mysql://localhost:3306/project";
	        String orderid = "autoint";
	        String username = "username";
	        String address = "address";
	        Calendar c = Calendar.getInstance();
	        c.setTime(new Date(0)); // Using today's date
	        c.add(Calendar.DATE, 3); // Adding 5 days
	        String output =getTime();
	        System.out.println(output);;
	        String date_of_delivery = output;
	        
	        // SQL query to insert data
	        String insertQuery = "INSERT INTO order (column1, column2, column3, column4, column5) VALUES (?, ?,?,?,?)";

	        // Sample data to be inserted
	        String value1 = "value1";
	        String value2 = "value2";
	        String value3 = "value3";
	        String value4 = "value4";
	        String value5 = "value5";
	        
	        try {
	            // Establishing a connection
	            Connection connection = DriverManager.getConnection(url, value1,value2);

	            // Creating a prepared statement
	            PreparedStatement preparedStatement = connection.prepareStatement(insertQuery);
	            preparedStatement.setString(1, value1);
	            preparedStatement.setString(2, value2);
	            preparedStatement.setString(3, value3);
	            preparedStatement.setString(4, value4);
	            preparedStatement.setString(5, value5);

	            // Executing the query
	            int rowsAffected = preparedStatement.executeUpdate();

	            System.out.println(rowsAffected + " row(s) affected.");

	            // Closing resources
	            preparedStatement.close();
	            connection.close();
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }

		private static String getTime() {
			// TODO Auto-generated method stub
			return null;
		}
	}

