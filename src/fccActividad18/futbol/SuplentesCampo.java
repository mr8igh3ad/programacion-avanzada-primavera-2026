package fcc.futbol;

/** Cada objeto de esta clase representa a un jugador suplente. */
public class SuplentesCampo extends Jugador {
    private final String posicionNatural;
    private final int minutosJugados;

    public SuplentesCampo(String nombre, int numeroJugador,
                          String posicionNatural, int minutosJugados) {
        super(nombre, numeroJugador);
        this.posicionNatural = posicionNatural;
        this.minutosJugados = minutosJugados;
    }

    public String obtenerPosicionNatural() { return posicionNatural; }
    public int obtenerMinutosJugados() { return minutosJugados; }

    @Override
    public String obtenerRol() { return "Suplente de campo"; }

    @Override
    public String mostrarDatos() {
        return super.mostrarDatos() + " | posicion: " + posicionNatural
                + ", minutos jugados: " + minutosJugados;
    }
}
