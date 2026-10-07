package fcc;

import java.util.ArrayList;

public class Libro {

    private String titulo;
    private String autor;
    private String isbn;

    private static ArrayList<Libro> coleccion =
            new ArrayList<>();

    public Libro(String titulo, String autor, String isbn) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
    }

    public static void agregarLibro(Libro libro) {
        coleccion.add(libro);
    }

    public static void eliminarLibro(String isbn) {

        coleccion.removeIf(
                libro -> libro.isbn.equals(isbn)
        );
    }

    public static void mostrarColeccion() {

        for (Libro libro : coleccion) {

            System.out.println(
                    libro.titulo + " - "
                    + libro.autor + " - "
                    + libro.isbn
            );
        }
    }

    public String getTitulo() {
        return titulo;
    }

    public String getIsbn() {
        return isbn;
    }

    @Override
    public String toString() {
        return titulo + " - " + autor;
    }
}