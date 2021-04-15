/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sanvalero.netflix.dao;

import com.sanvalero.netflix.domain.Profesor;
import com.sanvalero.netflix.dao.Conexion;
import static java.lang.System.out;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.servlet.jsp.JspException;

public class ProfesoresDAO {

 
    
  private Conexion conexion;
    
    public ProfesoresDAO(Conexion conexion) {
        this.conexion=conexion;;
        
        
    }
    
    //AÑADIR NUEVO PROFESOR
    public void añadirProfesor(String nombre, String DNI, String telefono, 
            int edad) throws SQLException {
        
        String sql = "INSERT INTO profesores (nombre_prof, telefono, edad, dni) " +
                "VALUES (?, ?, ?, ?)";
        
        PreparedStatement sentenciaSql=conexion.getConexion().prepareStatement(sql);
        sentenciaSql.setString(1, nombre);
        sentenciaSql.setString(2, telefono);
        sentenciaSql.setInt(3, edad);
        sentenciaSql.setString(4, DNI);
        sentenciaSql.executeUpdate();
        sentenciaSql.close();
    }
    
    /**
     * Obtiene la lista de peliculas de la base de datos
     * @return Una colección con las peliculas
     */
    //MOSTRAR TODOS LOS PROFESORES
    public ArrayList<Profesor> mostrarProfesores() throws SQLException{        
    
            String sql="SELECT * FROM profesores";
            ArrayList<Profesor> profesores = new ArrayList<>();

            PreparedStatement sentenciaSql=conexion.getConexion().prepareStatement(sql);
            ResultSet resultado=sentenciaSql.executeQuery();
            while(resultado.next()){
                Profesor profesor=new Profesor();
                profesor.setNombre_prof(resultado.getString("nombre_prof"));
                profesor.setTelefono(resultado.getString("telefono"));
                profesor.setDni(resultado.getString("dni"));
                profesor.setEdad(resultado.getInt("edad"));
                
                profesores.add(profesor);
            }
            return profesores;
    }
    
    
    //BORRAR PROFESORES POR DNI
    public void borrarProfesor(String dni) throws SQLException{
        
     String sql="DELETE FROM profesores WHERE dni=?";   
     PreparedStatement statement=conexion.getConexion().prepareStatement(sql);
    statement.setString(1, dni);
    statement.executeUpdate();
    statement.close();
    }
    
    //MODIFICAR TELEFONO DE LOS PROFESORES
    public void modificarProfesor(String telefono) throws SQLException {
        String sql="UPDATE profesores SET telefono=?";
        PreparedStatement statement=conexion.getConexion().prepareStatement(sql);
        statement.setString(1, telefono);
        statement.executeUpdate();
        statement.close();
        
        
    }
}

