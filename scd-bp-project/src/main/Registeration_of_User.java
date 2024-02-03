package main;
import java.sql.*;

public class Registeration_of_User {
    public int register_user(String email, String name, String password,long phone) {
        int userID = 0; // Initialize userID variable

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root", "");
            Statement stmt = con.createStatement();

            String query = "INSERT INTO registeration(Phone_number, Full_Name, Email, Password) VALUES (" + phone + ",'" + name + "','" + email + "','" + password + "')";

            System.out.println(query);

            // Execute the insert query
            int rowsAffected = stmt.executeUpdate(query);

            if (rowsAffected > 0) {
                // If insertion was successful, retrieve the generated user ID
                ResultSet rs = stmt.getGeneratedKeys();
                if (rs.next()) {
                    userID = rs.getInt(1); // Retrieve the generated user ID
                }
            }

            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
        return userID; // Return the generated user ID
    }
}
