

<%@page import="com.sanvalero.netflix.domain.Matriculados"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.sanvalero.netflix.dao.MatriculadosDAO"%>
<%@page import="com.sanvalero.netflix.dao.Conexion"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="css/mostrar4.css">
    </head>
    <body>
        <div id="container">
            <div id="titulo">
            <h1>LICENSES´S LIST</h1>
        </div>
        <div id="lista">
            <%
            
            Conexion conexion=new Conexion();
            
            MatriculadosDAO matriculadosDAO = new MatriculadosDAO(conexion);
            ArrayList<Matriculados> listado = matriculadosDAO.mostrarMatriculados();
        %>
        <ul>
        <%
            for (Matriculados matriculado : listado) {
        %>
        <li><%= matriculado.getAño_matricula() + " , " +  matriculado.getDuracion() %>
        <%    
            }
        %>
        </ul>
        </div>
        </div>
        
        
        
    </body>
</html>
