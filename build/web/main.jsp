<%-- 
    Document   : main
    Created on : Jun 23, 2020, 9:12:15 PM
    Author     : Jimit Vaghela
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Main Page.</title>
    </head>
    <body>
        <h1>Addition of numbers</h1>
        <form action="addition.jsp" method="post">
            Enter First Number:<input type="text" name="firstNumber"><br><br>
            Enter Second Number:<input type="text" name="secondNumber"><br><br>
            
            <input type="submit" value="Submit"/>
            
        </form>
    </body>
</html>
