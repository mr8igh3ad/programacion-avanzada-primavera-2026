package fcc.vehiculos;

public class Vehiculo {
    protected int precioDia;
    protected String marcaModelo;
    protected int numLlantas;

    public Vehiculo(int precioDia, String marcaModelo, int numLlantas) {
        this.precioDia = precioDia;
        this.marcaModelo = marcaModelo;
        this.numLlantas = numLlantas;
    }

    public void mostrarCaracteristicas() {
        System.out.println("Marca / modelo: " + marcaModelo);
        System.out.println("Precio por dia: $" + precioDia);
        System.out.println("Numero de llantas: " + numLlantas);
    }

    public void enciendeMotor() { System.out.println("Motor encendido."); }
    public void apagarMotor() { System.out.println("Motor apagado."); }
    public void funciona() { System.out.println("El vehiculo funciona correctamente."); }
}
