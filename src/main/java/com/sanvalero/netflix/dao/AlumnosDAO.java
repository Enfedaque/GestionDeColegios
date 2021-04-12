
package com.sanvalero.netflix.dao;

import com.sanvalero.netflix.domain.Alumnos;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

public class AlumnosDAO {

    //CAMBIADO LOS DATOS PARA ORACLE
    private final String DRIVER = "oracle.jdbc.driver.OracleDriver";
    private final String URL_CONEXION = "jdbc:oracle:thin:@localhost:1521:xe";
    private final String USUARIO = "HR";
    private final String CONTRASENA = "HR";
    
    private Connection connection;
    
    public AlumnosDAO() {
        connect();
    }
    
    /**
     * Conecta con la base de datos
     */
    //NO TOCAR 
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
    //NO TOCAR
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
    //AÑADIR COLEGIO A LA BBDD
    public void añadirAlumno(String nombre, String apellido, String edad, String 
            telefono) throws SQLException {
        //Insertamos nuestros datos en los apartados de la tabla
        String sql = "INSERT INTO alumnos (nombre, apellido, edad, telefono) " +
                "VALUES (?, ?, ?, ?)";
        //TODO aun sin hacer, cambiar los get...
        PreparedStatement sentencia = connection.prepareStatement(sql);
        sentencia.setString(1, nombre); 
        sentencia.setString(2, apellido);
        sentencia.setString(3, edad);
        sentencia.setString(4, telefono);
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
