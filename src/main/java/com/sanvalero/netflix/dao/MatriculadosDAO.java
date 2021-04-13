/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sanvalero.netflix.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author David Enfedaque
 */
public class MatriculadosDAO {
    
    private Conexion conexion;
    
    public MatriculadosDAO(Conexion conexion) {
        this.conexion=conexion;;
    }
    
    //AÑADIR MATRICULA
    public void añadirMatricula(String año, int duracion) throws SQLException {
        String sql = "INSERT INTO matriculas(ano, duracion) VALUES (?, ?)";
        
        /*PreparedStatement sentencia = conexion.prepareStatement(sql);
        sentencia.setString(1, conexion.getID_Asignatura());

        sentencia.executeUpdate();*/
        
        PreparedStatement sentenciaSql=conexion.getConexion().prepareStatement(sql);
        //Le indico los parametros para cada hueco
        sentenciaSql.setString(1, año);
        sentenciaSql.setInt(2, duracion);
        sentenciaSql.executeUpdate();
    }
    
    
     public void mostrarMatriculados() throws SQLException {        
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
    /*public ArrayList<Matriculas> verTodasAsignaturas() throws SQLException {        
        return new ArrayList<>();
    }*/
    
    //ELIMINADO MATRICULA DEL AÑO 
    public void borrarMatricula(String año) throws SQLException{
        
        String sql="DELETE FROM matriculados WHERE año=?";
        PreparedStatement sentenciaSql=conexion.getConexion().prepareStatement(sql);
        sentenciaSql.setString(1, año);
        sentenciaSql.executeUpdate();
    }
    
    public void modificarMatriculados(String año) throws SQLException{
         String sql="UPDATE matriculados SET año=?";
        PreparedStatement statement=conexion.getConexion().prepareStatement(sql);
        statement.setString(1, año);
        statement.executeUpdate();
        
    }
}
