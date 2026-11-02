package fcc.vehiculos;

public class Autobus extends Vehiculo {
    private int numAsientos;
    private int numPuertas;
    private int numVentilas;

    public Autobus(int precioDia, String marcaModelo, int numLlantas,
                   int numAsientos, int numPuertas, int numVentilas) {
        super(precioDia, marcaModelo, numLlantas);
        this.numAsientos = numAsientos;
        this.numPuertas = numPuertas;
        this.numVentilas = numVentilas;
    }

    public void mostrarDatos() {
        System.out.println("AUTOBUS");
        mostrarCaracteristicas();
        System.out.println("Numero de asientos: " + numAsientos);
        System.out.println("Numero de puertas: " + numPuertas);
        System.out.println("Numero de ventilas: " + numVentilas);
    }

    public void pruebaDelMotor() {
        enciendeMotor();
        funciona();
        apagarMotor();
    }
}
