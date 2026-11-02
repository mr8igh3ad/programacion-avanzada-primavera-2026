package fcc.asociacion;

public class EjecutaAsociacion {

    public static void main(String[] args) {
        Chofer chofer = new Chofer("Juan Armando Muros");
        Taxi taxiYaris = new Taxi("WLU-94-69", chofer);

        taxiYaris.mostrarMatricula();
        System.out.println("Lo maneja el chofer en curso...");
        taxiYaris.mostrarChofer();
    }
}
