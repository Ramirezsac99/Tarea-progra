package Herencia;

/*
 * HERENCIA: Rectangulo extiende de Figura.
 *
 * Agrega los atributos base y altura.
 *
 * SOBRESCRITURA: se redefine calcularArea() con @Override,
 * reemplazando por completo el valor por defecto (0.0) de la clase
 * padre con la fórmula real: base * altura. No se usa super aquí,
 * porque el valor del padre (0.0) no sirve de nada para el cálculo.
 */
public class Rectangulo extends Figura {

    private double base;
    private double altura;

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return base * altura;
    }
}