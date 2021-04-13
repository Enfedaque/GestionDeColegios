package com.sanvalero.netflix.servlet;

import com.sanvalero.netflix.dao.Conexion;

import com.sanvalero.netflix.dao.AsignaturasDAO;
import java.io.IOException;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet que elimina una película a la base de datos
 */
@WebServlet(name = "remove-asignatura", urlPatterns = {"/remove-asignatura"})
public class RemoveAsignatura extends HttpServlet {

    private Conexion conexion;
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws
            ServletException, IOException {
        
        try{
            String ID_Asignatura = request.getParameter("ID_Asignatura");
            AsignaturasDAO asignaturaDAO = new AsignaturasDAO(conexion);
            asignaturaDAO.borrarAsignatura(ID_Asignatura);
        }catch(SQLException sqle){
            sqle.printStackTrace();
        }
        
        
        response.sendRedirect("asignatura?message=Asignatura eliminado");
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
