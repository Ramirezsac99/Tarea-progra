package Herencia;

/*
 * Clase base Factura: representa una factura genérica.
 * numero, cliente y total son protected para que las clases hijas
 * (FacturaContado, FacturaCredito) puedan acceder a ellos.
 *
 * Se aplica encapsulamiento en total: no se asigna directamente,
 * sino a través del setter setTotal(), que valida que nunca sea
 * negativo.
 */
public class Factura {

    protected String numero;
    protected Cliente cliente;
    protected double total;

    public Factura(String numero, Cliente cliente, double total) {
        this.numero = numero;
        this.cliente = cliente;
        setTotal(total);
    }

    // Setter con validación: el total nunca puede ser negativo
    protected void setTotal(double total) {
        if (total < 0) {
            System.out.println("Error: el total no puede ser negativo. Se asigna 0.");
            this.total = 0;
        } else {
            this.total = total;
        }
    }

    public double calcularTotal() {
        return total;
    }

    public void mostrarFactura() {
        System.out.println("Factura #" + numero + " | Cliente: " + cliente.getNombre() +
                " (NIT: " + cliente.getNit() + ") | Total: Q" + calcularTotal());
    }
}