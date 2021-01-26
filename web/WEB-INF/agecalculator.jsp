<%-- 
    Document   : agecalculator
    Created on : 26-Jan-2021, 12:46:36 PM
    Author     : Thomas Skiffington
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Age Calculator</h1>
        <form action="age" method="post">
            Enter your age: <input type="text" name="age" value="${age}"><br>
            <input type="submit" value="Age Next Birthday">
        </form>
            <p>${message}</p>
            <a href="arithmetic"> Arithmetic Calculator </a>
    </body>
</html>
