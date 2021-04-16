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
        <h1 id="tituloform">Add Subject</h1>
        <form method="post" action="add-asignatura">
             <div class="itemform">
            ID_Subject
            <input type="text" class="cuadroTexto" name="id_asignatura" placeholder="Insert ID_Subject"/><br/>
            </div>
             <div class="itemform">
            Hours
            <input type="text" class="cuadroTexto" name="horas" placeholder="Insert hours"/><br/>
            </div>
             <div class="itemform">
            Difficulty
            <input type="text" class="cuadroTexto" name="dificultad" placeholder="Insert text"/><br/>
            </div>
           
            <input type="submit" class="cuadroTexto" value="Add" id="botonRegistrar"/>
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
