<%@page import="main.Registeration_of_UserProxy"%>
<%@page import="main.Registeration_of_User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.io.*,java.util.*" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Signup Process</title>
</head>
<body>
    <%
        String email = request.getParameter("email");
        String name = request.getParameter("name");
        String password = request.getParameter("password");
        int phone = Integer.parseInt(request.getParameter("phone"));

        // Perform user registration using the Registeration_of_User class
        Registeration_of_User registration = new Registeration_of_UserProxy().getRegisteration_of_User();
        int result = registration.register_user(email, name, password, phone);

        if (result == 0) {
            // If registration is successful, redirect to a success page or login page
            response.sendRedirect("login.jsp");
        } else {
            // If registration fails, redirect back to the signup page with an error message
            response.sendRedirect("signup.jsp?signupFailed=true");
        }
    %>
</body>
</html>