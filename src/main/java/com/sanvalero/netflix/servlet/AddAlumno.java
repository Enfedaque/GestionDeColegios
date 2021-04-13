
package com.sanvalero.netflix.servlet;

import com.sanvalero.netflix.dao.AlumnosDAO;
import com.sanvalero.netflix.dao.Conexion;
import com.sanvalero.netflix.dao.ProfesoresDAO;
import com.sanvalero.netflix.domain.Alumnos;
import com.sanvalero.netflix.domain.Profesor;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "add-alumno", urlPatterns = {"/add-alumno"})
public class AddAlumno extends HttpServlet{
    
    private Connection connection;

    //PARA AÑADIR PROFESORES
    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws
            ServletException, IOException {
        String id_alumno = request.getParameter("id_alumno");
        String nombre = request.getParameter("nombre");
        String apellido = request.getParameter("apellido");
        String edadStr=request.getParameter("edad");
        int edad=Integer.parseInt(edadStr);
        String telefono = request.getParameter("telefono");
        
        Alumnos profesor = new Alumnos(id_alumno, nombre, apellido, edad, telefono);
        AlumnosDAO alumnosDAO = new AlumnosDAO(connection);
        try {
            alumnosDAO.añadirAlumno(id_alumno, nombre, apellido, edad, telefono);
            
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
