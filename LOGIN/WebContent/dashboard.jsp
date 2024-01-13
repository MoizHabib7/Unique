<%@ page import="main.Search_product"%>
<%@page import="main.Searching"%>
<%@page import="main.Cart_Handling"%>
<%@page import="main.Get_products"%>
<%@page import="main.Search_productProxy"%>
<%@page import="main.Get_productsProxy"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>


<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <nav>
        <ul>
            <li><a href="dashboard.jsp">dashboard</a></li>
            <li><a href="trackOrder.jsp">track order</a></li>
            <li><a href="cart.jsp">cart</a></li>
        </ul>
    </nav>
    
    <!-- Search Form -->
    <form action="dashboard.jsp" method="post">
        <input type="search" name="productId" placeholder="Enter Product ID">
        <button type="submit">Search</button>
    </form>

    <!-- Display Product Table -->
    <table border="1">
        <tr>
            <th>product id</th>
            <th>product name</th>
            <th>price</th>
            <th>discount</th>
            <th>Action</th>
        </tr>
        <%
            if (request.getParameter("productId") != null) {
                // If a product ID is provided in the search form, call the search web service
                int searchProductId = Integer.parseInt(request.getParameter("productId"));
                Search_product searchProduct = new Search_productProxy().getSearch_product();
                Searching searchedProduct = searchProduct.search(searchProductId);
        %>
                <!-- Display searched product -->
                <tr>
                    <td><%= searchedProduct.getId() %></td>
                    <td><%= searchedProduct.getName() %></td>
                    <td><%= searchedProduct.getPrice() %></td>
                    <td><%= searchedProduct.getDiscount() %></td>
                    <td><a href="addToCart.jsp?name=<%= searchedProduct.getName() %>&price=<%= searchedProduct.getPrice() %>&discount=<%= searchedProduct.getDiscount() %>">add to cart</a></td>
                       
                </tr>
        <%
            } else {
                // If no product ID is provided, display all products
                Get_products products = new Get_productsProxy().getGet_products();
                
                Searching[] items = products.dashboard();
                for(int i=0;i<items.length;i++){
                	
                


                %>
                    <!-- Display all products -->
                    <tr>
                        <td><%= items[i].getId() %></td>
                        <td><%= items[i].getName() %></td>
                        <td><%= items[i].getPrice() %></td>
                        <td><%= items[i].getDiscount() %></td>
                        <td><a href="addToCart.jsp?name=<%= items[i].getName() %>&price=<%= items[i].getPrice() %>&discount=<%= items[i].getDiscount() %>">add to cart</a></td>
                       
                    </tr>
      
        <%
                }
                          
            }
        %>
    </table>
</body>
</html>
