<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="css/formulario2.css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>My form 2</title>
    </head>
    
    <body>
        <div id="formulario">
        <h1 id="tituloform">Registrar alumno</h1>
        <form method="post" action="add-alumno">
            <div class="itemform">
            ID_Alumnos
            <input type="text" name="id_alumnos" class="cuadroTexto" placeholder="Introduzca el ID-Alumno"/><br/>
            </div>
            <div class="itemform">
            Nombre
            <input type="text" name="nombre" class="cuadroTexto" placeholder="Introduzca el nombre"/><br/>
            </div>
            <div class="itemform">
            Apellido
            <input type="text" name="apellido" class="cuadroTexto" placeholder="Introduzca el apellido"/><br/>
            </div>
            <div class="itemform">
            Edad
            <input type="text" name="edad" class="cuadroTexto" placeholder="Introduzca la edad"/><br/>
            </div>
            <div class="itemform">
            Telefono
            <input type="text" name="telefono" class="cuadroTexto" placeholder="Introduzca el número de telefono"/><br/>
            </div>
            
            <input type="submit" value="Registrar" id="botonRegistrar"/>
        </form>
        </div>
        <%
            String status = request.getParameter("status");
            if (status == null)
                status = "";
                
            if (status.equals("ok")) {
                out.println("<p style='color:green'>El alumno se ha registrado con éxito</p>");
            } else if (status.equals("error")) {
                out.println("<p style='color:red'>No se ha podido registrar el alumno</p>");
            }
        %>
    </body>
</html>
