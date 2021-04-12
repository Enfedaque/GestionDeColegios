/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sanvalero.netflix.dao;

import com.sanvalero.netflix.domain.Asignatura;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

public class AsignaturaDao {

    private final String DRIVER = "com.mysql.cj.jdbc.Driver";
    private final String URL_CONEXION = "jdbc:mysql://localhost:3306/netflix";
    private final String USUARIO = "netflixuser";
    private final String CONTRASENA = "netflix1234";
    
    private Connection connection;
    
    public AsignaturaDao() {
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
    public void añadirAsignatura(Asignatura movie) throws SQLException {
        String sql = "INSERT INTO profesores (ID_Asignatura) " +
                "VALUES (?)";
        
        PreparedStatement sentencia = connection.prepareStatement(sql);
        sentencia.setString(1, movie.getID_Asignatura());

        sentencia.executeUpdate();
    }
    
    /**
     * Obtiene la lista de peliculas de la base de datos
     * @return Una colección con las peliculas
     */
    public ArrayList<Asignatura> verTodasAsignaturas() throws SQLException {        
        return new ArrayList<>();
    }
    
    /**
     * Elimina una película
     * @param id El id de la pelicula a eliminar
     */
    public void borrarAsignatura(int id) {
        
    }
    
    /**
     * Modifica la información de una pelicula
     * @param movie La película con la información a modificar
     */
    public void modificarAsignatura(Asignatura movie) {
        
    }
}
