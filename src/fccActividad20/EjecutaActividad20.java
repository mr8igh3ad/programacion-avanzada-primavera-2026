package fcc.Actividad20;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

/** Punto de entrada: menú de las tres relaciones entre clases. */
public class EjecutaActividad20 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String opcion;

        mostrarEncabezado();

        do {
            mostrarMenu();
            System.out.print("Selecciona una opción: ");
            opcion = teclado.nextLine().trim();
            System.out.println();

            switch (opcion) {
                case "1":
                    ejemploAsociacion();
                    break;
                case "2":
                    ejemploAgregacion();
                    break;
                case "3":
                    ejemploComposicion();
                    break;
                case "4":
                    System.out.println("Gracias por utilizar el programa. ¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida. Selecciona del 1 al 4.");
                    break;
            }
            System.out.println();
        } while (!opcion.equals("4"));

        teclado.close();
    }

    public static void mostrarEncabezado() {
        System.out.println("==========================================");
        System.out.println("             ACTIVIDAD 20");
        System.out.println("  RELACIONES ENTRE CLASES EN JAVA");
        System.out.println("==========================================");
    }

    public static void mostrarMenu() {
        System.out.println("---------------- MENÚ --------------------");
        System.out.println("1. Ejemplo de Asociación");
        System.out.println("2. Ejemplo de Agregación");
        System.out.println("3. Ejemplo de Composición");
        System.out.println("4. Salir");
        System.out.println("------------------------------------------");
    }

    public static void ejemploAsociacion() {
        System.out.println("=== 1. ASOCIACIÓN: BANCO - EMPEADO ===");

        // Los empleados se crean independientemente del banco.
        Employee emp1 = new Employee("Ridhi");
        Employee emp2 = new Employee("Vijay");
        Set<Employee> employees = new LinkedHashSet<>();
        employees.add(emp1);
        employees.add(emp2);

        Bank bank = new Bank("ICICI");
        bank.setEmployees(employees);

        for (Employee emp : bank.getEmployees()) {
            System.out.println(emp.getEmployeeName()
                    + " trabaja en el banco " + bank.getBankName());
        }
        System.out.println("Relación: asociación. Banco y empleados pueden existir por separado.");
    }

    public static void ejemploAgregacion() {
        System.out.println("=== 2. AGREGACIÓN: INSTITUTO - DEPARTMENTO - ESTUDIANTE ===");

        // Los estudiantes y departamentos existen antes que el instituto.
        Student s1 = new Student("Parul", 1);
        Student s2 = new Student("Sachin", 2);
        Student s3 = new Student("Priya", 3);
        Student s4 = new Student("Rahul", 4);

        List<Student> alumnosCSE = new ArrayList<>();
        alumnosCSE.add(s1);
        alumnosCSE.add(s2);
        List<Student> alumnosEE = new ArrayList<>();
        alumnosEE.add(s3);
        alumnosEE.add(s4);

        Department cse = new Department("CSE", alumnosCSE);
        Department ee = new Department("EE", alumnosEE);
        List<Department> departments = new ArrayList<>();
        departments.add(cse);
        departments.add(ee);

        Institute institute = new Institute("BITS", departments);

        System.out.println("Instituto: " + institute.getInstituteName());
        for (Department department : institute.getDepartments()) {
            System.out.println("Departamento " + department.getDeptName() + ":");
            for (Student student : department.getStudents()) {
                System.out.println("  - " + student.getStudentName()
                        + " (ID: " + student.getStudentId() + ")");
            }
        }
        System.out.println("Total de estudiantes: "
                + institute.getTotalStudentsInInstitute());
        System.out.println("Relación: agregación. El instituto agrupa departamentos independientes.");
    }

    public static void ejemploComposicion() {
        System.out.println("=== 3. COMPOSICIÓN: CASA - HABITACION ===");

        House house = new House("Dream House");
        // Las habitaciones son creadas por la propia casa.
        house.addRoom("Living Room");
        house.addRoom("Bedroom");
        house.addRoom("Kitchen");
        house.addRoom("Bathroom");

        System.out.println("Casa: " + house.getHouseName());
        System.out.println("Total de habitaciones: " + house.getTotalRooms());
        System.out.println("Habitaciones:");
        for (String name : house.getRoomNames()) {
            System.out.println("  - " + name);
        }
        System.out.println("Relación: composición. Las habitaciones forman parte de la casa.");
    }
}
