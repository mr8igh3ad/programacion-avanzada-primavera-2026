package fcc.gallinero;

public class Ojo {
    //Variables de instancia
    private String color;
    private int cantidad;
    
    //Método constructor
    public Ojo() {
        
    }
    
    //Método constructor
    public Ojo(String color1, int cantidad1) {
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