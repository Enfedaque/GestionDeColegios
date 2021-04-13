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
import java.sql.ResultSet;
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
    public void añadirAlumno(String id_alumno,String nombre,String apellido,int
            edad, String telefono) throws SQLException {
        //Insertamos nuestros datos en los apartados de la tabla
        String sql = "INSERT INTO alumnos (id_alumnos, nombre, apellido, edad ,"
                + " telefono) " +
                "VALUES (?, ?, ?, ?)";
        //TODO aun sin hacer, cambiar los get...
        PreparedStatement sentencia = connection.prepareStatement(sql);
        sentencia.setString(1, id_alumno); 
        sentencia.setString(2, nombre);
        sentencia.setString(3, apellido);
        sentencia.setInt(4, edad);
        sentencia.setString(5, telefono);
        sentencia.executeUpdate();
    }
    
    //MOSTRAR TODOS LOS ALUMNOS
    public void mostrarAlumnos() throws SQLException {        
        String sql="SELECT nombre , apellido FROM alumnos";
        PreparedStatement sentencia = connection.prepareStatement(sql);
        ResultSet resultado=sentencia.executeQuery();
        System.out.print("Alumnos{ ");
        while (resultado.next()){
            System.out.print((resultado.getString("nombre") + " , "));
            System.out.print((resultado.getString("apellido") + " , "));
        }
        System.out.println(" }");
        sentencia.close();
    }
    
    
    //ELIMINAR UN ALUMNO POR EL ID
    public void borrarAlumno(String id_alumno) throws SQLException{
        String sql="DELETE FROM alumno WHERE id_alumno=?";
        PreparedStatement statement=connection.prepareStatement(sql);
        statement.setString(1, id_alumno);
        statement.executeUpdate();
    }
    
    //MODIFICAR ID_ALUMNO
    public void modificarAlumno(String id_alumno) throws SQLException{
           String sql="UPDATE alumnos SET id_alumno=?";
           PreparedStatement statement=connection.prepareStatement(sql);
            statement.setString(1, id_alumno);
            statement.executeUpdate();
    }
    
}
