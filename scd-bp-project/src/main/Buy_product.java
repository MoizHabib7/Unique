package main;
import java.sql.*;
public class Buy_product {
    public int create_order(String add, String date, int pay, String user) {
        int orderID = 0; // Initialize orderID variable

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root", "");
            PreparedStatement stmt = con.prepareStatement("INSERT INTO `order`(`user_name`, `address`, `date_of_delivery`, `payment mode`) VALUES (?,?,?,?);", Statement.RETURN_GENERATED_KEYS);
            stmt.setString(1, user);
            stmt.setString(2, add);
            stmt.setString(3, date);
            stmt.setInt(4, pay);

            int rowsAffected = stmt.executeUpdate();
            if (rowsAffected > 0) {
                ResultSet rs = stmt.getGeneratedKeys();
                if (rs.next()) {
                    orderID = rs.getInt(1); // Retrieve the generated order ID
                }
            }
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return orderID; // Return the generated order ID
    }
}
