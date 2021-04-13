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


    public Asignaturas(String ID_Asignatura) {
        this.ID_Asignatura = ID_Asignatura;
  
    }
    


    public String getID_Asignatura() {
        return ID_Asignatura;
    }

    public void setID_Asignatura(String ID_Asignatura) {
        this.ID_Asignatura = ID_Asignatura;
    }
    
}
