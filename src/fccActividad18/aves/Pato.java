package fcc.aves;

public class Pato extends Ave implements Vuela {

    public Pato() {
        super();
    }

    @Override
    public void hacerSonido() {
        System.out.println("El pato hace cua-cua.");
    }

    @Override
    public void volar() {
        System.out.println("El pato esta volando.");
    }
}
