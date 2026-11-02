package fcc.futbol;

/** Un portero forma parte de la alineacion. */
public class Portero extends Jugador {
    private final int atajadas;
    private final int penalesDetenidos;

    public Portero(String nombre, int numeroJugador, int atajadas, int penalesDetenidos) {
        super(nombre, numeroJugador);
        this.atajadas = atajadas;
        this.penalesDetenidos = penalesDetenidos;
    }

    public int obtenerAtajadas() { return atajadas; }
    public int obtenerPenalesDetenidos() { return penalesDetenidos; }

    @Override
    public String obtenerRol() { return "Portero"; }

    @Override
    public String mostrarDatos() {
        return super.mostrarDatos() + " | atajadas: " + atajadas
                + ", penales detenidos: " + penalesDetenidos;
    }
}
