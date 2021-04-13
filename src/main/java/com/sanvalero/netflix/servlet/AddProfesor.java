package com.sanvalero.netflix.servlet;

import com.sanvalero.netflix.dao.Conexion;
import com.sanvalero.netflix.dao.ProfesoresDAO;
import com.sanvalero.netflix.domain.Profesor;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet que añade una película a la base de datos
 */
@WebServlet(name = "add-profesor", urlPatterns = {"/add-profesor"})
public class AddProfesor extends HttpServlet {
    
    private Conexion conexion;

    //PARA AÑADIR PROFESORES
    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws
            ServletException, IOException {
        String nombre_prof = request.getParameter("nombre_prof");
        String telefono = request.getParameter("telefono");
        String edadStr = request.getParameter("edad");
        int edad=Integer.parseInt(edadStr);
        String dni = request.getParameter("dni");
        
        Profesor profesor = new Profesor(edad, nombre_prof, telefono, dni);
        ProfesoresDAO profesoresDAO = new ProfesoresDAO(conexion);
        try {
            profesoresDAO.añadirProfesor(nombre_prof, dni, telefono, edad);
            
            PrintWriter out = response.getWriter();
            response.sendRedirect("myform.jsp?status=ok");
        } catch (SQLException sqle) {
            response.sendRedirect("myform.jsp?status=error");
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
