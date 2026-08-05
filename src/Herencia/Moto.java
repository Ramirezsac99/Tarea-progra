package Herencia;

/*
 * HERENCIA: Moto extiende de Vehiculo, reutilizando marca y
 * velocidad.
 *
 * Agrega el atributo cilindrada.
 *
 * SOBRESCRITURA: se redefine mostrarInfo() con @Override,
 * reutilizando super.mostrarInfo() y agregando la cilindrada
 * al final del texto.
 */
public class Moto extends Vehiculo {

    private int cilindrada;

    public Moto(String marca, double velocidad, int cilindrada) {
        super(marca, velocidad);
        this.cilindrada = cilindrada;
    }

    @Override
    public String mostrarInfo() {
        return super.mostrarInfo() + " | Cilindrada: " + cilindrada + "cc";
    }
}