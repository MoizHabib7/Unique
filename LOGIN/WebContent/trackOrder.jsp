<%@page import="main.Order_trackingProxy"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Track Order</title>
</head>
<body>
    <h2>Track Your Order</h2>

    <form action="trackOrderResult.jsp" method="post">
        <label for="orderId">Order ID:</label>
        <input type="text" id="orderId" name="orderId" required><br>

        <input type="submit" value="Track Order">
    </form>
</body>
</html>