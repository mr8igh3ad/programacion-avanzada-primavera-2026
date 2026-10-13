package fcc;

public class Vehiculo {

    protected String marca;
    protected String modelo;
    protected int anio;

    public Vehiculo(
            String marca,
            String modelo,
            int anio) {

        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
    }

    public void mostrarDetalles() {

        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Año: " + anio);
    }
}


class Coche extends Vehiculo {

    private double tamanoMaletero;

    public Coche(
            String marca,
            String modelo,
            int anio,
            double tamanoMaletero) {

        super(marca, modelo, anio);

        this.tamanoMaletero =
                tamanoMaletero;
    }

    @Override
    public void mostrarDetalles() {

        super.mostrarDetalles();

        System.out.println(
                "Maletero: "
                + tamanoMaletero
                + " litros"
        );
    }
}


class Camion extends Vehiculo {

    private double capacidadCarga;

    public Camion(
            String marca,
            String modelo,
            int anio,
            double capacidadCarga) {

        super(marca, modelo, anio);

        this.capacidadCarga =
                capacidadCarga;
    }

    @Override
    public void mostrarDetalles() {

        super.mostrarDetalles();

        System.out.println(
                "Capacidad de carga: "
                + capacidadCarga
                + " kg"
        );
    }
}