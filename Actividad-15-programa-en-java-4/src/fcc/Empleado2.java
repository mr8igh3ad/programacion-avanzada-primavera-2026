package fcc;

import java.time.LocalDate;
import java.time.Period;

public class Empleado2 {

    private String nombre;
    private double salario;
    private LocalDate fechaContratacion;

    public Empleado2(
            String nombre,
            double salario,
            LocalDate fechaContratacion) {

        this.nombre = nombre;
        this.salario = salario;
        this.fechaContratacion =
                fechaContratacion;
    }

    public int calcularAniosServicio() {

        return Period.between(
                fechaContratacion,
                LocalDate.now()
        ).getYears();
    }

    public void mostrarDatos() {

        System.out.println("Nombre: " + nombre);
        System.out.println("Salario: $" + salario);
        System.out.println(
                "Fecha contratacion: "
                + fechaContratacion
        );

        System.out.println(
                "Años de servicio: "
                + calcularAniosServicio()
        );
    }
}
