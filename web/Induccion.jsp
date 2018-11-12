<%-- 
    Document   : Induccion
    Created on : 17/08/2018, 12:02:26 PM
    Author     : Asus-PC
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
String nombre=(String)request.getAttribute("nombre");
String apellido=(String)request.getAttribute("apellido");
%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Bienvenido <%=nombre%> <%=apellido%></h1>
        <%
        //int i= Integer.ParsentInt(JoptionPane.showInputDialog("Bienvenidos"));
        %>
        
    </body>
</html>
