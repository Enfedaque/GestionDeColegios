
package com.sanvalero.netflix.dao;

import com.sanvalero.netflix.domain.Movie;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

public class MovieDAO {

    //CAMBIADO LOS DATOS PARA ORACLE
    private final String DRIVER = "oracle.jdbc.driver.OracleDriver";
    private final String URL_CONEXION = "jdbc:oracle:thin:@localhost:1521:xe";
    private final String USUARIO = "HR";
    private final String CONTRASENA = "HR";
    
    private Connection connection;
    
    public MovieDAO() {
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
    public void añadirColegio(Movie movie) throws SQLException {
        //Insertamos nuestros datos en los apartados de la tabla
        String sql = "INSERT INTO colegios (nombre-col, ciudad, telefono, antiguedad) " +
                "VALUES (?, ?, ?, ?)";
        //TODO aun sin hacer, cambiar los get...
        PreparedStatement sentencia = connection.prepareStatement(sql);
        sentencia.setString(1, movie.getTitle()); 
        sentencia.setString(2, movie.getDirector());
        sentencia.setInt(3, movie.getDuration());
        sentencia.setString(4, movie.getCategory());
        sentencia.setBoolean(5, movie.isViewed());
        sentencia.executeUpdate();
    }
    
    /**
     * Obtiene la lista de peliculas de la base de datos
     * @return Una colección con las peliculas
     */
    public ArrayList<Movie> getAllMovies() throws SQLException {        
        return new ArrayList<>();
    }
    
    /**
     * Elimina una película
     * @param id El id de la pelicula a eliminar
     */
    public void removeMovie(int id) {
        
    }
    
    /**
     * Modifica la información de una pelicula
     * @param movie La película con la información a modificar
     */
    public void modifyMovie(Movie movie) {
        
    }
}
