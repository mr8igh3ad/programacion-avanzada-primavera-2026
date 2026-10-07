package fcc;

import java.util.Scanner;
import java.time.LocalDate;
import java.time.LocalTime;

public class Main {

    // Metodo para mostrar el menu
    static void despliegaMenu() {

        System.out.println();
        System.out.println("      Menu de Clases");
        System.out.println("========================");
        System.out.println("[1]  Persona");
        System.out.println("[2]  Perro");
        System.out.println("[3]  Rectangulo");
        System.out.println("[4]  Circulo");
        System.out.println("[5]  Libro");
        System.out.println("[6]  Empleado");
        System.out.println("[7]  Banco");
        System.out.println("[8]  Traffic Light");
        System.out.println("[9]  Empleado 2");
        System.out.println("[10] Estudiante");
        System.out.println("[11] Biblioteca");
        System.out.println("[12] Avion");
        System.out.println("[13] Inventario");
        System.out.println("[14] Escuela");
        System.out.println("[15] Music Library");
        System.out.println("[0]  Auf Wiedersehen");
        System.out.println("========================");
    }


    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int opcion;

        do {

            // Mostrar menu
            despliegaMenu();

            System.out.print(
                    "Selecciona una opcion entre 1 y 15 "
                    + "o 0 para salir: "
            );

            opcion = teclado.nextInt();

            System.out.println();

            switch (opcion) {

                // ==================================
                // OPCION 1 - PERSONA
                // ==================================
                case 1: {

                    Persona persona1 =
                            new Persona(
                                    "Alfredo",
                                    60
                            );

                    Persona persona2 =
                            new Persona(
                                    "Elisa",
                                    48
                            );

                    System.out.println("Persona 1");
                    System.out.println("---------");
                    persona1.mostrarDatos();

                    System.out.println();

                    System.out.println("Persona 2");
                    System.out.println("---------");
                    persona2.mostrarDatos();

                    break;
                }


                // ==================================
                // OPCION 2 - PERRO
                // ==================================
                case 2: {

                    Perro perro1 =
                            new Perro(
                                    "Max",
                                    "Labrador"
                            );

                    Perro perro2 =
                            new Perro(
                                    "Luna",
                                    "Beagle"
                            );

                    System.out.println(
                            "Datos originales:"
                    );

                    System.out.println();

                    perro1.mostrarDatos();

                    System.out.println();

                    perro2.mostrarDatos();

                    // Modificar datos utilizando setters
                    perro1.setNombre("Rocky");
                    perro1.setRaza("Golden Retriever");

                    perro2.setNombre("Nala");
                    perro2.setRaza("Poodle");

                    System.out.println();
                    System.out.println(
                            "Datos modificados:"
                    );

                    System.out.println();

                    perro1.mostrarDatos();

                    System.out.println();

                    perro2.mostrarDatos();

                    break;
                }


                // ==================================
                // OPCION 3 - RECTANGULO
                // ==================================
                case 3: {

                    Rectangulo rectangulo =
                            new Rectangulo(
                                    10,
                                    5
                            );

                    System.out.println(
                            "Area: "
                            + rectangulo.calcularArea()
                    );

                    System.out.println(
                            "Perimetro: "
                            + rectangulo.calcularPerimetro()
                    );

                    break;
                }


                // ==================================
                // OPCION 4 - CIRCULO
                // ==================================
                case 4: {

                    Circulo circulo =
                            new Circulo(5);

                    System.out.println(
                            "Radio: "
                            + circulo.getRadio()
                    );

                    System.out.println(
                            "Area: "
                            + circulo.calcularArea()
                    );

                    System.out.println(
                            "Circunferencia: "
                            + circulo.calcularCircunferencia()
                    );

                    // Modificar radio
                    circulo.setRadio(10);

                    System.out.println();

                    System.out.println(
                            "Nuevo radio: "
                            + circulo.getRadio()
                    );

                    System.out.println(
                            "Nueva area: "
                            + circulo.calcularArea()
                    );

                    System.out.println(
                            "Nueva circunferencia: "
                            + circulo.calcularCircunferencia()
                    );

                    break;
                }


                // ==================================
                // OPCION 5 - LIBRO
                // ==================================
                case 5: {

                    Libro libro1 =
                            new Libro(
                                    "Cien años de soledad",
                                    "Gabriel Garcia Marquez",
                                    "001"
                            );

                    Libro libro2 =
                            new Libro(
                                    "Don Quijote",
                                    "Miguel de Cervantes",
                                    "002"
                            );

                    Libro.agregarLibro(libro1);
                    Libro.agregarLibro(libro2);

                    System.out.println(
                            "Coleccion de libros:"
                    );

                    Libro.mostrarColeccion();

                    System.out.println();

                    System.out.println(
                            "Eliminando libro ISBN 002..."
                    );

                    Libro.eliminarLibro("002");

                    System.out.println();

                    System.out.println(
                            "Coleccion actualizada:"
                    );

                    Libro.mostrarColeccion();

                    break;
                }


                // ==================================
                // OPCION 6 - EMPLEADO
                // ==================================
                case 6: {

                    Empleado empleado =
                            new Empleado(
                                    "Carlos",
                                    "Gerente",
                                    25000
                            );

                    System.out.println(
                            "Datos del empleado:"
                    );

                    empleado.mostrarDatos();

                    System.out.println();

                    System.out.println(
                            "Salario anual: $"
                            + empleado.calcularSalarioAnual()
                    );

                    empleado.actualizarSalario(
                            28000
                    );

                    System.out.println();

                    System.out.println(
                            "Datos con salario actualizado:"
                    );

                    empleado.mostrarDatos();

                    break;
                }


                // ==================================
                // OPCION 7 - BANCO
                // ==================================
                case 7: {

                    Banco banco =
                            new Banco();

                    Cuenta cuenta =
                            new Cuenta(
                                    101,
                                    "Alfredo",
                                    5000
                            );

                    banco.agregarCuenta(cuenta);

                    System.out.println(
                            "Cuenta inicial:"
                    );

                    cuenta.mostrarDatos();

                    System.out.println();

                    System.out.println(
                            "Deposito de $3000"
                    );

                    banco.depositar(
                            101,
                            3000
                    );

                    System.out.println(
                            "Retiro de $1000"
                    );

                    banco.retirar(
                            101,
                            1000
                    );

                    System.out.println();

                    System.out.println(
                            "Cuenta actualizada:"
                    );

                    cuenta.mostrarDatos();

                    break;
                }


                // ==================================
                // OPCION 8 - TRAFFIC LIGHT
                // ==================================
                case 8: {

                    TrafficLight semaforo =
                            new TrafficLight(
                                    "rojo",
                                    30
                            );

                    semaforo.mostrarDatos();

                    System.out.println();

                    System.out.println(
                            "¿Esta en rojo? "
                            + semaforo.esRojo()
                    );

                    semaforo.cambiarColor(
                            "verde"
                    );

                    System.out.println();

                    System.out.println(
                            "Se cambio el color."
                    );

                    System.out.println(
                            "¿Esta en verde? "
                            + semaforo.esVerde()
                    );

                    break;
                }


                // ==================================
                // OPCION 9 - EMPLEADO 2
                // ==================================
                case 9: {

                    Empleado2 empleado =
                            new Empleado2(
                                    "Ana",
                                    20000,
                                    LocalDate.of(
                                            2018,
                                            5,
                                            10
                                    )
                            );

                    empleado.mostrarDatos();

                    break;
                }


                // ==================================
                // OPCION 10 - ESTUDIANTE
                // ==================================
                case 10: {

                    Estudiante estudiante =
                            new Estudiante(
                                    "Juan",
                                    9.5
                            );

                    estudiante.agregarCurso(
                            "Programacion"
                    );

                    estudiante.agregarCurso(
                            "Matematicas"
                    );

                    System.out.println(
                            "Datos del estudiante:"
                    );

                    estudiante.mostrarDatos();

                    estudiante.eliminarCurso(
                            "Matematicas"
                    );

                    System.out.println();

                    System.out.println(
                            "Despues de eliminar Matematicas:"
                    );

                    estudiante.mostrarDatos();

                    break;
                }


                // ==================================
                // OPCION 11 - BIBLIOTECA
                // ==================================
                case 11: {

                    Biblioteca biblioteca =
                            new Biblioteca();

                    Libro libro1 =
                            new Libro(
                                    "El Principito",
                                    "Antoine de Saint-Exupery",
                                    "101"
                            );

                    Libro libro2 =
                            new Libro(
                                    "1984",
                                    "George Orwell",
                                    "102"
                            );

                    biblioteca.agregarLibro(
                            libro1
                    );

                    biblioteca.agregarLibro(
                            libro2
                    );

                    System.out.println(
                            "Libros de la biblioteca:"
                    );

                    biblioteca.mostrarLibros();

                    System.out.println();

                    System.out.println(
                            "Eliminando libro ISBN 101..."
                    );

                    biblioteca.eliminarLibro(
                            "101"
                    );

                    System.out.println();

                    System.out.println(
                            "Biblioteca actualizada:"
                    );

                    biblioteca.mostrarLibros();

                    break;
                }


                // ==================================
                // OPCION 12 - AVION
                // ==================================
                case 12: {

                    Avion avion =
                            new Avion(
                                    "AM101",
                                    "Cancun",
                                    LocalTime.of(
                                            15,
                                            30
                                    )
                            );

                    System.out.println(
                            "Estado inicial:"
                    );

                    avion.verificarEstado();

                    avion.retrasarVuelo(
                            45
                    );

                    System.out.println();

                    System.out.println(
                            "Estado despues del retraso:"
                    );

                    avion.verificarEstado();

                    break;
                }


                // ==================================
                // OPCION 13 - INVENTARIO
                // ==================================
                case 13: {

                    Inventario inventario =
                            new Inventario();

                    inventario.agregarProducto(
                            "Cafe",
                            20
                    );

                    inventario.agregarProducto(
                            "Azucar",
                            3
                    );

                    inventario.agregarProducto(
                            "Leche",
                            4
                    );

                    System.out.println(
                            "Inventario:"
                    );

                    inventario.mostrarInventario();

                    System.out.println();

                    inventario.verificarInventarioBajo(
                            5
                    );

                    break;
                }


                // ==================================
                // OPCION 14 - ESCUELA
                // ==================================
                case 14: {

                    Escuela escuela =
                            new Escuela();

                    escuela.agregarEstudiante(
                            "Juan"
                    );

                    escuela.agregarEstudiante(
                            "Maria"
                    );

                    escuela.agregarProfesor(
                            "Profesor Garcia"
                    );

                    escuela.crearClase(
                            "Programacion"
                    );

                    escuela.crearClase(
                            "Matematicas"
                    );

                    escuela.mostrarDatos();

                    break;
                }


                // ==================================
                // OPCION 15 - MUSIC LIBRARY
                // ==================================
                case 15: {

                    MusicLibrary musica =
                            new MusicLibrary();

                    musica.agregarCancion(
                            "Imagine",
                            "John Lennon"
                    );

                    musica.agregarCancion(
                            "Yesterday",
                            "The Beatles"
                    );

                    musica.agregarCancion(
                            "Bohemian Rhapsody",
                            "Queen"
                    );

                    System.out.println(
                            "Biblioteca musical:"
                    );

                    musica.mostrarCanciones();

                    System.out.println();

                    musica.reproducirAleatoria();

                    break;
                }


                // ==================================
                // OPCION 0 - SALIR
                // ==================================
                case 0: {

                    System.out.println(
                            "Hasta luego."
                    );

                    break;
                }


                // ==================================
                // OPCION NO VALIDA
                // ==================================
                default: {

                    System.out.println(
                            "Opcion no valida."
                    );

                    System.out.println(
                            "Selecciona una opcion "
                            + "entre 1 y 15 o 0 para salir."
                    );

                    break;
                }
            }

            // Separacion entre una ejecucion
            // y la siguiente aparicion del menu
            System.out.println();
            System.out.println(
                    "=============================="
            );

        } while (opcion != 0);

        teclado.close();
    }
}