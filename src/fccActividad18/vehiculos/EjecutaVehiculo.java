package fcc.vehiculos;

public class EjecutaVehiculo {
    public static void main(String[] args) {
        Automovil automovil = new Automovil(1200, "Toyota Corolla", 4, 5, 4);
        Motocicleta motocicleta = new Motocicleta(500, "Honda CB500", 2, 2);
        Autobus autobus = new Autobus(3500, "Mercedes-Benz Tourismo", 6, 45, 2, 8);
        Camion camion = new Camion(4200, "Volvo FH", 10, 18000, 3);

        automovil.mostrarDatos();
        automovil.pruebaDelMotor();
        System.out.println();

        motocicleta.mostrarDatos();
        motocicleta.pruebaDelMotor();
        System.out.println();

        autobus.mostrarDatos();
        autobus.pruebaDelMotor();
        System.out.println();

        camion.mostrarDatos();
        camion.pruebaDelMotor();
    }
}
