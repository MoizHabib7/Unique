<%@page import="main.Cart_HandlingProxy"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page import="main.Cart_Handling" %>

<%
    // Get product ID from the parameter
   // int productId = Integer.parseInt(request.getParameter("id"));

    // Assuming you have product details available, retrieve them using the product ID
    // For example, you can have another service to get product details based on the ID

    // Hardcoded product details for demonstration purposes
    //String productName = "Sample Product";
    //int price = 10;
    //int discount = 2;
    int quantity = 1; // You can adjust the quantity as needed

    // Call the Cart_Handling class to add the product to the cart
    Cart_Handling cartHandler = new Cart_HandlingProxy().getCart_Handling();
    request.getParameter("price"); 
    cartHandler.add_to_cart(request.getParameter("name"),Integer.parseInt(request.getParameter("price")) , Integer.parseInt(request.getParameter("discount")), quantity,1); // getUserId() needs to be implemented
	
    // Redirect back to the dashboard after adding to the cart
    response.sendRedirect("dashboard.jsp");
%>
