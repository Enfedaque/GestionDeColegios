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
                    <%
                        String status = request.getParameter("status");
                        if (status == null)
                            status = "";

                        if (status.equals("ok")) {
                            out.println("<p style='color:green'>Lista mostrada</p>");
                        } else if (status.equals("error")) {
                            out.println("<p style='color:red'>No se ha podido mostrar la lista</p>");
                        }
                    %>
                    <input type="submit" value="Mostrar">
                </form>
            </div>
        </div>
        
    </body>
</html>
