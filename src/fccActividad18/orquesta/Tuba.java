package fcc.orquesta;

public class Tuba extends Instrumento implements DarMantenimiento, SeAfina {

    public Tuba(String nombre1) {
        super(nombre1);
        super.tocar();
    }

    @Override
    public void Mantenimiento() {
        System.out.println(
                "Dando mantenimiento al instrumento de viento "
                + super.nombre
        );
    }

    @Override
    public void afinar() {
        System.out.println(
                "Se afino el instrumento de viento "
                + super.nombre
        );
    }
}
