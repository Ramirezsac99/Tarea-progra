package GettersAndSetters;

public class CuentaBancaria {

    private String titular;
    private double saldo;
    private int pin;

    public CuentaBancaria(String titular, double saldo, int pin) {
        this.titular = titular;
        this.saldo = saldo;
        this.pin = pin;
    }

    // Getters
    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    

    // Setters
    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public void retirar(double monto, int pinIngresado) {
        if (pinIngresado != this.pin) {
            System.out.println("Retiro rechazado: PIN incorrecto.");
            return;
        }
        if (monto <= 0) {
            System.out.println("Monto inválido para retirar.");
            return;
        }
        if (monto > saldo) {
            System.out.println("Retiro rechazado: saldo insuficiente.");
            return;
        }
        saldo -= monto;
        System.out.println("Retiro de Q" + monto + " realizado. Saldo actual: Q" + saldo);
    }

    public void mostrar() {
        System.out.println("Titular: " + titular + " | Saldo: Q" + saldo);
    }
}