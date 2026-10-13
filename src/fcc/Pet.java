package fcc;

public class Pet {

    protected String nombre;
    protected String especie;
    protected int edad;

    public Pet(
            String nombre,
            String especie,
            int edad) {

        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
    }

    public void mostrarDetalles() {

        System.out.println(
                "Nombre: " + nombre
        );

        System.out.println(
                "Especie: " + especie
        );

        System.out.println(
                "Edad: " + edad
        );
    }

    public int calcularEdadHumana() {

        return edad;
    }
}


class PerroMascota extends Pet {

    private String jugueteFavorito;

    public PerroMascota(
            String nombre,
            int edad,
            String jugueteFavorito) {

        super(
                nombre,
                "Perro",
                edad
        );

        this.jugueteFavorito =
                jugueteFavorito;
    }

    @Override
    public int calcularEdadHumana() {

        return edad * 7;
    }

    @Override
    public void mostrarDetalles() {

        super.mostrarDetalles();

        System.out.println(
                "Juguete favorito: "
                + jugueteFavorito
        );
    }
}


class Pajaro extends Pet {

    private double envergaduraAlas;

    public Pajaro(
            String nombre,
            int edad,
            double envergaduraAlas) {

        super(
                nombre,
                "Pajaro",
                edad
        );

        this.envergaduraAlas =
                envergaduraAlas;
    }

    @Override
    public int calcularEdadHumana() {

        return edad * 5;
    }

    @Override
    public void mostrarDetalles() {

        super.mostrarDetalles();

        System.out.println(
                "Envergadura: "
                + envergaduraAlas
                + " cm"
        );
    }
}
