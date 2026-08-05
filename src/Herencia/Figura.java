package Herencia;

/*
 * Clase base Figura: representa una figura geométrica genérica.
 * No tiene atributos propios, solo define el método calcularArea()
 * con un valor por defecto, que cada clase hija debe sobrescribir
 * con su propia fórmula.
 */
public class Figura {

    public double calcularArea() {
        return 0.0;
    }
}