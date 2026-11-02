package fcc.gallinero;

public class Gallina {
    //Variables de instancia
    Pluma plumas;
    Ala alas;
    Pico pico;
    Pata patas;
    Ojo ojos;
    Cresta cresta;
    private int contador;
    
    //Método constructor
    public Gallina(int numGal, String colPlum, int cantPlum, double tamAl, int cantAl, String largPic, String colPic, String colPat, int cantPat, String colOjo, int cantOjo,String tipCresta, String tamCresta) {
        contador = numGal;
        plumas = new Pluma(colPlum,cantPlum);
        alas = new Ala(tamAl,cantAl);
        pico = new Pico(largPic,colPic);
        patas = new Pata(colPat,cantPat);
        ojos = new Ojo(colOjo,cantOjo);
        cresta= new Cresta(tipCresta,tamCresta);
    }
    
    //Metódo definido por el programador
    public void mostrarInfo() {
        System.out.println("GALLINA "+contador+":");
        System.out.println("  Plumas:");
        System.out.println("    Color: "+plumas.mostrarColor());
        System.out.println("    Cantidad: "+plumas.mostrarCantidad());
        System.out.println("  Alas:");
        System.out.println("    Tamaño: "+alas.mostrarTama());
        System.out.println("    Cantidad: "+alas.mostrarCantidad());
        System.out.println("  Pico:");
        System.out.println("    Largo: "+pico.mostrarLargo());
        System.out.println("    Color: "+pico.mostrarColor());
        System.out.println("  Patas:");
        System.out.println("    Color: "+patas.mostrarColor());
        System.out.println("    Cantidad: "+patas.mostrarCantidad());
        System.out.println("  Ojos:");
        System.out.println("    Color: "+ojos.mostrarColor());
        System.out.println("    Cantidad: "+ojos.mostrarCantidad());
        System.out.println("  Cresta:");
        System.out.println("    Tipo: "+cresta.mostrarTip());
        System.out.println("    Tamaño: "+cresta.mostrarTam());
        
        System.out.println("\n***********************************");
    }
}