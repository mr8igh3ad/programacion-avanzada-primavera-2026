package fcc;

import java.util.ArrayList;

public class AgenciaViajes {

    private ArrayList<String> vuelos;
    private ArrayList<String> hoteles;
    private ArrayList<String> reservaciones;

    public AgenciaViajes() {

        vuelos = new ArrayList<>();
        hoteles = new ArrayList<>();
        reservaciones = new ArrayList<>();

        vuelos.add("Puebla - Cancun");
        vuelos.add("Mexico - Monterrey");

        hoteles.add("Hotel Camarena Cancun");
        hoteles.add("Hotel Centro Monterrey");
    }

    public void buscarVuelos() {

        System.out.println("Vuelos disponibles:");
        System.out.println("-------------------");

        for (String vuelo : vuelos) {
            System.out.println("- " + vuelo);
        }
    }

    public void buscarHoteles() {

        System.out.println("Hoteles disponibles:");
        System.out.println("--------------------");

        for (String hotel : hoteles) {
            System.out.println("- " + hotel);
        }
    }

    public void reservar(String reservacion) {

        reservaciones.add(reservacion);

        System.out.println(
                "Reservacion realizada: "
                + reservacion
        );
    }

    public void cancelar(String reservacion) {

        reservaciones.remove(reservacion);

        System.out.println(
                "Reservacion cancelada: "
                + reservacion
        );
    }
}