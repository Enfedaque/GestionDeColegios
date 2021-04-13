/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sanvalero.netflix.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author David Enfedaque
 */
public class AsignaturasDAO {
    

    
   private Conexion conexion;
    
    public AsignaturasDAO(Conexion conexion) {
        this.conexion=conexion;
    }
    
    
    //AÑADIR ASIGNATURA
    public void añadirAsignatura(String id_asignatura, int horas, 
            String dificultad) throws SQLException {
        String sql = "INSERT INTO asignaturas (ID_Asignatura, horas, duracion) " +
                "VALUES (? , ? , ?)";
        
        PreparedStatement sentenciaSql=conexion.getConexion().prepareStatement(sql);
        sentenciaSql.setString(1, id_asignatura);
        sentenciaSql.setInt(2, horas);
        sentenciaSql.setString(3, dificultad);
        sentenciaSql.executeUpdate();
    }
    
    /**
     * Obtiene la lista de peliculas de la base de datos
     * @return Una colección con las peliculas
     */
    /*
    public ArrayList<Asignatura> verTodasAsignaturas() throws SQLException {        
        return new ArrayList<>();
    }*/
    
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
    public void modificarAsignatura() {
        
    }
    
}
