/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sanvalero.netflix.dao;

import com.sanvalero.netflix.domain.Alumnos;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author David Enfedaque
 */
public class AlumnosDAO {
    
    
    
    private Connection connection;
    
    public AlumnosDAO(Connection connection) {
        this.connection=connection;;
    }
    
    
  
    //AÑADIR COLEGIO A LA BBDD
    public void añadirAlumno(String nombreProf,String dni,String telefono,int edad) throws SQLException {
        //Insertamos nuestros datos en los apartados de la tabla
        String sql = "INSERT INTO alumnos (nombreProf, dni, telefono, edad) " +
                "VALUES (?, ?, ?, ?)";
        //TODO aun sin hacer, cambiar los get...
        PreparedStatement sentencia = connection.prepareStatement(sql);
        sentencia.setString(1, nombreProf); 
        sentencia.setString(2, dni);
        sentencia.setString(3, telefono);
        sentencia.setInt(4, edad);
        sentencia.executeUpdate();
    }
    
    /**
     * Obtiene la lista de peliculas de la base de datos
     * @return Una colección con las peliculas
     */
    public ArrayList<Alumnos> getTodosAlumnos() throws SQLException {        
        return new ArrayList<>();
    }
    
    /**
     * Elimina una película
     * @param id El id de la pelicula a eliminar
     */
    public void borrarAlumno(String id_alumno) {
        
    }
    
    /**
     * Modifica la información de una pelicula
     * @param movie La película con la información a modificar
     */
    public void modificarAlumno(String id_alumno) {
        
    }
    
}
