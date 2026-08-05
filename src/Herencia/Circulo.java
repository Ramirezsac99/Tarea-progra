package Herencia;

/*
 * HERENCIA: Circulo extiende de Figura.
 *
 * Agrega el atributo radio.
 *
 * SOBRESCRITURA: se redefine calcularArea() con @Override, usando
 * la fórmula pi * radio^2.
 */
public class Circulo extends Figura {

    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }
}