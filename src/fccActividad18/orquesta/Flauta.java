package fcc.orquesta;

public class Flauta extends Instrumento implements DarMantenimiento {

    public Flauta(String nombre) {
        super(nombre);
        super.tocar();
    }

    @Override
    public void Mantenimiento() {
        System.out.println(
                "Dando mantenimiento al instrumento de viento "
                + super.nombre
        );
    }
}
