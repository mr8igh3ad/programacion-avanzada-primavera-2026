package fcc;

public class ElectronicsProduct {

    protected int idProducto;
    protected String nombre;
    protected double precio;
    protected double descuento;

    public ElectronicsProduct(
            int idProducto,
            String nombre,
            double precio) {

        this.idProducto = idProducto;
        this.nombre = nombre;
        this.precio = precio;
        this.descuento = 0;
    }

    public void aplicarDescuento(
            double porcentaje) {

        descuento = porcentaje;
    }

    public double calcularPrecioFinal() {

        return precio
                - precio
                * descuento / 100;
    }

    public void mostrarDatos() {

        System.out.println(
                "Producto: " + nombre
        );

        System.out.println(
                "Precio original: $"
                + precio
        );

        System.out.println(
                "Precio final: $"
                + calcularPrecioFinal()
        );
    }
}


class Lavadora extends ElectronicsProduct {

    private int garantiaMeses;

    public Lavadora(
            int idProducto,
            String nombre,
            double precio,
            int garantiaMeses) {

        super(
                idProducto,
                nombre,
                precio
        );

        this.garantiaMeses =
                garantiaMeses;
    }

    public void extenderGarantia(
            int meses) {

        garantiaMeses += meses;
    }

    public int getGarantiaMeses() {

        return garantiaMeses;
    }
}
