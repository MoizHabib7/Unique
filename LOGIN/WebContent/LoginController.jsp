<%@page import="main.Login_UserProxy"%>
<%@ page import="main.Login_User" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<%@ page import="java.io.PrintWriter" %>

<%
    int userId = Integer.parseInt(request.getParameter("userId"));
    String password = request.getParameter("password");

    Login_User loginObj = new Login_UserProxy().getLogin_User();
    int storedPassword = loginObj.login(userId);

    response.setContentType("text/html;charset=UTF-8");

    if (storedPassword != 0 && storedPassword == Integer.parseInt(password)) {
        out.println("<h2>Login Successful!</h2>");
    } else {
        out.println("<h2>Login Failed. Invalid User ID or Password.</h2>");
    }
%>