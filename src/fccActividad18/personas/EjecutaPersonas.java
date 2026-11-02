package fcc.personas;

public class EjecutaPersonas {

    public static void main(String[] args) {

        // Tres objetos de Persona
        Persona persona1 = new Persona("Laura", 28, "Femenino");
        Persona persona2 = new Persona("Carlos", 35, "Masculino");
        Persona persona3 = new Persona("Andrea", 42, "Femenino");

        // Tres objetos de Estudiante
        Estudiante estudiante1 =
                new Estudiante("Ana", 20, "Femenino", 1001, 9.2, "Ciencia de Datos");

        Estudiante estudiante2 =
                new Estudiante("Luis", 21, "Masculino", 1002, 8.8, "Computacion");

        Estudiante estudiante3 =
                new Estudiante("Maria", 22, "Femenino", 1003, 9.5, "Ingenieria de Software");

        // Tres objetos de Docente
        Docente docente1 =
                new Docente("Roberto", 45, "Masculino", 501, 25000, "Computacion");

        Docente docente2 =
                new Docente("Patricia", 39, "Femenino", 502, 27000, "Matematicas");

        Docente docente3 =
                new Docente("Fernando", 50, "Masculino", 503, 30000, "Sistemas");

        // Tres objetos de Administrativo
        Administrativo administrativo1 =
                new Administrativo("Sofia", 32, "Femenino", 701, "Coordinadora", 18000);

        Administrativo administrativo2 =
                new Administrativo("Miguel", 40, "Masculino", 702, "Secretario", 16000);

        Administrativo administrativo3 =
                new Administrativo("Elena", 37, "Femenino", 703, "Analista", 17000);

        System.out.println("=== PERSONAS ===");
        persona1.mostrarDatos();
        System.out.println();
        persona2.mostrarDatos();
        System.out.println();
        persona3.mostrarDatos();

        System.out.println("\n=== ESTUDIANTES ===");
        estudiante1.datosDeAlumno();
        System.out.println();
        estudiante2.datosDeAlumno();
        System.out.println();
        estudiante3.datosDeAlumno();

        System.out.println("\n=== DOCENTES ===");
        docente1.datosDocente();
        System.out.println();
        docente2.datosDocente();
        System.out.println();
        docente3.datosDocente();

        System.out.println("\n=== ADMINISTRATIVOS ===");
        administrativo1.datosAdministrativo();
        System.out.println();
        administrativo2.datosAdministrativo();
        System.out.println();
        administrativo3.datosAdministrativo();
    }
}
