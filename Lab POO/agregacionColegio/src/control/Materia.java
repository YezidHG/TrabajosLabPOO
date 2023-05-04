/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

/**
 *
 * @author INGESIS
 */
public class Materia {

    private int idMateria;
    private String nombreMateria;
    private int semestreMateria;
    private String tipoMateria;
    //------------------------------------Constructor

    public Materia(int idMateria, String nombreMateria, int semestreMateria, String tipoMateria) {
        this.idMateria = idMateria;
        this.nombreMateria = nombreMateria;
        this.semestreMateria = semestreMateria;
        this.tipoMateria = tipoMateria;
    }

    public Materia() {
    }

    public Materia(int idMateria) {
        this.idMateria = idMateria;
    }
    //------------------------------------Get y Set

    public int getIdMateria() {
        return idMateria;
    }

    public void setIdMateria(int idMateria) {
        this.idMateria = idMateria;
    }

    public String getNombreMateria() {
        return nombreMateria;
    }

    public void setNombreMateria(String nombreMateria) {
        this.nombreMateria = nombreMateria;
    }

    public int getSemestreMateria() {
        return semestreMateria;
    }

    public void setSemestreMateria(int semestreMateria) {
        this.semestreMateria = semestreMateria;
    }

    public String getTipoMateria() {
        return tipoMateria;
    }

    public void setTipoMateria(String tipoMateria) {
        this.tipoMateria = tipoMateria;
    }

}
