package fcc.orquesta;

public class Orquesta {

    String Nombre_Orquesta;

    public Orquesta(String NombreOrquesta) {
        Nombre_Orquesta = NombreOrquesta;
    }

    public void Crear_Orquesta() {

        Piano piano = new Piano("Piano de Cola");
        piano.afinar();

        Flauta flauta = new Flauta("Flautin");
        flauta.tocar();

        Violin violin = new Violin("Violin electrico");
        violin.afinar();
        violin.Mantenimiento();

        Tuba tuba = new Tuba("Tuba bajo");
        tuba.Mantenimiento();
        tuba.afinar();
    }

    public void Guardar_Orquesta() {
        System.out.println(
                "Se ha guardado la orquesta "
                + Nombre_Orquesta
        );
    }
}
