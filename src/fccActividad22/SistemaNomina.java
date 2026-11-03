package fcc.nomina;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

/** Administra empleados y muestra una simulacion de nomina semanal. */
public class SistemaNomina {

    private final String nombreEmpresa;
    private final List<Empleado> empleados = new ArrayList<>();

    public SistemaNomina(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public boolean existeNumero(String numero) {
        for (Empleado empleado : empleados) {
            if (empleado.obtenerNumeroEmpleado().equalsIgnoreCase(numero)) {
                return true;
            }
        }
        return false;
    }

    public void agregarEmpleado(Empleado empleado) {
        if (empleado == null || existeNumero(empleado.obtenerNumeroEmpleado())) {
            throw new IllegalArgumentException(
                    "El empleado es nulo o su numero ya esta registrado.");
        }
        empleados.add(empleado);
    }

    public int obtenerCantidadEmpleados() {
        return empleados.size();
    }

    public List<Empleado> obtenerEmpleados() {
        return Collections.unmodifiableList(empleados);
    }

    public void ejecutarPago() {
        System.out.println();
        System.out.println("===============================================================");
        System.out.println("           NOMINA SEMANAL - " + nombreEmpresa.toUpperCase());
        System.out.println("===============================================================");

        if (empleados.isEmpty()) {
            System.out.println("No hay empleados capturados. Usa primero la opcion 1.");
            return;
        }

        System.out.printf("%-9s %-22s %-19s %12s%n",
                "NUMERO", "NOMBRE", "TIPO", "PAGO BRUTO");
        System.out.println("---------------------------------------------------------------");

        double total = 0;
        for (Empleado empleado : empleados) {
            // Ejemplo del capitulo 10.5 de Deitel: detectar el tipo en
            // tiempo de ejecucion y dar 10 % extra sobre el salario base.
            if (empleado instanceof EmpleadoBaseMasComision) {
                EmpleadoBaseMasComision empleadoBase =
                        (EmpleadoBaseMasComision) empleado;
                if (empleadoBase.aplicarBonoDiezPorCientoUnaVez()) {
                    System.out.printf("Bono del 10%% aplicado al salario base de %s.%n",
                            empleado.obtenerNombreCompleto());
                }
            }
            // Polimorfismo: el metodo ingresos() se elige segun la subclase real.
            double pago = empleado.ingresos();
            total += pago;
            System.out.printf(Locale.forLanguageTag("es-MX"),
                    "%-9s %-22s %-19s $%,11.2f%n",
                    empleado.obtenerNumeroEmpleado(),
                    truncar(empleado.obtenerNombreCompleto(), 22),
                    truncar(empleado.obtenerTipo(), 19),
                    pago);
        }

        System.out.println("---------------------------------------------------------------");
        System.out.printf(Locale.forLanguageTag("es-MX"),
                "TOTAL BRUTO SEMANAL: $%,.2f MXN%n", total);
        System.out.println("Empleados procesados: " + empleados.size());
        System.out.println("Simulacion academica: no realiza transferencias.");
        System.out.println("No incluye ISR, IMSS ni otras deducciones.");
    }

    private static String truncar(String texto, int limite) {
        return texto.length() <= limite ? texto : texto.substring(0, limite);
    }
}
