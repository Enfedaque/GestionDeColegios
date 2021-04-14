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
        <link rel="stylesheet" href="css/borrar3.css">
    </head>
    <body>
        <div id="formulario">
        <h1 id="tituloform">Borrar asignatura</h1>
        <form method="post" action="add-profesor">
            
            <div class="itemform">
            ID_Asignatura
            <input type="text" name="id_asignatura" class="cuadroTexto" placeholder="Introduzca el ID_Asignatura"/><br/>
            </div>
            
            <input type="submit" value="Eliminar" id="botonRegistrar"/>
        </form>
    </body>
</html>
