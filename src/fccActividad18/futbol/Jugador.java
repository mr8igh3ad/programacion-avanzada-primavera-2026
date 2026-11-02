package fcc.futbol;

/** Clase base para los jugadores del equipo. */
public class Jugador {
    private final String nombre;
    private final int numeroJugador;

    public Jugador(String nombre, int numeroJugador) {
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre del jugador es obligatorio.");
        }
        if (numeroJugador <= 0) {
            throw new IllegalArgumentException("El numero del jugador debe ser positivo.");
        }
        this.nombre = nombre;
        this.numeroJugador = numeroJugador;
    }

    public String obtenerNombre() { return nombre; }
    public int obtenerNumeroJugador() { return numeroJugador; }
    public String obtenerRol() { return "Jugador"; }

    public String mostrarDatos() {
        return "#" + numeroJugador + " " + nombre + " - " + obtenerRol();
    }
}
