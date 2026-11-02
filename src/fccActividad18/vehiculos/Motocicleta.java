package fcc.vehiculos;

public class Motocicleta extends Vehiculo {
    private int numAsientos;

    public Motocicleta(int precioDia, String marcaModelo, int numLlantas,
                       int numAsientos) {
        super(precioDia, marcaModelo, numLlantas);
        this.numAsientos = numAsientos;
    }

    public void mostrarDatos() {
        System.out.println("MOTOCICLETA");
        mostrarCaracteristicas();
        System.out.println("Numero de asientos: " + numAsientos);
    }

    public void pruebaDelMotor() {
        enciendeMotor();
        funciona();
        apagarMotor();
    }
}
