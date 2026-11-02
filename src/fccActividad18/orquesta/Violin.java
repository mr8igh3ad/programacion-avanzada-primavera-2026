package fcc.orquesta;

public class Violin extends Instrumento implements SeAfina, DarMantenimiento {

    public Violin(String nombre1) {
        super(nombre1);
        super.tocar();
    }

    @Override
    public void afinar() {
        System.out.println(
                "Afinando instrumento de cuerda "
                + super.nombre
        );
    }

    @Override
    public void Mantenimiento() {
        System.out.println(
                "Dando mantenimiento al instrumento de cuerda "
                + super.nombre
        );
    }
}
