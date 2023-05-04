/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

/**
 *
 * @author INGESIS
 */
public class Estudiante {

    //------------------------------------
    private int idEstudiante;
    private String nombreEstudiante;
    private String apellido;
    //------------------------------------Constructor

    public Estudiante() {
    }

    public Estudiante(int idEstudiante, String nombreEstudiante, String apellido) {
        this.idEstudiante = idEstudiante;
        this.nombreEstudiante = nombreEstudiante;
        this.apellido = apellido;
    }

    public Estudiante(int idEstudiante) {
        this.idEstudiante = idEstudiante;
    }
    //------------------------------------Get y Set

    public int getIdEstudiante() {
        return idEstudiante;
    }

    public void setIdEstudiante(int idEstudiante) {
        this.idEstudiante = idEstudiante;
    }

    public String getNombreEstudiante() {
        return nombreEstudiante;
    }

    public void setNombreEstudiante(String nombreEstudiante) {
        this.nombreEstudiante = nombreEstudiante;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

}
