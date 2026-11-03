package fcc.nomina;

import java.util.Scanner;

/**
 * Programa principal para la actividad: Sistema de Nomina "Mi Ranchito".
 * Cambia el campo AUTOR por tu nombre antes de entregar.
 */
public class PruebaSistemaNomina {

    private static final String AUTOR = "[Nombre del estudiante]";
    private static final Scanner teclado = new Scanner(System.in);
    private static final SistemaNomina nomina = new SistemaNomina("Mi Ranchito");

    public static void main(String[] args) {
        int opcion;

        do {
            mostrarEncabezado();
            System.out.println("MENU PRINCIPAL");
            System.out.println("1. Capturar variables para pago");
            System.out.println("2. Ejecutar el pago");
            System.out.println("3. Fin");
            opcion = leerEntero("Selecciona una opcion: ", 1, 3);

            switch (opcion) {
                case 1: {
                    capturarEmpleado();
                    break;
                }
                case 2: {
                    nomina.ejecutarPago();
                    pausa();
                    break;
                }
                case 3: {
                    System.out.println("\nFin del sistema de nomina Mi Ranchito.");
                    break;
                }
                default: {
                    System.out.println("Opcion no valida.");
                }
            }
        } while (opcion != 3);

        teclado.close();
    }

    private static void mostrarEncabezado() {
        System.out.println();
        System.out.println("================================================================");
        System.out.println(" BENEMERITA UNIVERSIDAD AUTONOMA DE PUEBLA (BUAP)");
        System.out.println(" FACULTAD DE CIENCIAS DE LA COMPUTACION (FCC)");
        System.out.println(" INGENIERIA EN CIENCIAS DE LA COMPUTACION");
        System.out.println(" MATERIA: PROGRAMACION AVANZADA");
        System.out.println(" SISTEMA DE NOMINA DE LA EMPRESA \"MI RANCHITO\"");
        System.out.println(" AUTOR: " + AUTOR);
        System.out.println(" OBJETIVO: CALCULAR NOMINA SEMANAL MEDIANTE POLIMORFISMO");
        System.out.println("================================================================");
        System.out.printf("Empleados capturados: %d%n%n",
                nomina.obtenerCantidadEmpleados());
    }

    private static void capturarEmpleado() {
        System.out.println("\n--- CAPTURA DE VARIABLES PARA PAGO ---");
        System.out.println("Tipo de empleado:");
        System.out.println("1. Empleado asalariado");
        System.out.println("2. Empleado por horas");
        System.out.println("3. Empleado por comision");
        System.out.println("4. Empleado con salario base mas comision");
        System.out.println("5. Regresar al menu principal");
        int tipo = leerEntero("Selecciona el tipo: ", 1, 5);

        if (tipo == 5) {
            return;
        }

        String numero = leerTexto("Numero interno de empleado: ");
        if (nomina.existeNumero(numero)) {
            System.out.println("Ese numero de empleado ya esta registrado.");
            pausa();
            return;
        }

        String nombre = leerTexto("Primer nombre: ");
        String apellido = leerTexto("Apellido paterno: ");

        try {
            Empleado empleado;
            switch (tipo) {
                case 1: {
                    double salario = leerDouble(
                            "Salario semanal (MXN): ", 0, Double.MAX_VALUE);
                    empleado = new EmpleadoAsalariado(
                            numero, nombre, apellido, salario);
                    break;
                }
                case 2: {
                    double sueldo = leerDouble(
                            "Sueldo por hora (MXN): ", 0, Double.MAX_VALUE);
                    double horas = leerDouble(
                            "Horas trabajadas esta semana (0 a 168): ", 0, 168);
                    empleado = new EmpleadoPorHoras(
                            numero, nombre, apellido, sueldo, horas);
                    break;
                }
                case 3: {
                    double ventas = leerDouble(
                            "Ventas brutas semanales (MXN): ", 0, Double.MAX_VALUE);
                    double tasa = leerDouble(
                            "Tarifa de comision decimal (ejemplo 0.06): ", 0, 1);
                    empleado = new EmpleadoPorComision(
                            numero, nombre, apellido, ventas, tasa);
                    break;
                }
                case 4: {
                    double ventas = leerDouble(
                            "Ventas brutas semanales (MXN): ", 0, Double.MAX_VALUE);
                    double tasa = leerDouble(
                            "Tarifa de comision decimal (ejemplo 0.04): ", 0, 1);
                    double base = leerDouble(
                            "Salario base semanal (MXN): ", 0, Double.MAX_VALUE);
                    empleado = new EmpleadoBaseMasComision(
                            numero, nombre, apellido, ventas, tasa, base);
                    break;
                }
                default:
                    return;
            }

            nomina.agregarEmpleado(empleado);
            System.out.println("Empleado registrado correctamente: " + empleado);
        } catch (IllegalArgumentException ex) {
            System.out.println("Error al registrar empleado: " + ex.getMessage());
        }
        pausa();
    }

    private static String leerTexto(String mensaje) {
        String valor;
        do {
            System.out.print(mensaje);
            valor = teclado.nextLine().trim();
            if (valor.isEmpty()) {
                System.out.println("El dato no puede quedar vacio.");
            }
        } while (valor.isEmpty());
        return valor;
    }

    private static int leerEntero(String mensaje, int minimo, int maximo) {
        while (true) {
            System.out.print(mensaje);
            String texto = teclado.nextLine().trim();
            try {
                int valor = Integer.parseInt(texto);
                if (valor >= minimo && valor <= maximo) {
                    return valor;
                }
            } catch (NumberFormatException ex) {
                // Se solicita nuevamente el dato.
            }
            System.out.printf("Escribe un numero entero entre %d y %d.%n",
                    minimo, maximo);
        }
    }

    private static double leerDouble(String mensaje, double minimo, double maximo) {
        while (true) {
            System.out.print(mensaje);
            String texto = teclado.nextLine().trim().replace(",", ".");
            try {
                double valor = Double.parseDouble(texto);
                if (Double.isFinite(valor) && valor >= minimo && valor <= maximo) {
                    return valor;
                }
            } catch (NumberFormatException ex) {
                // Se solicita nuevamente el dato.
            }
            System.out.println("Introduce un numero valido dentro del rango indicado.");
        }
    }

    private static void pausa() {
        System.out.print("\nPresiona ENTER para continuar...");
        teclado.nextLine();
    }
}
