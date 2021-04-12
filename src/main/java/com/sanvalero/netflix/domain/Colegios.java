package com.sanvalero.netflix.domain;

/**
 * Una película
 */
public class Colegios {
    
    private String nombre;
    private String ciudad;
    private int antiguedad;
    private String telefono;
   
    //CONSTRUCTOR
    public Colegios(int id, String nombre, String director, int antiguedad, String telefono) {
        this.nombre = nombre;
        this.ciudad = director;
        this.antiguedad = antiguedad;
        this.telefono = telefono;
    }
    
    
    //GETTER Y SETTER
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

   
    
    
}
