package fcc.nomina;

public class EmpleadoAsalariado extends Empleado {

    private final double salarioSemanal;

    public EmpleadoAsalariado(String numero, String nombre, String apellido,
                             double salarioSemanal) {
        super(numero, nombre, apellido);
        Validaciones.noNegativo(salarioSemanal, "El salario semanal");
        this.salarioSemanal = salarioSemanal;
    }

    @Override
    public double ingresos() {
        return salarioSemanal;
    }

    @Override
    public String obtenerTipo() {
        return "Asalariado";
    }

    public double obtenerSalarioSemanal() {
        return salarioSemanal;
    }
    @Override
    public String toString() {
        return String.format("Empleado asalariado: %s; salario semanal: $%,.2f",
                super.toString(), salarioSemanal);
    }
}
