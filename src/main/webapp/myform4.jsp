<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
         <link rel="stylesheet" href="css/formulario4.css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>My form</title>
    </head>
    <body>
        <div id="formulario">
        <h1 id="tituloform">Add License</h1>
        <form method="post" action="add-matricula">
            <div class="itemform">
            Year
            <input type="text" class="cuadroTexto" name="año_matricula" placeholder="Introduzca el año"/><br/>
            </div>
            <div class="itemform">
            Duration
            <input type="text" class="cuadroTexto" name="duracion" placeholder="Introduzca la duración"/><br/>
            </div>
            
            <input type="submit" value="Registrar" id="botonRegistrar"/>
        </form>
        
        <%
            String status = request.getParameter("status");
            if (status == null)
                status = "";
                
            if (status.equals("ok")) {
                out.println("<p style='color:green'>La matricula se ha registrado con éxito</p>");
            } else if (status.equals("error")) {
                out.println("<p style='color:red'>No se ha podido registrar la matricula</p>");
            }
        %>
    </body>
</html>
