package fcc.aves;

public class Ganso extends Ave implements Vuela {

    public Ganso() {
        super();
    }

    @Override
    public void hacerSonido() {
        System.out.println("El ganso graznea.");
    }

    @Override
    public void volar() {
        System.out.println("El ganso esta volando.");
    }
}
