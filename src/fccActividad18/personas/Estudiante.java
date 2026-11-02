package fcc.personas;

public class Estudiante extends Persona {

    public int matricula;
    public double promedio;
    public String licenciatura;

    public Estudiante(String nombre, int edad, String sexo,
                      int matricula, double promedio, String licenciatura) {

        super(nombre, edad, sexo);

        this.matricula = matricula;
        this.promedio = promedio;
        this.licenciatura = licenciatura;
    }

    public void datosDeAlumno() {
        mostrarDatos();
        System.out.println("Matricula: " + matricula);
        System.out.println("Promedio: " + promedio);
        System.out.println("Licenciatura: " + licenciatura);
    }
}
