package fcc.personas;

public class Docente extends Persona {

    public int idTrabajador;
    public double salario;
    public String departamento;

    public Docente(String nombre, int edad, String sexo,
                   int idTrabajador, double salario, String departamento) {

        super(nombre, edad, sexo);

        this.idTrabajador = idTrabajador;
        this.salario = salario;
        this.departamento = departamento;
    }

    public void datosDocente() {
        mostrarDatos();
        System.out.println("ID trabajador: " + idTrabajador);
        System.out.println("Salario: $" + salario);
        System.out.println("Departamento: " + departamento);
    }
}
