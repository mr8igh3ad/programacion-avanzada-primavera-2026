package fcc.gallinero;

import fcc.gallinero.Gallina;

public class Gallinero {
    //Variables de instancia
    Gallina gallina1,gallina2,gallina3,gallina4;
    private String color;
    private double largo;
    private double ancho;
    
    //Método constructor
    public Gallinero() {
        
    }
    
    //Metódo definido por el programador
    public void Gallinero1() {
        color = "Azul";
        largo = 5;
        ancho = 2.5;
        gallina1 = new Gallina(1,"Azul",893,50.09,2,"Mini","Negro","Cafes",2,"Cafe",2,"Sencilla","Pequeña");
        gallina2 = new Gallina(2,"Cafe",985,58.39,2,"Gigante","Amarillo","Negras",2,"Rojo",2,"Forma V","Mediana");
        gallina3 = new Gallina(3,"Cafe con rojo",600,68.44,2,"Mediano","Blanco","Blancas",2,"Azul",2,"Doble Cerrada","Grande");
        gallina4 = new Gallina(4,"Amarillo",560,38.99,2,"Regular","Cafe","Amarillas",2,"Amarillo",1,"De nuez","Enorme");
    }
    
    //Metódo definido por el programador
    public void mostrarGallinero() {
        System.out.println(" ");
        System.out.println("GALLINERO:");
        System.out.println("  Color: "+color);
        System.out.println("  Largo: "+largo+" cm");
        System.out.println("  Ancho: "+ancho+" cm");
        System.out.println("\n-----------------------");
    }
    
    //Metódo definido por el programador
    public void mostrarGallinas() {
        System.out.println(" ");
        gallina1.mostrarInfo();
        System.out.println(" ");
        gallina2.mostrarInfo();
        System.out.println(" ");
        gallina3.mostrarInfo();
        System.out.println(" ");
        gallina4.mostrarInfo();
    }
}