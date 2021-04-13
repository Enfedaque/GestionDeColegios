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
public class Matriculados {
    
    private String año_matricula;
    private int duracion;

    //CONSTRUCTOR
    public Matriculados(String año_matricula, int duracion) {
        this.año_matricula = año_matricula;
        this.duracion = duracion;
    }
    
    //GETTER Y SETTER

    public String getAño_matricula() {
        return año_matricula;
    }

    public void setAño_matricula(String año_matricula) {
        this.año_matricula = año_matricula;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }
    
    //ToString

    @Override
    public String toString() {
        return "Matriculados{" + "a\u00f1o_matricula=" + año_matricula + 
                ", duracion=" + duracion + '}';
    }
    
    
}
