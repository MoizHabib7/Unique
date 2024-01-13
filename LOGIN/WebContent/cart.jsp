<%@page import="main.Get_cartProxy"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page import="main.Get_cart" %>
<%@page import="main.Searching"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Cart</title>
</head>
<body>
    <nav>
        <ul>
            <li><a href="dashboard.jsp">dashboard</a></li>
            <li><a href="trackOrder.jsp">track order</a></li>
            <li><a href="cart.jsp">cart</a></li>
        </ul>
    </nav>

    <h2>Your Cart</h2>

    <%-- Fetch cart items from the database using the Get_cart class --%>
    <%
        // Assuming userId is obtained from your session or request parameter
        int userId = 1; // Replace with the actual user ID
        Get_cart cartService = new Get_cartProxy().getGet_cart();
        Searching[] cartItems = cartService.cart(userId);
    %>

    <%-- Display cart items in a table with a link to buy each product --%>
    <table border="1">
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Price</th>
            <th>Discount</th>
            
        </tr>
        <% for (Searching item : cartItems) { %>
            <tr>
                <td><%= item.getId() %></td>
                <td><%= item.getName() %></td>
                <td><%= item.getPrice() %></td>
                <td><%= item.getDiscount() %></td>
                
            </tr>
         <button>
    		<a href="chechout.jsp">Buy Product</a>
		</button>
            
        <% } %>
    </table>

</body>
</html>
