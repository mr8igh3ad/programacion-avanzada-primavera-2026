package fcc.gallinero;

public class Pluma {
    //Variables de instancia
    private String color;
    private int cantidad;
    
    //Método constructor
    public Pluma() {
        
    }
    
    //Método constructor
    public Pluma(String color1, int cantidad1) {
        color = color1;
        cantidad = cantidad1;
    }
    
    //Metódo definido por el programador
    public String mostrarColor() {
        return color;
    }
    
    //Metódo definido por el programador
    public int mostrarCantidad() {
        return cantidad;
    }
}