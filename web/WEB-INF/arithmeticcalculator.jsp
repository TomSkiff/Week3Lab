<%-- 
    Document   : arithmeticcalculator
    Created on : 26-Jan-2021, 2:44:41 PM
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
        <h1>Arithmetic Calculator</h1>
        <form action="arithmetic" method ="post" >
            First: <input type="text" name="first" value="${first}"><br>
            Second: <input type="text" name="second" value="${second}"><br>
            <input type="submit" value="+" name="+" >
            <input type="submit" value="-" name="-" >
            <input type="submit" value="*" name="*" >
            <input type="submit" value="%" name="%" ><br>
            <p>Result:${result}</p>
            <a href="age"> Age calculator </a>
        </form>
    </body>
</html>
