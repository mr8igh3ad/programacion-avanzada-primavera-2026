package fcc;

public class Empleado {

    private String nombre;
    private String cargo;
    private double salario;

    public Empleado(
            String nombre,
            String cargo,
            double salario) {

        this.nombre = nombre;
        this.cargo = cargo;
        this.salario = salario;
    }

    public double calcularSalarioAnual() {
        return salario * 12;
    }

    public void actualizarSalario(double nuevoSalario) {
        salario = nuevoSalario;
    }

    public void mostrarDatos() {

        System.out.println("Nombre: " + nombre);
        System.out.println("Cargo: " + cargo);
        System.out.println("Salario: $" + salario);
    }
}