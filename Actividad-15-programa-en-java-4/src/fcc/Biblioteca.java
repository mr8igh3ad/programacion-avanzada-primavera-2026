package fcc;

import java.util.ArrayList;

public class Biblioteca {

    private ArrayList<Libro> libros;

    public Biblioteca() {
        libros = new ArrayList<>();
    }

    public void agregarLibro(Libro libro) {
        libros.add(libro);
    }

    public void eliminarLibro(String isbn) {

        libros.removeIf(
                libro ->
                libro.getIsbn().equals(isbn)
        );
    }

    public void mostrarLibros() {

        System.out.println("Libros:");

        for (Libro libro : libros) {
            System.out.println(libro);
        }
    }
}