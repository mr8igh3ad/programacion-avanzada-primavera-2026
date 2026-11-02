package fcc.gallinero;

public class Ala {
    //Variables de instancia
    private double tama;
    private int cantidad;
    
    //Método constructor
    public Ala() {
        
    }
    
    //Método constructor
    public Ala(double tama1, int cantidad1) {
        tama = tama1;
        cantidad = cantidad1;
        
    }
    
    //Metódo definido por el programador
    public double mostrarTama() {
        return tama;
    }
    
    //Metódo definido por el programador
    public int mostrarCantidad() {
        return cantidad;
    }
}