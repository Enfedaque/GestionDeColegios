<%-- 
    Document   : mostrar3
    Created on : 14-abr-2021, 10:52:57
    Author     : David Enfedaque
--%>

<%@page import="com.sanvalero.netflix.domain.Asignaturas"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.sanvalero.netflix.dao.AsignaturasDAO"%>
<%@page import="com.sanvalero.netflix.dao.Conexion"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="css/mostrar3.css">
    </head>
    <body>
        <h1>LISTADO DE PROFESORES</h1>
        <%
            
            Conexion conexion=new Conexion();
            
            AsignaturasDAO asignaturaDAO = new AsignaturasDAO(conexion);
            ArrayList<Asignaturas> listado = asignaturaDAO.mostrarAsignaturas();
        %>
        <ul>
        <%
            for (Asignaturas asignatura : listado) {
        %>
        <li><%= asignatura.getID_Asignatura() + " , " +  asignatura.getHoras() + " , " +  asignatura.getDificultad() %>
        <%    
            }
        %>
        </ul>
    </body>
</html>
