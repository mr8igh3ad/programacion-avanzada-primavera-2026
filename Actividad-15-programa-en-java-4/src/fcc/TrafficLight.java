package fcc;

public class TrafficLight {

    private String color;
    private int duracion;

    public TrafficLight(
            String color,
            int duracion) {

        this.color = color;
        this.duracion = duracion;
    }

    public void cambiarColor(String nuevoColor) {
        color = nuevoColor;
    }

    public boolean esRojo() {
        return color.equalsIgnoreCase("rojo");
    }

    public boolean esVerde() {
        return color.equalsIgnoreCase("verde");
    }

    public void mostrarDatos() {

        System.out.println("Color: " + color);
        System.out.println(
                "Duracion: " + duracion + " segundos"
        );
    }
}