package fcc;

import java.util.ArrayList;

class Cuenta {

    private int numeroCuenta;
    private String titular;
    private double saldo;

    public Cuenta(
            int numeroCuenta,
            String titular,
            double saldo) {

        this.numeroCuenta = numeroCuenta;
        this.titular = titular;
        this.saldo = saldo;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void depositar(double cantidad) {
        saldo += cantidad;
    }

    public boolean retirar(double cantidad) {

        if (cantidad <= saldo) {
            saldo -= cantidad;
            return true;
        }

        return false;
    }

    public void mostrarDatos() {

        System.out.println(
                "Cuenta: " + numeroCuenta
        );

        System.out.println(
                "Titular: " + titular
        );

        System.out.println(
                "Saldo: $" + saldo
        );
    }
}


public class Banco {

    private ArrayList<Cuenta> cuentas =
            new ArrayList<>();

    public void agregarCuenta(Cuenta cuenta) {
        cuentas.add(cuenta);
    }

    public void eliminarCuenta(int numero) {

        cuentas.removeIf(
                cuenta ->
                cuenta.getNumeroCuenta() == numero
        );
    }

    public Cuenta buscarCuenta(int numero) {

        for (Cuenta cuenta : cuentas) {

            if (cuenta.getNumeroCuenta() == numero) {
                return cuenta;
            }
        }

        return null;
    }

    public void depositar(
            int numeroCuenta,
            double cantidad) {

        Cuenta cuenta = buscarCuenta(numeroCuenta);

        if (cuenta != null) {
            cuenta.depositar(cantidad);
        }
    }

    public void retirar(
            int numeroCuenta,
            double cantidad) {

        Cuenta cuenta = buscarCuenta(numeroCuenta);

        if (cuenta != null) {
            cuenta.retirar(cantidad);
        }
    }
}