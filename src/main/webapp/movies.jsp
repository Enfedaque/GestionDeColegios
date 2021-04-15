<%@page import="com.sanvalero.netflix.dao.Conexion"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.sanvalero.netflix.domain.Profesor"%>
<%@page import="com.sanvalero.netflix.dao.ProfesoresDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Listado de peliculas</title>
    </head>
    <body>
        <h1>LISTADO DE PROFESORES</h1>
        <%
            
            Conexion conexion=new Conexion();
            
            ProfesoresDAO profesoresDAO = new ProfesoresDAO(conexion);
            ArrayList<Profesor> listado = profesoresDAO.mostrarProfesores();
        %>
        <ul>
        <%
            for (Profesor profesor : listado) {
        %>
        <li><%= profesor.getNombre_prof() + " , " +  profesor.getTelefono() + " , " +  profesor.getDni() + " , " +  profesor.getEdad()%></li>
        <%    
            }
        %>
        </ul>
        
        
        
    </body>
</html>
