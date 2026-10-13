package fcc;

import java.time.LocalDate;

public class Reservation {

    protected int idReserva;
    protected String nombreCliente;
    protected LocalDate fecha;
    protected boolean activa;

    public Reservation(
            int idReserva,
            String nombreCliente,
            LocalDate fecha) {

        this.idReserva = idReserva;
        this.nombreCliente = nombreCliente;
        this.fecha = fecha;
        activa = true;
    }      
            
    public void verificarEstado() {

        if (activa) {

            System.out.println(
                    "Reserva activa."
            );

        } else {

            System.out.println(
                    "Reserva cancelada."
            );
        }
    }

    public void modificarFecha(
            LocalDate nuevaFecha) {

        fecha = nuevaFecha;
    }
}


class ResortReservation extends Reservation {

    private int numeroHabitacion;

    public ResortReservation(
            int idReserva,
            String nombreCliente,
            LocalDate fecha,
            int numeroHabitacion) {

        super(
                idReserva,
                nombreCliente,
                fecha
        );

        this.numeroHabitacion =
                numeroHabitacion;
    }
    
    public void obtenDatosHabitacion () {
        System.out.println("Reserva de hotel");
        System.out.println("----------------");
        System.out.println("id " + idReserva);
        System.out.println("Nombre " + nombreCliente);
        System.out.println("Fecha " + fecha);
        System.out.println("Habitacion " + numeroHabitacion);
    }

    public void modificarHabitacion(
            int nuevaHabitacion) {

        numeroHabitacion =
                nuevaHabitacion;
    }
}


class RailwayReservation extends Reservation {

    private String numeroAsiento;

    public RailwayReservation(
            int idReserva,
            String nombreCliente,
            LocalDate fecha,
            String numeroAsiento) {

        super(
                idReserva,
                nombreCliente,
                fecha
        );

        this.numeroAsiento =
                numeroAsiento;
    }

    public void modificarAsiento(
            String nuevoAsiento) {

        numeroAsiento =
                nuevoAsiento;
    }
    
    public void obtenDatosTren () {
        System.out.println("Reserva de Tren");
        System.out.println("----------------");
        System.out.println("id " + idReserva);
        System.out.println("Nombre " + nombreCliente);
        System.out.println("Fecha " + fecha);
        System.out.println("Asiento " + numeroAsiento);
    }
}