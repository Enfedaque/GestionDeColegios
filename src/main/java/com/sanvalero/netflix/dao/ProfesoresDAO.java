/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sanvalero.netflix.dao;

import com.sanvalero.netflix.domain.Profesor;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

public class ProfesoresDAO {

    private final String DRIVER = "com.mysql.cj.jdbc.Driver";
    private final String URL_CONEXION = "jdbc:mysql://localhost:3306/netflix";
    private final String USUARIO = "netflixuser";
    private final String CONTRASENA = "netflix1234";
    
    private Connection connection;
    
    public ProfesoresDAO() {
        connect();
    }
    
    /**
     * Conecta con la base de datos
     */
    public void connect() {
        try {
            Class.forName(DRIVER);
            connection = DriverManager.getConnection(URL_CONEXION, USUARIO, CONTRASENA);
        } catch (ClassNotFoundException cnfe) {
            cnfe.printStackTrace();
        } catch (SQLException sqle) {
            sqle.printStackTrace();
        }
    }
    
    /**
     * Desconecta de la base de datos
     */
    public void disconnect() {
        try {
            connection.close();
        } catch (SQLException sqle) {
            sqle.printStackTrace();
        }
    }
    
    /**
     * Añade una pelicula a la base de datos
     * @param movie La pelicula con la información que se quiere registrar
     * @throws SQLException 
     */
    public void añadirProfesor(Profesor movie) throws SQLException {
        String sql = "INSERT INTO profesores (nombre_prof, telefono, edad, dni) " +
                "VALUES (?, ?, ?, ?, ?)";
        
        PreparedStatement sentencia = connection.prepareStatement(sql);
        sentencia.setString(1, movie.getNombre_prof());
        sentencia.setString(2, movie.getTelefono());
        sentencia.setInt(3, movie.getEdad());
        sentencia.setString(4, movie.getDni());
        sentencia.executeUpdate();
    }
    
    /**
     * Obtiene la lista de peliculas de la base de datos
     * @return Una colección con las peliculas
     */
    public ArrayList<Profesor> verTodosProfesores() throws SQLException {        
        return new ArrayList<>();
    }
    
    /**
     * Elimina una película
     * @param id El id de la pelicula a eliminar
     */
    public void borrarProfesor(int id) {
        
    }
    
    /**
     * Modifica la información de una pelicula
     * @param movie La película con la información a modificar
     */
    public void modificarProfesor(Profesor movie) {
        
    }
}
