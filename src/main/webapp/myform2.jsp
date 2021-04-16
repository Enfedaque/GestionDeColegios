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
        <h1 id="tituloform">Add Student</h1>
        <form method="post" action="add-alumno">
            <div class="itemform">
            ID_Student
            <input type="text" name="id_alumno" class="cuadroTexto" placeholder="Insert ID-Student"/><br/>
            </div>
            <div class="itemform">
            Name
            <input type="text" name="nombre" class="cuadroTexto" placeholder="Insert name"/><br/>
            </div>
            <div class="itemform">
            Surname 
            <input type="text" name="apellido" class="cuadroTexto" placeholder="Insert surname"/><br/>
            </div>
            <div class="itemform">
            Age
            <input type="text" name="edad" class="cuadroTexto" placeholder="Insert age"/><br/>
            </div>
            <div class="itemform">
            Phone
            <input type="text" name="telefono" class="cuadroTexto" placeholder="Insert number"/><br/>
            </div>
            
            <input type="submit" value="Add" id="botonRegistrar"/>
        </form>
        </div>
        <%
            String status = request.getParameter("status");
            if (status == null)
                status = "";
                
            if (status.equals("ok")) {
                out.println("<p style='color:white'>El alumno se ha registrado con éxito</p>");
            } else if (status.equals("error")) {
                out.println("<p style='color:red'>No se ha podido registrar el alumno</p>");
            }
        %>
    </body>
</html>
