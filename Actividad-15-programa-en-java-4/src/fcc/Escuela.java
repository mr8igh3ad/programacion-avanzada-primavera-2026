package fcc;

import java.util.ArrayList;

public class Escuela {

    private ArrayList<String> estudiantes;
    private ArrayList<String> profesores;
    private ArrayList<String> clases;

    public Escuela() {

        estudiantes = new ArrayList<>();
        profesores = new ArrayList<>();
        clases = new ArrayList<>();
    }

    public void agregarEstudiante(
            String estudiante) {

        estudiantes.add(estudiante);
    }

    public void eliminarEstudiante(
            String estudiante) {

        estudiantes.remove(estudiante);
    }

    public void agregarProfesor(
            String profesor) {

        profesores.add(profesor);
    }

    public void eliminarProfesor(
            String profesor) {

        profesores.remove(profesor);
    }

    public void crearClase(String clase) {
        clases.add(clase);
    }

    public void mostrarDatos() {

        System.out.println(
                "Estudiantes: " + estudiantes
        );

        System.out.println(
                "Profesores: " + profesores
        );

        System.out.println(
                "Clases: " + clases
        );
    }
}