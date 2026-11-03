package fcc.nomina;

public final class Validaciones {

    private Validaciones() { }

    public static void noNegativo(double valor, String descripcion) {
        if (!Double.isFinite(valor) || valor < 0) {
            throw new IllegalArgumentException(
                    descripcion + " debe ser un numero valido, mayor o igual a cero.");
        }
    }

    public static void enRango(double valor, double minimo,
                               double maximo, String descripcion) {
        if (!Double.isFinite(valor) || valor < minimo || valor > maximo) {
            throw new IllegalArgumentException(
                    descripcion + " debe estar entre " + minimo + " y " + maximo + ".");
        }
    }
}
