package GettersAndSetters;

public class Factura {

    private String codigoFactura;
    private String descripcion;
    private int cantidad;
    private double precioUnitario;

    public Factura(String codigoFactura, String descripcion, int cantidad, double precioUnitario) {
        this.codigoFactura = codigoFactura;
        this.descripcion = descripcion;
        setCantidad(cantidad);
        setPrecioUnitario(precioUnitario);
    }

    // Getters
    public String getCodigoFactura() {
        return codigoFactura;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getCantidad() {
        return cantidad;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    // Setters
    public void setCodigoFactura(String codigoFactura) {
        this.codigoFactura = codigoFactura;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setCantidad(int cantidad) {
        if (cantidad <= 0) {
            System.out.println("Error: la cantidad debe ser mayor a 0.");
        } else {
            this.cantidad = cantidad;
        }
    }

    public void setPrecioUnitario(double precioUnitario) {
        if (precioUnitario <= 0) {
            System.out.println("Error: el precio unitario debe ser mayor a 0.");
        } else {
            this.precioUnitario = precioUnitario;
        }
    }

    // Calcula el total de la factura
    public double calcularTotal() {
        return cantidad * precioUnitario;
    }

    public void mostrarFactura() {
        System.out.printf("Factura [%s] %s | Cantidad: %d | Precio unitario: Q%.2f | Total: Q%.2f%n",
                codigoFactura, descripcion, cantidad, precioUnitario, calcularTotal());
    }
}