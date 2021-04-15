package com.sanvalero.netflix.servlet;

import com.sanvalero.netflix.dao.Conexion;
import com.sanvalero.netflix.dao.ProfesoresDAO;
import com.sanvalero.netflix.domain.Profesor;
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
@WebServlet(name = "get-profesor", urlPatterns = {"/get-profesor"})
public class GetProfesor extends HttpServlet {

    private  Conexion conexion;
    
    //MOSTRAR LOS PROFESORES
    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws
            ServletException, IOException {
        conexion=new Conexion();
        PrintWriter out = response.getWriter();
        out.println("<p>Listado de profesores (con servlet)</p>");
        conexion=new Conexion();
        ProfesoresDAO profesoresDAO = new ProfesoresDAO(conexion);
        try {
            profesoresDAO.mostrarProfesores();
            
<<<<<<< HEAD
            // FIXME pelicula de ejemplo (eliminar cuando se desarrolle el listado)
           /* out.println("<li>Pelicula de ejemplo</li> <a href='remove-movie?id=23'>Eliminar</a></li>");*/
            out.println("</ul>");

            // Muestra el mensaje (si lo hay)
            String message = request.getParameter("message");
            if (!message.equals("")) {
                out.println("<p style='color:green'>" + message + "</p>");
            }
=======
            response.sendRedirect("mostrar1.jsp?status=ok");
            
>>>>>>> d1133181d771f895e8b6c6e7cd8e80f426391a57
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
