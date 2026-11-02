package fcc.futbol;

/** Clase adicional para representar al equipo de futbol del enunciado. */
public class EquipoFutbol {
    private final String nombre;
    private final String ciudad;
    private final Alineacion alineacion;

    public EquipoFutbol(String nombre, String ciudad, Alineacion alineacion) {
        if (alineacion == null) {
            throw new IllegalArgumentException("El equipo requiere una alineacion.");
        }
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.alineacion = alineacion;
    }

    public String obtenerNombre() { return nombre; }
    public String obtenerCiudad() { return ciudad; }

    public void mostrarEquipo() {
        System.out.println("==================================");
        System.out.println("EQUIPO: " + nombre + " - " + ciudad);
        System.out.println("==================================");
        alineacion.mostrarAlineacion();
    }
}
