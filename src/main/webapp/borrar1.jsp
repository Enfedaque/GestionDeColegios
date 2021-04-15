<%-- 
    Document   : borrar1
    Created on : 14-abr-2021, 11:19:52
    Author     : David Enfedaque
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="css/formulario1.css">
    </head>
    <body>
        <div id="formulario">
        <h1 id="tituloform">Borrar profesor</h1>
        <form method="post" action="remove-profesor">
            
            <div class="itemform">
            DNI
            <input type="text" name="dni" class="cuadroTexto" placeholder="Introduzca el DNI"/><br/>
            </div>
        
            
            <input type="submit" value="Eliminar" id="botonRegistrar"/>
        </form>
        
        
    </body>
</html>
