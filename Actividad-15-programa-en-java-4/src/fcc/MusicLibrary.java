package fcc;

import java.util.ArrayList;
import java.util.Random;

class Cancion {

    String titulo;
    String artista;

    public Cancion(
            String titulo,
            String artista) {

        this.titulo = titulo;
        this.artista = artista;
    }

    @Override
    public String toString() {
        return titulo + " - " + artista;
    }
}


public class MusicLibrary {

    private ArrayList<Cancion> canciones =
            new ArrayList<>();

    public void agregarCancion(
            String titulo,
            String artista) {

        canciones.add(
                new Cancion(titulo, artista)
        );
    }

    public void eliminarCancion(
            String titulo) {

        canciones.removeIf(
                cancion ->
                cancion.titulo.equalsIgnoreCase(titulo)
        );
    }

    public void reproducirAleatoria() {

        if (canciones.isEmpty()) {

            System.out.println(
                    "No hay canciones."
            );

            return;
        }

        Random random = new Random();

        int posicion =
                random.nextInt(canciones.size());

        System.out.println(
                "Reproduciendo: "
                + canciones.get(posicion)
        );
    }

    public void mostrarCanciones() {

        for (Cancion cancion : canciones) {
            System.out.println(cancion);
        }
    }
}