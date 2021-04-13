<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>My form 2</title>
    </head>
    <body>
        <h1>Registrar profesor</h1>
        <form method="post" action="add-alumno">
            ID_Alumnos:
            <input type="text" name="id_alumnos"/><br/>
            Nombre:
            <input type="text" name="nombre"/><br/>
            Apellido:
            <input type="text" name="apellido"/><br/>
            Edad:
            <input type="text" name="edad"/><br/>
            Telefono:
            <input type="text" name="telefono"/><br/>
            
            <input type="submit" value="Registrar"/>
        </form>
        
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
