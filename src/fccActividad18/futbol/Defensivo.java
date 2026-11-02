package fcc.futbol;

/** El ejercicio solicita exactamente nueve defensivos titulares. */
public class Defensivo extends Jugador {
    private final int recuperaciones;
    private final int despejes;

    public Defensivo(String nombre, int numeroJugador, int recuperaciones, int despejes) {
        super(nombre, numeroJugador);
        this.recuperaciones = recuperaciones;
        this.despejes = despejes;
    }

    public int obtenerRecuperaciones() { return recuperaciones; }
    public int obtenerDespejes() { return despejes; }

    @Override
    public String obtenerRol() { return "Defensivo"; }

    @Override
    public String mostrarDatos() {
        return super.mostrarDatos() + " | recuperaciones: " + recuperaciones
                + ", despejes: " + despejes;
    }
}
