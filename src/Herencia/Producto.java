package Herencia;

/*
 * Clase base Producto: representa un producto genérico.
 * Atributos protected para que las clases hijas puedan acceder
 * directamente sin necesidad de getters.
 */
public class Producto {

    protected String nombre;
    protected double precio;

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public void mostrar() {
        System.out.println("Producto: " + nombre + " | Precio: Q" + precio);
    }
}