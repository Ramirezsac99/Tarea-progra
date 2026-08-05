package Herencia;

import java.time.LocalDate;

/*
 * HERENCIA: ProductoPerecedero extiende de Producto, reutilizando
 * nombre y precio.
 *
 * Agrega el atributo fechaVencimiento y el método estaVencido(),
 * que compara la fecha de vencimiento con la fecha actual del sistema.
 *
 * SOBRESCRITURA: se redefine mostrar() con @Override, usando
 * super.mostrar() para no repetir la impresión de nombre y precio,
 * y agregando la información de vencimiento.
 */
public class ProductoPerecedero extends Producto {

    private LocalDate fechaVencimiento;

    public ProductoPerecedero(String nombre, double precio, LocalDate fechaVencimiento) {
        super(nombre, precio);
        this.fechaVencimiento = fechaVencimiento;
    }

    // Retorna true si la fecha de vencimiento ya pasó
    public boolean estaVencido() {
        return fechaVencimiento.isBefore(LocalDate.now());
    }

    @Override
    public void mostrar() {
        super.mostrar();
        System.out.println("Fecha de vencimiento: " + fechaVencimiento +
                " -> " + (estaVencido() ? "VENCIDO" : "Vigente"));
    }
}