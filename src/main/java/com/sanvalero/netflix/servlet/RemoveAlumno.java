/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sanvalero.netflix.servlet;


import com.sanvalero.netflix.dao.AlumnosDAO;
import com.sanvalero.netflix.dao.Conexion;

import com.sanvalero.netflix.domain.Alumnos;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "remove-alumno", urlPatterns = {"/remove-alumno"})
public class RemoveAlumno extends HttpServlet{
    
    private  Conexion conexion;
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws
            ServletException, IOException {
        conexion=new Conexion();
        try{
            String id_alumno = request.getParameter("id_alumno");
           AlumnosDAO alumnosDAO=new AlumnosDAO(conexion);
            alumnosDAO.borrarAlumno(id_alumno);
        }catch(SQLException sqle){
            sqle.printStackTrace();
        }
        
        
        response.sendRedirect("alumno?message=alumno eliminado");
    }
    
    
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        processRequest(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        processRequest(req, resp);
    }
    
}
