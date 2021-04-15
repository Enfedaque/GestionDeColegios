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
public class Asignaturas {
    
    private String ID_Asignatura;
    private int horas;
    private String dificultad;

    //CONSTRUCTOR
    public Asignaturas(String ID_Asignatura, int horas, String dificultad) {
        this.ID_Asignatura = ID_Asignatura;
        this.horas = horas;
        this.dificultad = dificultad;
    }

    public Asignaturas() {
        
    }


   //GETTER Y SETTER
    public String getID_Asignatura() {
        return ID_Asignatura;
    }

    public void setID_Asignatura(String ID_Asignatura) {
        this.ID_Asignatura = ID_Asignatura;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public String getDificultad() {
        return dificultad;
    }

    public void setDificultad(String dificultad) {
        this.dificultad = dificultad;
    }
    
    
    
}
