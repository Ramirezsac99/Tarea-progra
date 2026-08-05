package Herencia;

/*
 * HERENCIA: FacturaContado extiende de Factura.
 *
 * Agrega el atributo descuento (porcentaje).
 *
 * SOBRESCRITURA: se redefine calcularTotal() con @Override para
 * aplicar el descuento sobre el total base. Se usa super.calcularTotal()
 * para obtener el total original antes de aplicar el descuento.
 */
public class FacturaContado extends Factura {

    private double descuento; // porcentaje, ej. 10 = 10%

    public FacturaContado(String numero, Cliente cliente, double total, double descuento) {
        super(numero, cliente, total);
        this.descuento = descuento;
    }

    @Override
    public double calcularTotal() {
        double totalConDescuento = super.calcularTotal() * (1 - descuento / 100.0);
        return totalConDescuento;
    }
}