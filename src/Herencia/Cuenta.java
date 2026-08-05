package Herencia;

/*
 * Clase base Cuenta: representa una cuenta bancaria simple.
 * El atributo saldo es protected para que las clases hijas
 * (como CuentaCorriente) puedan acceder a él directamente.
 */
public class Cuenta {

    protected double saldo;

    public Cuenta(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(double monto) {
        if (monto <= 0) {
            System.out.println("Monto inválido para depositar.");
            return;
        }
        saldo += monto;
        System.out.println("Depósito de Q" + monto + " realizado. Saldo actual: Q" + saldo);
    }

    public void retirar(double monto) {
        if (monto <= 0) {
            System.out.println("Monto inválido para retirar.");
            return;
        }
        if (monto > saldo) {
            System.out.println("Saldo insuficiente.");
            return;
        }
        saldo -= monto;
        System.out.println("Retiro de Q" + monto + " realizado. Saldo actual: Q" + saldo);
    }

    public void mostrarSaldo() {
        System.out.println("Saldo actual: Q" + saldo);
    }
}