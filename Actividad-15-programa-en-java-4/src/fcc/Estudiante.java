package fcc;

import java.util.ArrayList;

public class Estudiante {

    private String nombre;
    private double calificacion;
    private ArrayList<String> cursos;

    public Estudiante(
            String nombre,
            double calificacion) {

        this.nombre = nombre;
        this.calificacion = calificacion;

        cursos = new ArrayList<>();
    }

    public void agregarCurso(String curso) {
        cursos.add(curso);
    }

    public void eliminarCurso(String curso) {
        cursos.remove(curso);
    }

    public void mostrarDatos() {

        System.out.println("Nombre: " + nombre);

        System.out.println(
                "Calificacion: " + calificacion
        );

        System.out.println(
                "Cursos: " + cursos
        );
    }
}