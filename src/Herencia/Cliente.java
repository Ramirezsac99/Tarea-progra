package Herencia;

/*
 * Clase Cliente: no participa en la herencia de facturas,
 * pero se usa como atributo dentro de Factura (composición).
 * Atributos privados con encapsulamiento clásico.
 */
public class Cliente {

    private String nombre;
    private String nit;

    public Cliente(String nombre, String nit) {
        this.nombre = nombre;
        this.nit = nit;
    }

    public String getNombre() {
        return nombre;
    }

    public String getNit() {
        return nit;
    }
}