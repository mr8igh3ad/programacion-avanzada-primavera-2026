package fcc.futbol;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Composicion segun el diagrama del ejercicio:
 * 1 portero, 1 ofensivo, 9 defensivos y 0..* suplentes.
 * Esta clase mantiene las referencias a sus jugadores componentes.
 */
public class Alineacion {
    private final String formacion;
    private final String directorTecnico;
    private final Portero portero;
    private final Ofensivo ofensivo;
    private final List<Defensivo> defensivos;
    private final List<SuplentesCampo> suplentes;

    public Alineacion(String formacion, String directorTecnico,
                      Portero portero, Ofensivo ofensivo,
                      List<Defensivo> defensivos) {
        if (portero == null || ofensivo == null || defensivos == null) {
            throw new IllegalArgumentException("Faltan jugadores titulares.");
        }
        if (defensivos.size() != 9 || defensivos.contains(null)) {
            throw new IllegalArgumentException("La alineacion requiere 9 defensivos.");
        }
        this.formacion = formacion;
        this.directorTecnico = directorTecnico;
        this.portero = portero;
        this.ofensivo = ofensivo;
        this.defensivos = new ArrayList<>(defensivos);
        this.suplentes = new ArrayList<>();
        verificarNumerosTitulares();
    }

    private void verificarNumerosTitulares() {
        Set<Integer> numeros = new HashSet<>();
        numeros.add(portero.obtenerNumeroJugador());
        if (!numeros.add(ofensivo.obtenerNumeroJugador())) {
            throw new IllegalArgumentException("Numero de camiseta repetido.");
        }
        for (Defensivo jugador : defensivos) {
            if (!numeros.add(jugador.obtenerNumeroJugador())) {
                throw new IllegalArgumentException("Numero de camiseta repetido.");
            }
        }
    }

    public void agregarSuplente(SuplentesCampo suplente) {
        if (suplente == null) {
            throw new IllegalArgumentException("El suplente no puede ser null.");
        }
        int numero = suplente.obtenerNumeroJugador();
        if (numero == portero.obtenerNumeroJugador()
                || numero == ofensivo.obtenerNumeroJugador()) {
            throw new IllegalArgumentException("Numero de camiseta repetido.");
        }
        for (Defensivo jugador : defensivos) {
            if (jugador.obtenerNumeroJugador() == numero) {
                throw new IllegalArgumentException("Numero de camiseta repetido.");
            }
        }
        for (SuplentesCampo jugador : suplentes) {
            if (jugador.obtenerNumeroJugador() == numero) {
                throw new IllegalArgumentException("Numero de camiseta repetido.");
            }
        }
        suplentes.add(suplente);
    }

    public int totalTitulares() { return 2 + defensivos.size(); }
    public int totalSuplentes() { return suplentes.size(); }
    public String obtenerFormacion() { return formacion; }
    public String obtenerDirectorTecnico() { return directorTecnico; }
    public List<Defensivo> obtenerDefensivos() {
        return Collections.unmodifiableList(defensivos);
    }
    public List<SuplentesCampo> obtenerSuplentes() {
        return Collections.unmodifiableList(suplentes);
    }

    public void mostrarAlineacion() {
        System.out.println("Formacion: " + formacion);
        System.out.println("Director tecnico: " + directorTecnico);
        System.out.println("PORTERO (1)");
        System.out.println("  " + portero.mostrarDatos());
        System.out.println("OFENSIVO (1)");
        System.out.println("  " + ofensivo.mostrarDatos());
        System.out.println("DEFENSIVOS (9)");
        for (Defensivo jugador : defensivos) {
            System.out.println("  " + jugador.mostrarDatos());
        }
        System.out.println("SUPLENTES DE CAMPO (" + suplentes.size() + ")");
        if (suplentes.isEmpty()) {
            System.out.println("  Sin suplentes registrados.");
        }
        for (SuplentesCampo jugador : suplentes) {
            System.out.println("  " + jugador.mostrarDatos());
        }
        System.out.println("Titulares: " + totalTitulares());
    }
}
