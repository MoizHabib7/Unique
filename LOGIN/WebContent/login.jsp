<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Login Panel</title>
</head>
<body>
    <h2>Login Panel</h2>
    
    <form action="LoginController.jsp" method="post">
        <label for="userId">User ID:</label>
        <input type="text" id="userId" name="userId" required><br>

        <label for="password">Password:</label>
        <input type="password" id="password" name="password" required><br>

        <input type="submit" value="Login">
    </form>
    <p>don't have an Account? <a href="signup.jsp">SignUp</a></p>
</body>
</html>