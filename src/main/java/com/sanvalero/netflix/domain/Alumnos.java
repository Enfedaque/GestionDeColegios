package com.sanvalero.netflix.domain;

/**
 * Una película
 */
public class Alumnos {
    
    private String id_alumno;
    private String nombre;
    private String apellido;
    private String edad;
    private String telefono;
   
    //CONSTRUCTOR
    public Alumnos(String id_alumno, String nombre, String apellido, String edad, String telefono) {
        this.id_alumno=id_alumno;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.telefono = telefono;
    }
    
    
    //GETTER Y SETTER
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEdad() {
        return edad;
    }

    public void setAntiguedad(String edad) {
        this.edad = edad;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

   //ToString()

    @Override
    public String toString() {
        return "Colegios{" + "nombre=" + nombre + ", apellido=" + apellido + 
                ", edad=" + edad + ", telefono=" + telefono + '}';
    }
    
    
}
