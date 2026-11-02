package fcc.vehiculos;

public class Camion extends Vehiculo {
    private double capacidadCarga;
    private int numEjes;

    public Camion(int precioDia, String marcaModelo, int numLlantas,
                  double capacidadCarga, int numEjes) {
        super(precioDia, marcaModelo, numLlantas);
        this.capacidadCarga = capacidadCarga;
        this.numEjes = numEjes;
    }

    public void mostrarDatos() {
        System.out.println("CAMION");
        mostrarCaracteristicas();
        System.out.println("Capacidad de carga: " + capacidadCarga + " kg");
        System.out.println("Numero de ejes: " + numEjes);
    }

    public void pruebaDelMotor() {
        enciendeMotor();
        funciona();
        apagarMotor();
    }
}
