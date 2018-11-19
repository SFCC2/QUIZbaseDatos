/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VO;

/**
 *
 * @author Asus-PC
 */
public class Registro {
    private int idRegistro;
    private String nombre;
    private int codCurso;
    private int semestre;
    private int nota;

    public Registro(int idRegistro, String nombre, int codCurso, int semestre, int nota) {
        this.idRegistro = idRegistro;
        this.nombre = nombre;
        this.codCurso = codCurso;
        this.semestre = semestre;
        this.nota = nota;
    }

    public int getIdRegistro() {
        return idRegistro;
    }

    public void setIdRegistro(int idRegistro) {
        this.idRegistro = idRegistro;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCodCurso() {
        return codCurso;
    }

    public void setCodCurso(int codCurso) {
        this.codCurso = codCurso;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }
    
       public Registro() {
    }
    
}
