package fcc.asociacion;

public class Taxi {
    private String matricula;
    private Chofer chofer;

    public Taxi() {
        // Constructor sin argumentos, como en el material de clase.
        // Se inicializa un chofer vacio para mantener la asociacion 1 a 1.
        this("", new Chofer());
    }

    public Taxi(String mat, Chofer chfr) {
        if (chfr == null) {
            throw new IllegalArgumentException("El taxi requiere un chofer");
        }
        matricula = mat;
        chofer = chfr;
    }

    public void mostrarChofer() {
        System.out.println("Nombre Chofer: " + chofer.obtenerNombre());
    }

    public void mostrarMatricula() {
        System.out.println("Matricula del Taxi: " + matricula);
    }
}
