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

 
    
  private Conexion conexion;
    
    public ProfesoresDAO(Conexion conexion) {
        this.conexion=conexion;;
    }
    
    //AÑADIR NUEVO PROFESOR
    public void añadirProfesor(String nombre, String DNI, String telefono, 
            String edad) throws SQLException {
        String sql = "INSERT INTO profesores (nombre_prof, telefono, edad, dni) " +
                "VALUES (?, ?, ?, ?, ?)";
        
        PreparedStatement sentenciaSql=conexion.getConexion().prepareStatement(sql);
        sentenciaSql.setString(1, nombre);
        sentenciaSql.setString(2, telefono);
        sentenciaSql.setString(3, edad);
        sentenciaSql.setString(4, DNI);
        sentenciaSql.executeUpdate();
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

