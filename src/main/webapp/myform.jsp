<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>My form</title>
    </head>
    <body>
        <h1>Registrar profesor</h1>
        <form method="post" action="add-profesor">
            Nombre:
            <input type="text" name="title"/><br/>
            Telefono:
            <input type="text" name="director"/><br/>
            Edad:
            <input type="text" name="duration"/><br/>
            DNI:
            <input type="text" name="category"/><br/>
            
            <input type="submit" value="Registrar"/>
        </form>
        
        <%
            String status = request.getParameter("status");
            if (status == null)
                status = "";
                
            if (status.equals("ok")) {
                out.println("<p style='color:green'>El profesor se ha registrado con éxito</p>");
            } else if (status.equals("error")) {
                out.println("<p style='color:red'>No se ha podido registrar el profesor</p>");
            }
        %>
    </body>
</html>
