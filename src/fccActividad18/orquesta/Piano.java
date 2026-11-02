package fcc.orquesta;

public class Piano extends Instrumento implements SeAfina {

    public Piano(String nombre1) {
        super(nombre1);
        super.tocar();
    }

    @Override
    public void afinar() {
        System.out.println("Afinando instrumento " + super.nombre);
    }
}
