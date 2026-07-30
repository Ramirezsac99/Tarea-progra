package GettersAndSetters;

public class Producto {

    private String codigo;
    private String nombre;
    private double precio;
    private int stock;

    public Producto(String codigo, String nombre, double precio, int stock) {
        this.codigo = codigo;
        this.nombre = nombre;
        setPrecio(precio);
        setStock(stock);
    }

    // Getters
    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getStock() {
        return stock;
    }

    // Setters
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(double precio) {
        if (precio <= 0) {
            System.out.println("Error: el precio debe ser mayor a 0.");
        } else {
            this.precio = precio;
        }
    }

    public void setStock(int stock) {
        if (stock < 0) {
            System.out.println("Error: el stock no puede ser negativo.");
        } else {
            this.stock = stock;
        }
    }

    
    public void vender(int cantidad) {
        if (cantidad <= 0) {
            System.out.println("Cantidad inválida para vender.");
            return;
        }
        if (cantidad > stock) {
            System.out.println("Venta rechazada: no hay suficiente stock de " + nombre +
                    " (disponible: " + stock + ")");
            return;
        }
        stock -= cantidad;
        System.out.println("Venta realizada: " + cantidad + " unidades de " + nombre +
                ". Stock restante: " + stock);
    }

    public void mostrar() {
        System.out.println("Producto [" + codigo + "] " + nombre +
                " -> Precio: Q" + precio + " | Stock: " + stock);
    }
}