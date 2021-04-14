/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sanvalero.netflix.dao;
import com.sanvalero.netflix.dao.Conexion;
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
    
    //MOSTRAR ASIGNATURAS
    public void mostrarAsignaturas() throws SQLException{
        String sql="SELECT id_asignaturas , horas , dificultad FROM asignaturas";
        PreparedStatement sentencia = conexion.getConexion().prepareStatement(sql);
        ResultSet resultado=sentencia.executeQuery();
        System.out.print("Asignaturas{ ");
        while (resultado.next()){
            System.out.print((resultado.getString("id_asignaturas") + " , "));
            System.out.print((resultado.getString("horas") + " , "));
            System.out.print((resultado.getString("dificultad") + " , "));
        }
        System.out.println(" }");
        sentencia.close();
    }
    
    
    //ELIMINAR UNA ASIGNATURA POR SU NOMBRE
    public void borrarAsignatura(String id_asignatura) throws SQLException {
        
        String sql="DELETE FROM asignaturas WHERE id_asinatura=?";
        PreparedStatement sentenciaSql=conexion.getConexion().prepareStatement(sql);
        sentenciaSql.setString(1, id_asignatura);
        sentenciaSql.executeUpdate();
    }
    
    //CAMBIAR EL ID_ASINATURA
    public void modificarAsignatura(String id_asignatura) throws SQLException{
        
        String sql="UPDATE asignaturas SET id_asignatura=?";
        PreparedStatement statement=conexion.getConexion().prepareStatement(sql);
        statement.setString(1, id_asignatura);
        statement.executeQuery();
       
    }
    
}
