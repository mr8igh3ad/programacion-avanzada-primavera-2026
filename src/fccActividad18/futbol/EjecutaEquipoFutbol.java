package fcc.futbol;

import java.util.Arrays;
import java.util.List;

/** Clase que contiene el metodo main para ejecutar el ejercicio. */
public class EjecutaEquipoFutbol {
    public static void main(String[] args) {
        Portero portero = new Portero("Luis", 1, 8, 1);
        Ofensivo ofensivo = new Ofensivo("Carlos", 9, 5, 2);

        List<Defensivo> defensivos = Arrays.asList(
            new Defensivo("Diego", 2, 10, 3),
            new Defensivo("Emilio", 3, 8, 4),
            new Defensivo("Fernando", 4, 9, 3),
            new Defensivo("Gabriel", 5, 11, 5),
            new Defensivo("Hector", 6, 8, 2),
            new Defensivo("Ivan", 7, 7, 3),
            new Defensivo("Jorge", 8, 9, 4),
            new Defensivo("Kevin", 10, 6, 3),
            new Defensivo("Mario", 11, 10, 4)
        );

        Alineacion alineacion = new Alineacion(
            "1 portero + 1 ofensivo + 9 defensivos",
            "Entrenador Ramirez", portero, ofensivo, defensivos
        );

        // La cantidad de suplentes puede ser cero, uno o varios.
        alineacion.agregarSuplente(
            new SuplentesCampo("Oscar", 12, "Defensa", 15));
        alineacion.agregarSuplente(
            new SuplentesCampo("Pablo", 13, "Delantero", 20));

        EquipoFutbol equipo = new EquipoFutbol("Equipo Universitario", "Puebla", alineacion);
        equipo.mostrarEquipo();
    }
}
