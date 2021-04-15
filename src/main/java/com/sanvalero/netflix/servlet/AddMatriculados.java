/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sanvalero.netflix.servlet;

import com.sanvalero.netflix.dao.AlumnosDAO;
import com.sanvalero.netflix.dao.Conexion;
import com.sanvalero.netflix.dao.MatriculadosDAO;
import com.sanvalero.netflix.domain.Alumnos;
import com.sanvalero.netflix.domain.Matriculados;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "add-matriculados", urlPatterns = {"/add-matriculados"})
public class AddMatriculados extends HttpServlet{
    
    private Conexion conexion;

    //PARA AÑADIR MATRICULAS
    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws
            ServletException, IOException {
        String año = request.getParameter("año_matricula");
        String duracionStr=request.getParameter("duracion");
        int duracion=Integer.parseInt(duracionStr);
        
        Matriculados matriculados = new Matriculados(año, duracion);
        
        conexion=new Conexion();
        MatriculadosDAO matriculadosDAO=new MatriculadosDAO(conexion);
        try {
            matriculadosDAO.añadirMatricula(año, duracion);
            
            PrintWriter out = response.getWriter();
            response.sendRedirect("myform4.jsp?status=ok");
        } catch (SQLException sqle) {
            sqle.printStackTrace();
            response.sendRedirect("myform4.jsp?status=error");
        }
    
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        processRequest(req, resp);
    }
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        processRequest(req, resp);
    }
    
}
