<%@page import="main.Buy_productProxy"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.Calendar, java.text.SimpleDateFormat" %>
<%@ page import="main.Searching" %>

<%
    // Check if productId, name, price, and discount are provided in the request
    String productIdParam ="0";
    String name = request.getParameter("name");
    String priceParam = request.getParameter("totalPrice");
    String discountParam ="0";

    if (productIdParam != null && name != null && priceParam != null && discountParam != null) {
        int productId = Integer.parseInt(productIdParam);
        int price = Integer.parseInt(priceParam);
        int discount = Integer.parseInt(discountParam);

        // Fetch product details using the productId
       
        Searching[] product = new main.Get_cartProxy().getGet_cart().cart(productId);

        // Calculate total payment
        int calculatedPrice = (price -discount);

        // Calculate delivery date (assuming it's 5 days from the current date)
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DATE, 5);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String deliveryDate = sdf.format(calendar.getTime());

        // Assuming userId is obtained from your session or request parameter
        
		Integer i = (Integer) session.getAttribute("myVariable");
  	    String stringValue = (i != null) ? i.toString() : null;        //String userId = "1"; 
		
        // Save order details to the database
        Buy_productProxy buyProductProxy = new Buy_productProxy();
        buyProductProxy.getBuy_product().create_order("address", deliveryDate, calculatedPrice, stringValue);

        // Display success message and order details
%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Order Confirmation</title>
</head>
<body>
    <h2>Order Confirmation</h2>

    <p>Thank you for your order!</p>
    <p>Product: <%= name %></p>
    <p>Calculated Price: <%= calculatedPrice %></p>
    <p>Estimated Date of Delivery: <%= deliveryDate %></p>
</body>
</html>
<%
    } else {
        // Display an error message if essential parameters are not provided
        out.println("Error: Essential parameters are missing.");
    }
%>
