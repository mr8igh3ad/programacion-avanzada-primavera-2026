package fcc;

public class Curso {

    protected String nombreCurso;
    protected String instructor;
    protected int creditos;

    public Curso(
            String nombreCurso,
            String instructor,
            int creditos) {

        this.nombreCurso = nombreCurso;
        this.instructor = instructor;
        this.creditos = creditos;
    }

    public void mostrarDetalles() {

        System.out.println(
                "Curso: " + nombreCurso
        );

        System.out.println(
                "Instructor: " + instructor
        );

        System.out.println(
                "Creditos: " + creditos
        );
    }
}


class OnlineCourse extends Curso {

    private String plataforma;
    private int duracionHoras;

    public OnlineCourse(
            String nombreCurso,
            String instructor,
            int creditos,
            String plataforma,
            int duracionHoras) {

        super(
                nombreCurso,
                instructor,
                creditos
        );

        this.plataforma = plataforma;
        this.duracionHoras = duracionHoras;
    }

    public boolean elegibleCertificado() {

        return duracionHoras >= 20;
    }

    @Override
    public void mostrarDetalles() {

        super.mostrarDetalles();

        System.out.println(
                "Plataforma: "
                + plataforma
        );

        System.out.println(
                "Duracion: "
                + duracionHoras
                + " horas"
        );
    }
}
