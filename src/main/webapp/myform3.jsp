<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="css/formulario3.css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>My form</title>
    </head>
    <body>
        <div id="formulario">
        <h1 id="tituloform">Registrar asignatura</h1>
        <form method="post" action="add-asignatura">
             <div class="itemform">
            ID_Asignatura
            <input type="text" class="cuadroTexto" name="id_asignatura" placeholder="Introduzca la asignatura"/><br/>
            </div>
             <div class="itemform">
            Horas
            <input type="text" class="cuadroTexto" name="horas" placeholder="Introduzca el número de horas"/><br/>
            </div>
             <div class="itemform">
            Difiultad
            <input type="text" class="cuadroTexto" name="dificultad" placeholder="Introduzca la dificultad"/><br/>
            </div>
           
            <input type="submit" class="cuadroTexto" value="Registrar" id="botonRegistrar"/>
        </form>
        </div>
        <%
            String status = request.getParameter("status");
            if (status == null)
                status = "";
                
            if (status.equals("ok")) {
                out.println("<p style='color:green'>La asignatura se ha registrado con éxito</p>");
            } else if (status.equals("error")) {
                out.println("<p style='color:red'>No se ha podido registrar la asignatura</p>");
            }
        %>
    </body>
</html>
