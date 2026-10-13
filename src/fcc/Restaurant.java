package fcc;

import java.util.ArrayList;

class ElementoMenu {

    String nombre;
    double precio;
    double calificacion;

    public ElementoMenu(
            String nombre,
            double precio,
            double calificacion) {

        this.nombre = nombre;
        this.precio = precio;
        this.calificacion = calificacion;
    }
}


public class Restaurant {

    private ArrayList<ElementoMenu> menu;

    public Restaurant() {
        menu = new ArrayList<>();
    }

    public void agregarElemento(
            String nombre,
            double precio,
            double calificacion) {

        menu.add(
                new ElementoMenu(
                        nombre,
                        precio,
                        calificacion
                )
        );
    }

    public void eliminarElemento(String nombre) {

        menu.removeIf(
                elemento ->
                elemento.nombre.equalsIgnoreCase(nombre)
        );
    }

    public double calcularCalificacionPromedio() {

        if (menu.isEmpty()) {
            return 0;
        }

        double suma = 0;

        for (ElementoMenu elemento : menu) {
            suma += elemento.calificacion;
        }

        return suma / menu.size();
    }

    public void mostrarMenu() {

        for (ElementoMenu elemento : menu) {

            System.out.println(
                    elemento.nombre
                    + " - $"
                    + elemento.precio
                    + " - Calificacion: "
                    + elemento.calificacion
            );
        }
    }
}
