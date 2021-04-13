package com.sanvalero.netflix.servlet;

import com.sanvalero.netflix.dao.Conexion;
import com.sanvalero.netflix.dao.AsignaturasDAO;
import com.sanvalero.netflix.domain.Asignaturas;
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
@WebServlet(name = "add-asignatura", urlPatterns = {"/add-asignatura"})
public class AddAsignatura extends HttpServlet {
    
    private Conexion conexion;

    //PARA AÑADIR PROFESORES
    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws
            ServletException, IOException {
        String ID_Asignatura = request.getParameter("ID_Asignatura");
        String horasStr = request.getParameter("horas");
        int horas=Integer.parseInt(horasStr);
        String duracion = request.getParameter("duracion");
        
        Asignaturas asignatura = new Asignaturas(ID_Asignatura, horas, duracion);
        AsignaturasDAO asignaturasDAO = new AsignaturasDAO(conexion);
        try {
            asignaturasDAO.añadirAsignatura(ID_Asignatura, horas, duracion);
            
            PrintWriter out = response.getWriter();
            response.sendRedirect("myform3.jsp?status=ok");
        } catch (SQLException sqle) {
            response.sendRedirect("myform3.jsp?status=error");
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
