package fcc.aves;

public class Ave {

    protected boolean plumas;
    protected boolean alas;
    protected boolean pico;

    public Ave() {
        this.plumas = true;
        this.alas = true;
        this.pico = true;
    }

    public void mostrarCaracteristicas() {
        System.out.println("Tiene plumas: " + plumas);
        System.out.println("Tiene alas: " + alas);
        System.out.println("Tiene pico: " + pico);
    }

    public void hacerSonido() {
        System.out.println("El ave realiza un sonido.");
    }
}
