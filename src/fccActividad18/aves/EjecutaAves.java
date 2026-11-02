package fcc.aves;

public class EjecutaAves {

    public static void main(String[] args) {

        Ganso ganso = new Ganso();
        Pato pato = new Pato();
        Gallina gallina = new Gallina();

        System.out.println("=== GANSO ===");
        ganso.mostrarCaracteristicas();
        ganso.hacerSonido();
        ganso.volar();

        System.out.println();

        System.out.println("=== PATO ===");
        pato.mostrarCaracteristicas();
        pato.hacerSonido();
        pato.volar();

        System.out.println();

        System.out.println("=== GALLINA ===");
        gallina.mostrarCaracteristicas();
        gallina.hacerSonido();
        gallina.volar();
    }
}
