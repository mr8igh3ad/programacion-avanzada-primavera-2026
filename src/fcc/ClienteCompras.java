package fcc;

import java.util.ArrayList;

public class ClienteCompras {

    protected String nombre;
    protected String correo;
    protected ArrayList<Double> historialCompras;

    public ClienteCompras(
            String nombre,
            String correo) {

        this.nombre = nombre;
        this.correo = correo;

        historialCompras =
                new ArrayList<>();
    }

    public void agregarCompra(double cantidad) {

        historialCompras.add(cantidad);
    }

    public double calcularGastoTotal() {

        double total = 0;

        for (double compra : historialCompras) {
            total += compra;
        }

        return total;
    }

    public void mostrarDatos() {

        System.out.println(
                "Cliente: " + nombre
        );

        System.out.println(
                "Correo: " + correo
        );

        System.out.println(
                "Gasto total: $"
                + calcularGastoTotal()
        );
    }
}


class LoyalCustomer extends ClienteCompras {

    private double tasaDescuento;

    public LoyalCustomer(
            String nombre,
            String correo,
            double tasaDescuento) {

        super(nombre, correo);

        this.tasaDescuento =
                tasaDescuento;
    }

    public double aplicarDescuento(
            double precio) {

        return precio
                - precio
                * tasaDescuento / 100;
    }
}