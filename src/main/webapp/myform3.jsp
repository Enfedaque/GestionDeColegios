<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>My form</title>
    </head>
    <body>
        <h1>Registrar profesor</h1>
        <form method="post" action="add-asignatura">
            ID_Asignatura:
            <input type="text" name="id_asignatura"/><br/>
            Horas:
            <input type="text" name="horas"/><br/>
            Duracion:
            <input type="text" name="duracion"/><br/>
           
            <input type="submit" value="Registrar"/>
        </form>
        
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
