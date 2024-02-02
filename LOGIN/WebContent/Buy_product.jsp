

<%@page import="main.*"%>
<%@page import="main.Buy_product"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.Calendar, java.text.SimpleDateFormat" %>
<%@ page import="main.Searching" %>

<%
    // Check if name and total price are provided in the request
    String name = request.getParameter("name");
    String priceParam = request.getParameter("totalPrice");

    if (name != null && priceParam != null) {
        int price = Integer.parseInt(priceParam);

        // Calculate total payment
        int calculatedPrice = price;

        // Calculate delivery date (assuming it's 5 days from the current date)
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DATE, 5);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String deliveryDate = sdf.format(calendar.getTime());

        // Assuming userId is obtained from your session or request parameter
        Integer userId = (Integer) session.getAttribute("myVariable");
        String stringValue = (userId != null) ? userId.toString() : null;

        // Save order details to the database
        Buy_product buy_product = new Buy_productProxy().getBuy_product();
		//Buy_productProxy
        //int orderID = buyProductProxy.getBuy_product().create_order("address", deliveryDate, calculatedPrice, stringValue);
        int orderID =buy_product.create_order("address", deliveryDate, calculatedPrice, stringValue);
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
    <p>Order ID: <%= orderID %></p>
    <p>Product owner: <%= name %></p>
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
