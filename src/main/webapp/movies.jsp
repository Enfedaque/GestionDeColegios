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
        <link rel="stylesheet" href="css/mostrar.css">
    </head>
    <body>
        <div id="container">
            <div id="titulo">
            <h1>TEACHER´S LIST</h1>
            </div>
        
        <%
            
            Conexion conexion=new Conexion();
            
            ProfesoresDAO profesoresDAO = new ProfesoresDAO(conexion);
            ArrayList<Profesor> listado = profesoresDAO.mostrarProfesores();
        %>
        <div id="lista">
            <ul>
        <%
            for (Profesor profesor : listado) {
        %>
        <li><%= profesor.getNombre_prof() + " , " +  profesor.getTelefono() + " , " +  profesor.getDni() + " , " +  profesor.getEdad()%></li>
        <%    
            }
        %>
        </ul>
        </div>
        </div>
        
        
        
        
        
    </body>
</html>
