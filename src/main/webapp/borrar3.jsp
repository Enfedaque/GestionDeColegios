<%-- 
    Document   : borrar3
    Created on : 14-abr-2021, 11:20:12
    Author     : David Enfedaque
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>

        <link rel="stylesheet" href="css/formulario3.css">

    </head>
    <body>
        <div id="formulario">
        <h1 id="tituloform">Borrar asignatura</h1>
        <form method="post" action="remove-asignatura">
            
            <div class="itemform">
            ID_Asignatura
            <input type="text" name="id_asignatura" class="cuadroTexto" placeholder="Introduzca el ID_Asignatura"/><br/>
            </div>
            
            <input type="submit" value="Eliminar" id="botonRegistrar"/>
        </form>
        <%
            String status = request.getParameter("status");
            if (status == null)
                status = "";
                
            if (status.equals("ok")) {
                out.println("<p style='color:green'>La asignatura ha sido eliminado</p>");
            } else if (status.equals("error")) {
                out.println("<p style='color:red'>No se ha podido eliminar la asignatura</p>");
            }
        %>
    </body>
</html>
