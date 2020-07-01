<%-- 
    Document   : addition
    Created on : Jun 23, 2020, 9:19:22 PM
    Author     : Jimit Vaghela
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Addition Process.</title>
    </head>
    <body>
        
        <%= "<h1> The sum is "+(Integer.parseInt(request.getParameter("firstNumber"))+Integer.parseInt(request.getParameter("secondNumber")))+"</h1>"%>
        
    </body>
</html>
