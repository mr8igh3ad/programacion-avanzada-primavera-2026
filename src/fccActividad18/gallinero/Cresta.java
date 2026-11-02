package fcc.gallinero;

public class Cresta {
    //Variables de instancia
    private String tipo;
    private String tam;
    
    //Método constructor
    public Cresta() {
        
    }
    
    //Método constructor
    public Cresta(String tipo1, String tam1) {
        tipo = tipo1;
        tam = tam1;
    }
    
    //Metódo definido por el programador
    public String mostrarTip() {
        return tipo;
    }
    
    //Metódo definido por el programador
    public String mostrarTam() {
        return tam;
    }
}