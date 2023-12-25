package main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.*;

public class insert_product_in_cart {
	 public static void main(String[] args) {
		 // JDBC connection parameters
	     String url = "jdbc:mysql://localhost:3306/project";
       
	     // SQL query to insert data
        String insertQuery = "INSERT INTO cart VALUES (?, ?, ?, ?, ?, ?)";

        // Sample data to be inserted
        String value1 = "value1";
        String value2 = "value2";
        String value3 = "value3";
        String value4 = "value4";
        String value5 = "value5";
        String value6 = "value6";

        try {
            // Establishing a connection
            Connection connection = DriverManager.getConnection(url);

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
           }
        catch (SQLException e) {
           e.printStackTrace();
        }
    }
}
