package com.sanvalero.netflix.servlet;

import com.sanvalero.netflix.dao.Conexion;

import com.sanvalero.netflix.dao.ProfesoresDAO;
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
@WebServlet(name = "remove-profesor", urlPatterns = {"/remove-profesor"})
public class RemoveProfesor extends HttpServlet {

    private Conexion conexion;
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws
            ServletException, IOException {
        conexion=new Conexion();
        try{
            String dni = request.getParameter("dni");
            ProfesoresDAO profesorDAO = new ProfesoresDAO(conexion);
            profesorDAO.borrarProfesor(dni);
            response.sendRedirect("borrar1.jsp?status=ok");
        }catch(SQLException sqle){
            sqle.printStackTrace();
            response.sendRedirect("borrar1.jsp?status=error");
        }
       
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
