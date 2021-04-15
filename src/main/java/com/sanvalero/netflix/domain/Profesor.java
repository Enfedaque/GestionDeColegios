package com.sanvalero.netflix.domain;

/**
 * Una película
 */
public class Profesor {
    
    
    private int edad;
    private String nombre_prof;
    private String telefono;
    private String dni;

    public Profesor(int edad, String nombre_prof, String telefono, String dni) {
        this.edad = edad;
        this.nombre_prof = nombre_prof;
        this.telefono = telefono;
        this.dni = dni;
    }
    
    //PRUEBA
    public Profesor(){
        
    }
    
    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre_prof() {
        return nombre_prof;
    }

    public void setNombre_prof(String nombre_prof) {
        this.nombre_prof = nombre_prof;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
    

}

