<%-- 
    Document   : mostrar1
    Created on : 14-abr-2021, 10:52:26
    Author     : David Enfedaque
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="css/mostrar.css">
    </head>
    <body>
        <div class="mostrar">
            <div class="titulo">
                <h2>LISTADO DE PROFESORES</h2>
            </div>
            <div class="cuerpo">
                <form action="get-profesor">
                    <input type="submit" value="Mostrar" id="botonRegistrar"/>
                </form>
                <%
                    String status = request.getParameter("status");
                    if (status == null)
                        status = "";
                
                    if (status.equals("ok")) {
                        out.println("<p style='color:green'>El profesor se ha registrado con éxito</p>");
                    } else if (status.equals("error")) {
                        out.println("<p style='color:red'>No se ha podido registrar el profesor</p>");
                    }
                %>
            
            </div>
        </div>
        
    </body>
</html>
