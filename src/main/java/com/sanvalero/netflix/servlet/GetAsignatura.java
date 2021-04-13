package com.sanvalero.netflix.servlet;

import com.sanvalero.netflix.dao.Conexion;
import com.sanvalero.netflix.dao.AsignaturasDAO;
import com.sanvalero.netflix.domain.Asignaturas;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet que obtiene la lista completa de peliculas de la base de datos
 */
@WebServlet(name = "asignatura", urlPatterns = {"/asignatura"})
public class GetAsignatura extends HttpServlet {

    private  Conexion conexion;
    
    //MOSTRAR LOS PROFESORES
    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws
            ServletException, IOException {
        PrintWriter out = response.getWriter();
        out.println("<p>Listado de asignaturas (con servlet)</p>");
        AsignaturasDAO asignaturasDAO = new AsignaturasDAO(conexion);
        try {
            asignaturasDAO.mostrarAsignaturas();
            out.println("<ul>");
            
            // FIXME pelicula de ejemplo (eliminar cuando se desarrolle el listado)
            /*out.println("<li>Pelicula de ejemplo</li> <a href='remove-movie?id=23'>Eliminar</a></li>");*/
            out.println("</ul>");

            // Muestra el mensaje (si lo hay)
            String message = request.getParameter("message");
            if (!message.equals("")) {
                out.println("<p style='color:green'>" + message + "</p>");
            }
        } catch (SQLException sqle) {
            sqle.printStackTrace();
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
