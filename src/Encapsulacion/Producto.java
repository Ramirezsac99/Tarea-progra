package Encapsulacion;

public class Producto {

    private String codigo;
    private String nombre;
    private double precio;

    
    public Producto(String codigo, String nombre, double precio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
    }

   
    public void aplicarDescuento(double porcentaje) {
        double descuento = precio * (porcentaje / 100.0);
        precio = precio - descuento;
    }

    public void mostrar() {
        System.out.println("Producto [" + codigo + "] " + nombre + "  -* Precio: Q" + precio);
    }
}