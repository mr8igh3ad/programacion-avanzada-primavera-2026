package fcc.nomina;

/**
 * Superclase abstracta que define la informacion comun de los empleados.
 * Adaptacion academica del ejemplo de nomina de Deitel.
 * Para evitar recopilar NSS reales, utiliza un numero interno de empleado.
 * Deitel utiliza el numero de seguro social como identificador.
 */
public abstract class Empleado {

    private final String numeroEmpleado;
    private final String primerNombre;
    private final String apellidoPaterno;

    public Empleado(String numeroEmpleado, String primerNombre, String apellidoPaterno) {
        if (numeroEmpleado == null || numeroEmpleado.isBlank()
                || primerNombre == null || primerNombre.isBlank()
                || apellidoPaterno == null || apellidoPaterno.isBlank()) {
            throw new IllegalArgumentException("Todos los datos del empleado son obligatorios.");
        }
        this.numeroEmpleado = numeroEmpleado.trim();
        this.primerNombre = primerNombre.trim();
        this.apellidoPaterno = apellidoPaterno.trim();
    }

    public final String obtenerNumeroEmpleado() {
        return numeroEmpleado;
    }

    public final String obtenerNombreCompleto() {
        return primerNombre + " " + apellidoPaterno;
    }

    public abstract double ingresos();

    public abstract String obtenerTipo();

    @Override
    public String toString() {
        return String.format("%s (%s)", obtenerNombreCompleto(), numeroEmpleado);
    }
}
