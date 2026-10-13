package fcc;

import java.util.ArrayList;

public class Pelicula {

    private String titulo;
    private String director;
    private ArrayList<String> actores;
    private ArrayList<String> resenas;

    public Pelicula(String titulo, String director) {

        this.titulo = titulo;
        this.director = director;

        actores = new ArrayList<>();
        resenas = new ArrayList<>();
    }

    public void agregarActor(String actor) {
        actores.add(actor);
    }

    public void agregarResena(String resena) {
        resenas.add(resena);
    }

    public void mostrarResenas() {

        System.out.println("Reseñas:");

        for (String resena : resenas) {
            System.out.println("- " + resena);
        }
    }

    public void mostrarDatos() {

        System.out.println("Titulo: " + titulo);
        System.out.println("Director: " + director);
        System.out.println("Actores: " + actores);
    }
}