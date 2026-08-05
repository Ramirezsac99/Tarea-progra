package Herencia;

/*
 * HERENCIA: FacturaCredito extiende de Factura.
 *
 * Agrega los atributos recargo (porcentaje) y cuotas.
 *
 * SOBRESCRITURA: se redefine calcularTotal() con @Override para
 * aplicar el recargo sobre el total base, reutilizando
 * super.calcularTotal().
 */
public class FacturaCredito extends Factura {

    private double recargo; // porcentaje, ej. 5 = 5%
    private int cuotas;

    public FacturaCredito(String numero, Cliente cliente, double total, double recargo, int cuotas) {
        super(numero, cliente, total);
        this.recargo = recargo;
        this.cuotas = cuotas;
    }

    @Override
    public double calcularTotal() {
        double totalConRecargo = super.calcularTotal() * (1 + recargo / 100.0);
        return totalConRecargo;
    }

    public double calcularMontoPorCuota() {
        return calcularTotal() / cuotas;
    }

    @Override
    public void mostrarFactura() {
        super.mostrarFactura();
        System.out.println("Cuotas: " + cuotas + " | Monto por cuota: Q" +
                String.format("%.2f", calcularMontoPorCuota()));
    }
}