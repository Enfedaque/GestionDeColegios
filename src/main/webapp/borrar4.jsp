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
        <h1 id="tituloform">Borrar matricula</h1>
        <form method="post" action="add-profesor">
            
            <div class="itemform">
            Año
            <input type="text" name="año" class="cuadroTexto" placeholder="Introduzca el año"/><br/>
            </div>
            
            <input type="submit" value="Eliminar" id="botonRegistrar"/>
        </form>
    </body>
</html>