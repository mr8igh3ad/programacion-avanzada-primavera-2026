package fcc;

import java.util.Scanner;
import java.time.LocalDate;

public class Main {

    static void despliegaMenu() {

        System.out.println();
        System.out.println(
                "      Menu de Clases"
        );

        System.out.println(
                "=========================="
        );

        System.out.println(
                "[1] Forma"
        );

        System.out.println(
                "[2] Pelicula"
        );

        System.out.println(
                "[3] Restaurant"
        );

        System.out.println(
                "[4] Agencia de Viajes"
        );

        System.out.println(
                "[5] BankAccount"
        );

        System.out.println(
                "[6] Vehiculo"
        );

        System.out.println(
                "[7] Cliente"
        );

        System.out.println(
                "[8] Curso"
        );

        System.out.println(
                "[9] Electronics Product"
        );

        System.out.println(
                "[10] Building"
        );

        System.out.println(
                "[11] Evento"
        );

        System.out.println(
                "[12] Customer Order"
        );

        System.out.println(
                "[13] Reservation"
        );

        System.out.println(
                "[14] Pet"
        );

        System.out.println(
                "[15] Gym Membership"
        );

        System.out.println(
                "[0]  see ya'"
        );

        System.out.println(
                "=========================="
        );
    }


    public static void main(String[] args) {

        Scanner teclado =
                new Scanner(System.in);

        int opcion;

        do {

            despliegaMenu();

            System.out.print(
                    "Selecciona una opcion: "
            );

            opcion =
                    teclado.nextInt();

            System.out.println();

            switch (opcion) {

                // ============================
                // 1 - Forma
                // ============================

                case 1: {

                    RectanguloForma rectangulo =
                            new RectanguloForma(
                                    10,
                                    5
                            );

                    CirculoForma circulo =
                            new CirculoForma(
                                    4
                            );

                    TrianguloForma triangulo =
                            new TrianguloForma(
                                    6,
                                    4,
                                    5,
                                    5
                            );

                    System.out.println(
                            "Rectangulo"
                            );
                    
                    System.out.println(
                            "----------"
                            );

                    System.out.println(
                            "Rectangulo ancho "
                            + rectangulo.getAncho()
                            );
                    
                    System.out.println(
                            "Rectangulo alto "
                            + rectangulo.getAlto()
                            );
                    
                    System.out.println(
                            "Area: "
                            + rectangulo.calcularArea()
                            );

                    System.out.println(
                            "Perimetro: "
                            + rectangulo.calcularPerimetro()
                            );

                    System.out.println();

                    System.out.println(
                            "Circulo"
                    );
                    
                    System.out.println(
                            "--------"
                    );

                    System.out.println(
                            "Area: "
                            + circulo.calcularArea()
                    );

                    System.out.println(
                            "Perimetro: "
                            + circulo.calcularPerimetro()
                    );

                    System.out.println();

                    System.out.println(
                            "Triangulo"
                    );
                    
                    System.out.println(
                            "----------"
                    );
                    
                    System.out.println(
                            "Triangulo base "
                            + triangulo.getLado1()
                            );
                    
                    System.out.println(
                            "Triangulo lado 1 "
                            + triangulo.getLado2()
                            );
                    
                    System.out.println(
                            "Triangulo lado 2 "
                            + triangulo.getLado3()
                            );

                    System.out.println(
                            "Area: "
                            + triangulo.calcularArea()
                    );

                    System.out.println(
                            "Perimetro: "
                            + triangulo.calcularPerimetro()
                    );

                    break;
                }


                // ============================
                // 2 - Pelicula
                // ============================

                case 2: {

                    Pelicula pelicula =
                            new Pelicula(
                                    "Interestelar",
                                    "Christopher Nolan"
                            );

                    pelicula.agregarActor(
                            "Matthew McConaughey"
                    );

                    pelicula.agregarActor(
                            "Anne Hathaway"
                    );

                    pelicula.agregarResena(
                            "Excelente pelicula."
                    );

                    pelicula.agregarResena(
                            "Muy buena historia."
                    );
                    
                    pelicula.agregarResena(
                            "La volveria a ver."
                    );

                    pelicula.mostrarDatos();

                    System.out.println();

                    pelicula.mostrarResenas();

                    break;
                }


                // =====================================
                // 3 - Restaurante Al canton del Italian
                // =====================================

                case 3: {

                    Restaurant restaurante =
                            new Restaurant();

                    restaurante.agregarElemento(
                            "Pizza",
                            180,
                            4.9
                    );

                    restaurante.agregarElemento(
                            "Ensalada innombrable",
                            95,
                            4.9
                    );
                    
                    restaurante.agregarElemento(
                            "Pasta Alfredo",
                            95,
                            4.9
                    );
                    
                    System.out.println("Restaurante Al canton del Italian");
                    System.out.println("---------------------------------");


                    restaurante.mostrarMenu();

                    System.out.println();

                    System.out.println(
                            "Calificacion promedio: "
                            + restaurante
                                    .calcularCalificacionPromedio()
                    );

                    break;
                }


                // ============================
                // 4 - Agencia de Viajes
                // ============================

                case 4: {

                    AgenciaViajes agencia =
                            new AgenciaViajes();

                    agencia.buscarVuelos();

                    System.out.println();

                    agencia.buscarHoteles();

                    System.out.println();

                    agencia.reservar(
                            "Puebla - Cancun"
                    );

                    break;
                }


                // ============================
                // 5 - Bank Account
                // ============================

                case 5: {

                    SavingsAccount cuenta =
                            new SavingsAccount(
                                    1001,
                                    "Alfredo",
                                    10000,
                                    5
                            );

                    cuenta.mostrarDatos();

                    cuenta.depositar(
                            2000
                    );

                    cuenta.retirar(
                            1000
                    );

                    cuenta.aplicarInteres();

                    System.out.println();

                    System.out.println(
                            "Saldo final: $"
                            + cuenta.verificarSaldo()
                    );

                    break;
                }


                // ============================
                // 6 - Vehiculo
                // ============================

                case 6: {

                    Coche coche =
                            new Coche(
                                    "Toyota",
                                    "Corolla",
                                    2025,
                                    470
                            );

                    Camion camion =
                            new Camion(
                                    "Volvo",
                                    "FH",
                                    2024,
                                    18000
                            );

                    coche.mostrarDetalles();

                    System.out.println();

                    camion.mostrarDetalles();

                    break;
                }


                // ============================
                // 7 - Cliente
                // ============================

                case 7: {

                    LoyalCustomer cliente =
                            new LoyalCustomer(
                                    "Alfredo",
                                    "alfredo.gaspar@live.com",
                                    10
                            );

                    cliente.agregarCompra(
                            500
                    );

                    cliente.agregarCompra(
                            1200
                    );

                    cliente.mostrarDatos();

                    System.out.println(
                            "Precio de $1000 "
                            + "con descuento (beneficio LoyalCustomer): $"
                            + cliente
                                    .aplicarDescuento(1000)
                    );

                    break;
                }


                // ============================
                // 8 - Curso
                // ============================

                case 8: {

                    OnlineCourse curso =
                            new OnlineCourse(
                                    "Java",
                                    "Mtra. Marcela García Alonso",
                                    6,
                                    "Teams",
                                    40
                            );

                    curso.mostrarDetalles();

                    System.out.println();

                    System.out.println(
                            "Elegible para certificado: "
                            + curso
                                    .elegibleCertificado()
                    );

                    break;
                }


                // ============================
                // 9 - Electronics Products
                // ============================

                case 9: {

                    Lavadora lavadora =
                            new Lavadora(
                                    101,
                                    "Lavadora LG",
                                    12000,
                                    12
                            );

                    lavadora.aplicarDescuento(
                            10
                    );

                    lavadora.extenderGarantia(
                            12
                    );

                    lavadora.mostrarDatos();

                    System.out.println(
                            "Garantia: "
                            + lavadora
                                    .getGarantiaMeses()
                            + " meses"
                    );

                    break;
                }


                // ============================
                // 10 - Building
                // ============================

                case 10: {

                    ResidentialBuilding residencial =
                            new ResidentialBuilding(
                                    "Av. Reforma 100",
                                    5,
                                    2500,
                                    20,
                                    8000
                            );

                    CommercialBuilding comercial =
                            new CommercialBuilding(
                                    "Centro 200",
                                    10,
                                    5000,
                                    30,
                                    12000
                            );

                    System.out.println(
                            "Renta residencial: $"
                            + residencial
                                    .calcularRentaTotal()
                    );

                    System.out.println(
                            "Renta comercial: $"
                            + comercial
                                    .calcularRentaTotal()
                    );

                    break;
                }


                // ============================
                // 11 - Evento
                // ============================

                case 11: {

                    Seminario seminario =
                            new Seminario(
                                    "¿Nos dominara la IA?",
                                    LocalDate.of(
                                            2026,
                                            11,
                                            20
                                    ),
                                    "Auditorio",
                                    5
                            );

                    MusicalPerformance concierto =
                            new MusicalPerformance(
                                    "Concierto Universitario",
                                    LocalDate.of(
                                            2026,
                                            11,
                                            20
                                    ),
                                    "Auditorio"
                            );

                    concierto.agregarArtista(
                            "Grupo A"
                    );

                    concierto.agregarArtista(
                            "Grupo B"
                    );

                    seminario.mostrarDetalles();

                    System.out.println();

                    concierto.mostrarDetalles();

                    System.out.println();

                    System.out.println(
                            "Existe conflicto: "
                            + seminario
                                    .tieneConflicto(
                                            concierto
                                    )
                    );

                    break;
                }


                // ============================
                // 12 - Customer Order
                // ============================

                case 12: {

                    OnlineOrder pedido =
                            new OnlineOrder(
                                    5001,
                                    "Maria Lopez",
                                    LocalDate.now(),
                                    "Puebla Centro",
                                    "MX12345"
                            );

                    pedido.mostrarDatos();

                    System.out.println();

                    System.out.println(
                            "Tiempo de entrega: "
                            + pedido
                                    .calcularTiempoEntrega()
                            + " dias"
                    );

                    pedido.actualizarEstado(
                            "En camino"
                    );

                    System.out.println();

                    pedido.mostrarDatos();

                    break;
                }


                // ============================
                // 13 - Reservation
                // ============================

                case 13: {

                    ResortReservation hotel =
                            new ResortReservation(
                                    100,
                                    "Juan Perez",
                                    LocalDate.of(
                                            2026,
                                            12,
                                            15
                                    ),
                                    305
                            );

                    hotel.obtenDatosHabitacion();
                    System.out.println();
                    
                    RailwayReservation tren =
                            new RailwayReservation(
                                    101,
                                    "Ana Lopez",
                                    LocalDate.of(
                                            2026,
                                            12,
                                            18
                                    ),
                                    "12A"
                            );

                    System.out.println();
                    tren.obtenDatosTren();           
                    
                    System.out.println();
                    System.out.println("Estado reserva hotel:");
                    hotel.verificarEstado();

                    System.out.println("Estado reserva tren:");
                    tren.verificarEstado();

                    hotel.modificarHabitacion(
                            410
                    );

                    tren.modificarAsiento(
                            "15B"
                    );

                    break;
                }


                // ============================
                // 14 - Pet
                // ============================

                case 14: {

                    PerroMascota perro =
                            new PerroMascota(
                                    "Max",
                                    5,
                                    "Pelota"
                            );

                    Pajaro pajaro =
                            new Pajaro(
                                    "Piolin",
                                    3,
                                    25
                            );

                    perro.mostrarDetalles();

                    System.out.println(
                            "Edad humana: "
                            + perro
                                    .calcularEdadHumana()
                    );

                    System.out.println();

                    pajaro.mostrarDetalles();

                    System.out.println(
                            "Edad humana: "
                            + pajaro
                                    .calcularEdadHumana()
                    );

                    break;
                }


                // ============================
                // 15 - Gym Membership
                // ============================

                case 15: {

                    PremiumMembership membresia =
                            new PremiumMembership(
                                    "Alfredo",
                                    12,
                                    true,
                                    true
                            );

                    System.out.println(
                            "Cuota total: $"
                            + membresia
                                    .calcularCuota()
                    );

                    System.out.println(
                            "Oferta especial: "
                            + membresia
                                    .tieneOfertaEspecial()
                    );

                    membresia
                            .mostrarBeneficios();

                    break;
                }


                // ============================
                // Salir
                // ============================

                case 0: {

                    System.out.println(
                            "May the force be with you... Hasta luego."
                    );

                    break;
                }


                default: {

                    System.out.println(
                            "Opcion no valida."
                    );

                    break;
                }
            }

            System.out.println();
            System.out.println(
                    "=========================="
            );

        } while (opcion != 0);

        teclado.close();
    }
}