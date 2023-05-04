/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import java.util.ArrayList;

/**
 *
 * @author INGESIS
 */
public class Colegio {

    private String nombreColegio;
    private ArrayList<Estudiante> listaEstudiante;
    private ArrayList<Profesor> listaProfesor;

    //------------------------------------
    //------------------------------------Constructor
    public Colegio(String nombreColegio) {
        this.nombreColegio = nombreColegio;
        listaEstudiante = new ArrayList<>();
        listaProfesor = new ArrayList<>();
    }

    public Colegio() {
    }
    //------------------------------------
    //------------------------------------Get y Set

    public String getNombreColegio() {
        return nombreColegio;
    }

    public void setNombreColegio(String nombreColegio) {
        this.nombreColegio = nombreColegio;
    }
    //------------------------------------

    public void addEstudiante(Estudiante estudiante) {
        if (!buscarEstudiante(estudiante)) {
            this.listaEstudiante.add(estudiante);
        } else {
            System.out.println("Estudiante ya existe:" + estudiante.getIdEstudiante());
        }
    }
    //------------------------------------
    //------------------------------------Buscar estudiantes

    public boolean buscarEstudiante(Estudiante estudiante) {
        boolean encuentra = false;
        if (estadoListaEstudiantes()) {
            for (int i = 0; i < listaEstudiante.size(); i++) {
                Estudiante estudianteActual = listaEstudiante.get(i);
                if (estudianteActual.getIdEstudiante() == estudiante.getIdEstudiante()) {
                    encuentra = true;
                }
            }
        } else {
            System.out.println("La lista esta vacia:");
        }
        return encuentra;
    }

    //------------------------------------
    //------------------------------------Retornar Estudiante
    public Estudiante retornarEstudiante(Estudiante estudiante) {
        Estudiante estudianteRetorno = null;
        for (int i = 0; i < listaEstudiante.size(); i++) {
            Estudiante estudianteActual = listaEstudiante.get(i);
            if (estudianteActual.getIdEstudiante() == estudiante.getIdEstudiante()) {
                estudianteRetorno = estudianteActual;
            }
        }
        return estudianteRetorno;
    }
    //------------------------------------
    //------------------------------------Retornar id de la lista

    public int retornarId(Estudiante estudiante) {
        int index = -1;
        for (int i = 0; i < listaEstudiante.size(); i++) {
            Estudiante estudianteActual = listaEstudiante.get(i);
            if (estudianteActual.getIdEstudiante() == estudiante.getIdEstudiante()) {
                index = i;
            }
        }
        return index;
    }
    //------------------------------------
    //------------------------------------Eliminar estudiante

    public void eliminarEstudiante(Estudiante estudiante) {
        if (estadoListaEstudiantes()) {
            int index = retornarId(estudiante);
            if (index >= 0) {
                listaEstudiante.remove(index);
            } else {
                System.out.println("NO existe el estudiante!");
            }
        } else {
            System.out.println("La lista esta vacia:");
        }
    }
    //------------------------------------
    //------------------------------------Listar Estudiantes
    //------------------------------------

    public void listaEstudiantes() {
        for (int i = 0; i < listaEstudiante.size(); i++) {
            Estudiante estudianteActual = listaEstudiante.get(i);
            System.out.println("id : " + estudianteActual.getIdEstudiante()
                    + " Nombre: " + estudianteActual.getNombreEstudiante()
                    + " Apellido: " + estudianteActual.getApellido());
        }
    }
    //------------------------------------

    public boolean estadoListaEstudiantes() {
        if (listaEstudiante.size() > 0) {
            return true;
        } else {
            return false;
        }
    }

    //------------------------------------
    //------------------------------------Modificar estudiante
    public void modificarEstudiante(int id, String nombre, String apellido) {
        if (estadoListaEstudiantes()) {
            for (int i = 0; i < listaEstudiante.size(); i++) {
                if (listaEstudiante.get(i).getIdEstudiante() == id) {
                    listaEstudiante.get(i).setNombreEstudiante(nombre);
                    listaEstudiante.get(i).setApellido(apellido);
                }
            }
        } else {
            System.out.println("La lista esta vacia:");
        }
    }
    //------------------------------------

    public static void main(String[] args) {
        Colegio cole = new Colegio("Liceo de la Unicauca");

        cole.addEstudiante(new Estudiante(1, "Juanito", "Peres"));
        cole.addEstudiante(new Estudiante(2, "Maria", "Paredes"));
        cole.addEstudiante(new Estudiante(3, "Carlos", "Meneces"));
        cole.addEstudiante(new Estudiante(4, "Esteban", "Lopez"));
        cole.addEstudiante(new Estudiante(5, "Sebastian", "Diaz"));
        cole.addEstudiante(new Estudiante(6, "Miguel", "Castro"));
        cole.listaEstudiantes();
        cole.addEstudiante(new Estudiante(6));
        cole.modificarEstudiante(2, "Patricia", "Teheran");
        cole.eliminarEstudiante(new Estudiante(5));
        cole.listaEstudiantes();
    }
}
