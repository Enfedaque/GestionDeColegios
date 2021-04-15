<%-- 
    Document   : mostrar2
    Created on : 14-abr-2021, 10:52:44
    Author     : David Enfedaque
--%>

<%@page import="com.sanvalero.netflix.domain.Alumnos"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.sanvalero.netflix.dao.AlumnosDAO"%>
<%@page import="com.sanvalero.netflix.dao.Conexion"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="css/mostrar2.css">
    </head>
    <body>
        <div id="container">
        <h1 id="titulo">LISTADO DE PROFESORES</h1>
        <div id="lista">
        <%
            
            Conexion conexion=new Conexion();
            
            AlumnosDAO alumnosDAO = new AlumnosDAO(conexion);
            ArrayList<Alumnos> listado = alumnosDAO.mostrarAlumnos();
        %>
        <ul>
        <%
            for (Alumnos alumnos : listado) {
        %>
        <li><%= alumnos.getNombre()+ " , " +  alumnos.getApellido() + " , " +  alumnos.getId_alumno() + " , " +  alumnos.getEdad() + " , " + alumnos.getTelefono()%>
        <%    
            }
        %>
        </ul>
        </div>
        </div>
    </body>
</html>
