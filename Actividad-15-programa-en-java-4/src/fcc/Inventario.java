package fcc;

import java.util.ArrayList;

class Producto {

    String nombre;
    int cantidad;

    public Producto(
            String nombre,
            int cantidad) {

        this.nombre = nombre;
        this.cantidad = cantidad;
    }
}


public class Inventario {

    private ArrayList<Producto> productos =
            new ArrayList<>();

    public void agregarProducto(
            String nombre,
            int cantidad) {

        productos.add(
                new Producto(nombre, cantidad)
        );
    }

    public void eliminarProducto(String nombre) {

        productos.removeIf(
                producto ->
                producto.nombre.equalsIgnoreCase(nombre)
        );
    }

    public void verificarInventarioBajo(
            int limite) {

        System.out.println(
                "Productos con inventario bajo:"
        );

        for (Producto producto : productos) {

            if (producto.cantidad < limite) {

                System.out.println(
                        producto.nombre
                        + ": "
                        + producto.cantidad
                );
            }
        }
    }

    public void mostrarInventario() {

        for (Producto producto : productos) {

            System.out.println(
                    producto.nombre
                    + ": "
                    + producto.cantidad
            );
        }
    }
}