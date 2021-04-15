<%-- 
    Document   : borrar2
    Created on : 14-abr-2021, 11:20:03
    Author     : David Enfedaque
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="css/formulario2.css">
    </head>
    <body>
        <div id="formulario">
        <h1 id="tituloform">Borrar alumno</h1>
        <form method="post" action="remove-alumno">
            
            <div class="itemform">
            ID_Alumno
            <input type="text" name="id_alumno" class="cuadroTexto" placeholder="Introduzca el ID_Alumno"/><br/>
            </div>
            
            <input type="submit" value="Eliminar" id="botonRegistrar"/>
        </form>
        <%
            String status = request.getParameter("status");
            if (status == null)
                status = "";
                
            if (status.equals("ok")) {
                out.println("<p style='color:green'>El alumno ha sido eliminado</p>");
            } else if (status.equals("error")) {
                out.println("<p style='color:red'>No se ha podido eliminar el alumno</p>");
            }
        %>
    </body>
</html>
