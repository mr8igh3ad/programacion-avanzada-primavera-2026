package fcc.gallinero;

public class Pico {
    //Variables de instancia
    private String largo;
    private String color;
    
    //Método constructor
    public Pico() {
        
    }
    
    //Método constructor
    public Pico(String largo1, String color1) {
        largo = largo1;
        color = color1;
    }
    
    //Metódo definido por el programador
    public String mostrarLargo() {
        return largo;
    }
    
    //Metódo definido por el programador
    public String mostrarColor() {
        return color;
    }
}