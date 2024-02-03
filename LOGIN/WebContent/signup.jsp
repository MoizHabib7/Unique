<%@page import="main.Registeration_of_User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Sign Up</title>
</head>
<body>
    <h2>Sign Up</h2>
    
    <form action="signupProcess.jsp" method="post">
        <label for="name">Full Name:</label>
        <input type="text" id="name" name="name" required><br>

        <label for="email">Email:</label>
        <input type="text" id="email" name="email" required><br>

        <label for="password">Pin Code:</label>
        <input type="password" id="password" name="password" required><br>

        <label for="phone">Phone Number:</label>
        <input type="text" id="phone" name="phone" required><br>

        <input type="submit" value="Sign Up">
    </form>

    <p>Already have an account? <a href="login.jsp">Login</a></p>
</body>
</html>