package com.sanvalero.netflix.domain;

/**
 * Una película
 */
public class Asignatura {
    

    private String ID_Asignatura;


    public Asignatura(String ID_Asignatura) {
        this.ID_Asignatura = ID_Asignatura;
  
    }
    


    public String getID_Asignatura() {
        return ID_Asignatura;
    }

    public void setID_Asignatura(String ID_Asignatura) {
        this.ID_Asignatura = ID_Asignatura;
    }

}