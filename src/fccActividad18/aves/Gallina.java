package fcc.aves;

import fcc.aves.Vuela;
import fcc.aves.Ave;

public class Gallina extends Ave implements Vuela {

    public Gallina() {
        super();
    }

    @Override
    public void hacerSonido() {
        System.out.println("La gallina cocoroquea.");
    }

    @Override
    public void volar() {
        System.out.println("La gallina realiza un vuelo corto.");
    }
}
