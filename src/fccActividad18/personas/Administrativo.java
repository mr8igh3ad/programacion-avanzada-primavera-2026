package fcc.personas;

public class Administrativo extends Persona {

    public int idEmpleado;
    public String puesto;
    public double salario;

    public Administrativo(String nombre, int edad, String sexo,
                          int idEmpleado, String puesto, double salario) {

        super(nombre, edad, sexo);

        this.idEmpleado = idEmpleado;
        this.puesto = puesto;
        this.salario = salario;
    }

    public void datosAdministrativo() {
        mostrarDatos();
        System.out.println("ID empleado: " + idEmpleado);
        System.out.println("Puesto: " + puesto);
        System.out.println("Salario: $" + salario);
    }
}
