package fcc.futbol;

/** El enunciado establece un ofensivo titular por alineacion. */
public class Ofensivo extends Jugador {
    private final int goles;
    private final int asistencias;

    public Ofensivo(String nombre, int numeroJugador, int goles, int asistencias) {
        super(nombre, numeroJugador);
        this.goles = goles;
        this.asistencias = asistencias;
    }

    public int obtenerGoles() { return goles; }
    public int obtenerAsistencias() { return asistencias; }

    @Override
    public String obtenerRol() { return "Ofensivo"; }

    @Override
    public String mostrarDatos() {
        return super.mostrarDatos() + " | goles: " + goles
                + ", asistencias: " + asistencias;
    }
}
