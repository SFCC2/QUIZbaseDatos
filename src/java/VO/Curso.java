/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VO;

/**
 *
 * @author Labing I5
 */
public class Curso {
    private int idCurso;
    private String nombre;

    public Curso(int cedula, String nombre) {
        this.idCurso = cedula;
        this.nombre = nombre;
    }

    public int getCedula() {
        return idCurso;
    }

    public void setCedula(int cedula) {
        this.idCurso = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

   public Curso() {
    }
    

   
}
