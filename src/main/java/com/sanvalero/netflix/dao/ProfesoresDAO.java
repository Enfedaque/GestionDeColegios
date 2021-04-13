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
import java.sql.ResultSet;
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
    public void mostrarProfesores() throws SQLException {        
        String sql="SELECT año , duracion FROM matriculados";
        PreparedStatement sentencia = conexion.getConexion().prepareStatement(sql);
        ResultSet resultado=sentencia.executeQuery();
        System.out.print("Matriculados{ ");
        while (resultado.next()){
            System.out.print((resultado.getString("año") + " , "));
            System.out.print((resultado.getInt("duracion") + " , "));
        }
        System.out.println(" }");
        sentencia.close();
    }
    /**
     * Elimina una película
     * @param id El id de la pelicula a eliminar
     */
    public void borrarProfesor(String dni) throws SQLException{
        
     String sql="DELETE FROM alumno WHERE dni=?";   
     PreparedStatement statement=conexion.getConexion().prepareStatement(sql);
    statement.setString(4, dni);
    statement.executeUpdate();
    }
    
    /**
     * Modifica la información de una pelicula
     * @param movie La película con la información a modificar
     */
    public void modificarProfesor(String telefono) throws SQLException {
        String sql="UPDATE profesores SET telefono=?";
        PreparedStatement statement=conexion.getConexion().prepareStatement(sql);
        statement.setString(2, telefono);
        statement.executeUpdate();
        
        
    }
}

