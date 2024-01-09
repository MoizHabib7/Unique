<%@page import="main.Order_tracking"%>
<%@page import="main.Order"%>
<%@page import="main.Order_trackingProxy"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Order Details</title>
</head>
<body>
    <h2>Order Details</h2>

    <%-- Retrieve orderId from the request parameter --%>
    <% String orderIdParam = request.getParameter("orderId");
       int orderId = Integer.parseInt(orderIdParam); %>

    <%-- Use Order_trackingProxy to track the order --%>
    <% Order_tracking orderTrackingService = new Order_trackingProxy().getOrder_tracking();
       Order order = orderTrackingService.track(orderId);

       if (order != null) { %>

        <p>Order ID: <%= order.getId() %></p>
        <p>Name: <%= order.getName() %></p>
        <p>Address: <%= order.getAddress() %></p>
        <p>Date of Delivery: <%= order.getDateOfDelivery() %></p>
        <p>Payment: <%= order.getPayment() %></p>

    <% } else { %>

        <p>No order found with ID <%= orderId %></p>

    <% } %>

    <p><a href="trackOrder.jsp">Back to Track Order</a></p>
</body>
</html>