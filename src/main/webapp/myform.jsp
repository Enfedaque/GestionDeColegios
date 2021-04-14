<%@page import="java.sql.SQLException"%>
<%@page import="com.sanvalero.netflix.dao.Conexion"%>
<%@page import="com.sanvalero.netflix.dao.ProfesoresDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="css/formulario1.css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>My form</title>
    </head>
    <body>
        <div id="formulario">
        <h1 id="tituloform">Registrar profesor</h1>
        <form method="post" action="add-profesor">
            <div class="itemform">
            Nombre
            <input type="text" name="nombre-prof" class="cuadroTexto" placeholder="Introduzca el nombre"/><br/>
            </div>
            <div class="itemform">
            Telefono
            <input type="text" name="telefono" class="cuadroTexto" placeholder="Introduzca el número de telefono"/><br/>
            </div>
            <div class="itemform">
            Edad
            <input type="text" name="edad" class="cuadroTexto" placeholder="Introduzca la edad"/><br/>
            </div>
            <div class="itemform">
            DNI
            <input type="text" name="dni" class="cuadroTexto" placeholder="Introduzca el DNI"/><br/>
            </div>
            
            <input type="submit" value="Registrar" id="botonRegistrar"/>
        </form>
        </div>
        <%
            
            Conexion conexion=new Conexion();
            conexion.connect();
   
            String nombre_prof=request.getParameter("nombre-prof");
            String telefono=request.getParameter("telefono");
            int edad=request.getIntHeader("edad");
            String dni=request.getParameter("dni");
            
            ProfesoresDAO profesorDAO=new ProfesoresDAO(conexion);
            try{
                profesorDAO.añadirProfesor(nombre_prof, dni, telefono, edad);
            }catch(Exception e){
                e.printStackTrace();
            }
            
            
            
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
