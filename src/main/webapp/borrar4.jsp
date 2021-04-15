<%-- 
    Document   : borrar4
    Created on : 14-abr-2021, 11:20:24
    Author     : David Enfedaque
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="css/formulario4.css">
    </head>
    <body>
        <div id="formulario">
        <h1 id="tituloform">Remove license</h1>
        <form method="post" action="remove-matriculados">
            
            <div class="itemform">
            Year
            <input type="text" name="año" class="cuadroTexto" placeholder="Introduzca el año"/><br/>
            </div>
            
            <input type="submit" value="Eliminar" id="botonRegistrar"/>
        </form>
        <%
            String status = request.getParameter("status");
            if (status == null)
                status = "";
                
            if (status.equals("ok")) {
                out.println("<p style='color:white'>la matricula ha sido eliminado</p>");
            } else if (status.equals("error")) {
                out.println("<p style='color:red'>No se ha podido eliminar la matriculo</p>");
            }
        %>
    </body>
</html>
