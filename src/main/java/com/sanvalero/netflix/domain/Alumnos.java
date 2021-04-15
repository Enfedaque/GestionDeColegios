/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sanvalero.netflix.domain;

/**
 *
 * @author David Enfedaque
 */
public class Alumnos {
    
    private String id_alumno;
    private String nombre;
    private String apellido;
    private int edad;
    private String telefono;
   
    //CONSTRUCTOR
    public Alumnos(String id_alumno, String nombre, String apellido, int edad, String telefono) {
        this.id_alumno=id_alumno;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.telefono = telefono;
    }

    public Alumnos() {
        
    }

    public String getId_alumno() {
        return id_alumno;
    }

    public void setId_alumno(String id_alumno) {
        this.id_alumno = id_alumno;
    }

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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getTelefono() {
        return telefono;
    }

    //GETTER Y SETTER
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
