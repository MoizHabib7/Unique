package main;

import java.sql.*;

public class Get_products {
    public Searching[] dashboard() {
    	Searching[] items=null;
        Searching sear = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root", "");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select * from product");
            
            rs.last();
            int size=rs.getRow();
            rs.beforeFirst();
            
            items= new Searching[size];
            int i=0;

            while (rs.next()) {
                sear = new Searching();
                sear.id = rs.getInt(1);
                sear.name = rs.getString(2);
                sear.price = rs.getInt(3);
                sear.discount = rs.getInt(4);
                System.out.println("ID: " + rs.getInt(1) + " Name: " + rs.getString(2));
                items[i]=sear;
                i++;
            }
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return items;
    }
}
