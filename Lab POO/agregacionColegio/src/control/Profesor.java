/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

/**
 *
 * @author INGESIS
 */
public class Profesor {

    private int idProfesor;
    private String nombreProfesor;
    private String profesionProfesor;
    private Materia materiaDictada;
    //------------------------------------
    //------------------------------------Constructor

    public Profesor() {
    }

    public Profesor(int idProfesor, String nombreProfesor, String profesionProfesor, Materia materiaDictada) {
        this.idProfesor = idProfesor;
        this.nombreProfesor = nombreProfesor;
        this.profesionProfesor = profesionProfesor;
        this.materiaDictada = materiaDictada;
    }

    public Profesor(int idProfesor) {
        this.idProfesor = idProfesor;
    }
    //------------------------------------
    //------------------------------------Get y Set

    public int getIdProfesor() {
        return idProfesor;
    }

    public void setIdProfesor(int idProfesor) {
        this.idProfesor = idProfesor;
    }

    public String getNombreProfesor() {
        return nombreProfesor;
    }

    public void setNombreProfesor(String nombreProfesor) {
        this.nombreProfesor = nombreProfesor;
    }

    public String getProfesionProfesor() {
        return profesionProfesor;
    }

    public void setProfesionProfesor(String profesionProfesor) {
        this.profesionProfesor = profesionProfesor;
    }

    public Materia getMateriaDictada() {
        return materiaDictada;
    }

    public void setMateriaDictada(Materia materiaDictada) {
        this.materiaDictada = materiaDictada;
    }

}
