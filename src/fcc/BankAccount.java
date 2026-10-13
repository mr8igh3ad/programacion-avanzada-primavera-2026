package fcc;

public class BankAccount {

    protected int numeroCuenta;
    protected String titular;
    protected double saldo;

    public BankAccount(
            int numeroCuenta,
            String titular,
            double saldo) {

        this.numeroCuenta = numeroCuenta;
        this.titular = titular;
        this.saldo = saldo;
    }

    public void depositar(double cantidad) {

        if (cantidad > 0) {
            saldo += cantidad;
            System.out.println("Depositaste--> " + cantidad);
        }
    }

    public void retirar(double cantidad) {

        if (cantidad > 0 && cantidad <= saldo) {

            saldo -= cantidad;
            System.out.println("Retiraste--> " + cantidad);

        } else {

            System.out.println(
                    "Saldo insuficiente."
            );
        }
    }

    public double verificarSaldo() {
        return saldo;
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


class SavingsAccount extends BankAccount {

    private double tasaInteres;

    public SavingsAccount(
            int numeroCuenta,
            String titular,
            double saldo,
            double tasaInteres) {

        super(
                numeroCuenta,
                titular,
                saldo
        );

        this.tasaInteres = tasaInteres;
    }

    public void aplicarInteres() {

        double interes =
                saldo * tasaInteres / 100;

        System.out.println("Intereses generados--> " + interes);
        saldo += interes;
    }
}