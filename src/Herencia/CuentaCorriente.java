package Herencia;

/*
 * HERENCIA: CuentaCorriente extiende de Cuenta, reutilizando
 * depositar(), saldo y mostrarSaldo().
 *
 * SOBRESCRITURA: se redefine retirar() con @Override para permitir
 * sobregiro hasta un límite definido (limiteSobregiro). A diferencia
 * de la cuenta normal, aquí el saldo SÍ puede quedar negativo,
 * pero nunca más negativo que el límite permitido.
 */
public class CuentaCorriente extends Cuenta {

    private double limiteSobregiro;

    public CuentaCorriente(double saldo, double limiteSobregiro) {
        super(saldo);
        this.limiteSobregiro = limiteSobregiro;
    }

    @Override
    public void retirar(double monto) {
        if (monto <= 0) {
            System.out.println("Monto inválido para retirar.");
            return;
        }
        // Se permite que el saldo quede negativo, pero no más allá del límite de sobregiro
        if (saldo - monto >= -limiteSobregiro) {
            saldo -= monto;
            System.out.println("Retiro de Q" + monto + " realizado. Saldo actual: Q" + saldo);
        } else {
            System.out.println("Retiro rechazado: excede el límite de sobregiro permitido (Q"
                    + limiteSobregiro + ").");
        }
    }
}