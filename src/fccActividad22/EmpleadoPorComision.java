package fcc.nomina;

public class EmpleadoPorComision extends Empleado {

    private final double ventasBrutas;
    private final double tarifaComision;

    public EmpleadoPorComision(String numero, String nombre, String apellido,
                              double ventasBrutas, double tarifaComision) {
        super(numero, nombre, apellido);
        Validaciones.noNegativo(ventasBrutas, "Las ventas brutas");
        Validaciones.enRango(tarifaComision, 0, 1, "La tarifa de comision");
        this.ventasBrutas = ventasBrutas;
        this.tarifaComision = tarifaComision;
    }

    @Override
    public double ingresos() {
        return ventasBrutas * tarifaComision;
    }

    @Override
    public String obtenerTipo() {
        return "Por comision";
    }

    public double obtenerVentasBrutas() {
        return ventasBrutas;
    }

    public double obtenerTarifaComision() {
        return tarifaComision;
    }
    @Override
    public String toString() {
        return String.format("Empleado por comision: %s; ventas: $%,.2f; "
                        + "tarifa: %.2f", super.toString(), ventasBrutas, tarifaComision);
    }
}
