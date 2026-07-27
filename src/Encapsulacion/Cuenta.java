package Encapsulacion;

public class Cuenta {

    private String titular;
    private double saldo;

    
    public Cuenta(String titular, double saldo) {
        this.titular = titular;
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
            System.out.println("Monto no valido para retirar.");
            return;
        }
        if (monto > saldo) {
            System.out.println("Operación rechazada, no valido para retirar Q" + monto);
            return;
        }
        saldo -= monto;
        System.out.println("Retiro de Q" + monto + " realizado. Saldo actual: Q" + saldo);
    }

    public void mostrarSaldo() {
        System.out.println("Titular: " + titular + "  Saldo final: Q" + saldo);
    }
}