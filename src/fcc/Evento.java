package fcc;

import java.time.LocalDate;
import java.util.ArrayList;

public class Evento {

    protected String nombre;
    protected LocalDate fecha;
    protected String ubicacion;

    public Evento(
            String nombre,
            LocalDate fecha,
            String ubicacion) {

        this.nombre = nombre;
        this.fecha = fecha;
        this.ubicacion = ubicacion;
    }

    public void mostrarDetalles() {

        System.out.println(
                "Evento: " + nombre
        );

        System.out.println(
                "Fecha: " + fecha
        );

        System.out.println(
                "Ubicacion: " + ubicacion
        );
    }

    public boolean tieneConflicto(
            Evento otroEvento) {

        return fecha.equals(otroEvento.fecha)
                && ubicacion.equalsIgnoreCase(
                        otroEvento.ubicacion
                );
    }
}


class Seminario extends Evento {

    private int numeroOradores;

    public Seminario(
            String nombre,
            LocalDate fecha,
            String ubicacion,
            int numeroOradores) {

        super(
                nombre,
                fecha,
                ubicacion
        );

        this.numeroOradores =
                numeroOradores;
    }

    @Override
    public void mostrarDetalles() {

        super.mostrarDetalles();

        System.out.println(
                "Numero de oradores: "
                + numeroOradores
        );
    }
}


class MusicalPerformance extends Evento {

    private ArrayList<String> artistas;

    public MusicalPerformance(
            String nombre,
            LocalDate fecha,
            String ubicacion) {

        super(
                nombre,
                fecha,
                ubicacion
        );

        artistas = new ArrayList<>();
    }

    public void agregarArtista(
            String artista) {

        artistas.add(artista);
    }

    @Override
    public void mostrarDetalles() {

        super.mostrarDetalles();

        System.out.println(
                "Artistas: " + artistas
        );
    }
}