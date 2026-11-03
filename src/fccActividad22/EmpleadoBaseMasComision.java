package fcc.nomina;

public class EmpleadoBaseMasComision extends EmpleadoPorComision {

    private double salarioBase;
    private boolean bonoAplicado;

    public EmpleadoBaseMasComision(String numero, String nombre, String apellido,
                                  double ventasBrutas, double tarifaComision,
                                  double salarioBase) {
        super(numero, nombre, apellido, ventasBrutas, tarifaComision);
        Validaciones.noNegativo(salarioBase, "El salario base");
        this.salarioBase = salarioBase;
    }

    @Override
    public double ingresos() {
        return salarioBase + super.ingresos();
    }

    @Override
    public String obtenerTipo() {
        return "Base mas comision";
    }

    public double obtenerSalarioBase() {
        return salarioBase;
    }

    // Siguiendo el caso de estudio de Deitel: incremento del 10 %
    // sobre el salario base de esta categoria de empleado.
    public void establecerSalarioBase(double nuevoSalarioBase) {
        Validaciones.noNegativo(nuevoSalarioBase, "El salario base");
        salarioBase = nuevoSalarioBase;
    }

    // Impide aplicar el mismo incremento al reimprimir la nomina.
    public boolean aplicarBonoDiezPorCientoUnaVez() {
        if (bonoAplicado) {
            return false;
        }
        establecerSalarioBase(1.10 * obtenerSalarioBase());
        bonoAplicado = true;
        return true;
    }

    @Override
    public String toString() {
        return String.format("Empleado con salario base mas comision: %s; "
                        + "salario base: $%,.2f", super.toString(), salarioBase);
    }
}
