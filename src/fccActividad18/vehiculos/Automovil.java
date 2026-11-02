package fcc.vehiculos;

public class Automovil extends Vehiculo {
    private int numAsientos;
    private int numPuertas;

    public Automovil(int precioDia, String marcaModelo, int numLlantas,
                     int numAsientos, int numPuertas) {
        super(precioDia, marcaModelo, numLlantas);
        this.numAsientos = numAsientos;
        this.numPuertas = numPuertas;
    }

    public void mostrarDatos() {
        System.out.println("AUTOMOVIL");
        mostrarCaracteristicas();
        System.out.println("Numero de asientos: " + numAsientos);
        System.out.println("Numero de puertas: " + numPuertas);
    }

    public void pruebaDelMotor() {
        enciendeMotor();
        funciona();
        apagarMotor();
    }
}
