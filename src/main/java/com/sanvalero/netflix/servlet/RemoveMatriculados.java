
package com.sanvalero.netflix.servlet;


import com.sanvalero.netflix.dao.AlumnosDAO;
import com.sanvalero.netflix.dao.Conexion;
import com.sanvalero.netflix.dao.MatriculadosDAO;
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


@WebServlet(name = "remove-matriculados", urlPatterns = {"/remove-matriculados"})
public class RemoveMatriculados extends HttpServlet{
    
    private Conexion conexion;
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws
            ServletException, IOException {
        
        try{
            String año = request.getParameter("año");
           MatriculadosDAO matriculadosDAO=new MatriculadosDAO(conexion);
           matriculadosDAO.borrarMatricula(año);
        }catch(SQLException sqle){
            sqle.printStackTrace();
        }
        
        
        response.sendRedirect("matriculados?message=matriculados eliminado");
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
