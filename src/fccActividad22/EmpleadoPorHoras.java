package fcc.nomina;

public class EmpleadoPorHoras extends Empleado {

    private final double sueldoPorHora;
    private final double horasTrabajadas;

    public EmpleadoPorHoras(String numero, String nombre, String apellido,
                            double sueldoPorHora, double horasTrabajadas) {
        super(numero, nombre, apellido);
        Validaciones.noNegativo(sueldoPorHora, "El sueldo por hora");
        Validaciones.enRango(horasTrabajadas, 0, 168, "Las horas trabajadas");
        this.sueldoPorHora = sueldoPorHora;
        this.horasTrabajadas = horasTrabajadas;
    }

    @Override
    public double ingresos() {
        if (horasTrabajadas <= 40) {
            return sueldoPorHora * horasTrabajadas;
        }
        return 40 * sueldoPorHora
                + (horasTrabajadas - 40) * sueldoPorHora * 1.5;
    }

    @Override
    public String obtenerTipo() {
        return "Por horas";
    }

    public double obtenerSueldoPorHora() {
        return sueldoPorHora;
    }

    public double obtenerHorasTrabajadas() {
        return horasTrabajadas;
    }
    @Override
    public String toString() {
        return String.format("Empleado por horas: %s; sueldo: $%,.2f; horas: %,.2f",
                super.toString(), sueldoPorHora, horasTrabajadas);
    }
}
