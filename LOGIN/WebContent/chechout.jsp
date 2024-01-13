<%@page import="main.Get_cartProxy"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page import="main.Searching" %>
<%@ page import="main.Get_cart" %>
<!DOCTYPE html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Checkout</title>
</head>
<body>
    <nav>
        <ul>
            <li><a href="dashboard.jsp">dashboard</a></li>
            <li><a href="trackOrder.jsp">track order</a></li>
            <li><a href="cart.jsp">cart</a></li>
        </ul>
    </nav>

    <h2>Checkout</h2>

    <%-- Fetch cart items from the database using the Get_cart class --%>
    <%
        // Assuming userId is obtained from your session or request parameter
       // int userId = 1; // Replace with the actual user ID
       int userID =(Integer)(session.getAttribute("myVariable"));
    	//int userID = Integer.parseInt((String)session.getAttribute("myVariable"));
        Get_cart cartService = new Get_cartProxy().getGet_cart();
        Searching[] cartItems = cartService.cart(userID);
    %>

    <%-- Display cart items in a table --%>
    <table border="1">
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Price</th>
            <th>Discount</th>
        </tr>
        <% 
            int totalPrice = 0;
            for (Searching item : cartItems) {
                totalPrice += item.getPrice() - item.getDiscount() ;
        %>
            <tr>
                <td><%= item.getId() %></td>
                <td><%= item.getName() %></td>
                <td><%= item.getPrice() %></td>
                <td><%= item.getDiscount() %></td>
            </tr>
        <% } %>
    </table>

    <p>Final Price: <%= totalPrice %></p>

    <form action="Buy_product.jsp" method="post">
        <label for="name">Your Name:</label>
        <input type="text" id="name" name="name" required><br>

        <label for="address">Delivery Address:</label>
        <input type="text" id="address" name="address" required><br>

        <input type="hidden" name="totalPrice" value="<%= totalPrice %>">
        <input type="submit" value="Proceed to Buy">
    </form>

</body>
</html>
