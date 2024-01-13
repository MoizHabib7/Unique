<%@page import="main.Order_trackingProxy"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Track Order</title>
</head>
<body>
    <nav>
        <ul>
            <li><a href="dashboard.jsp">dashboard</a></li>
            <li><a href="trackOrder.jsp">track order</a></li>
            <li><a href="cart.jsp">cart</a></li>
        </ul>
    </nav>
    <h2>Track Your Order</h2>

    <form action="trackOrderResult.jsp" method="post">
        <label for="orderId">Order ID:</label>
        <input type="text" id="orderId" name="orderId" required><br>

        <input type="submit" value="Track Order">
    </form>
</body>
</html>