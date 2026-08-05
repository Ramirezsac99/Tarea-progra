package Herencia;

/*
 * HERENCIA: Gerente extiende de Empleado, reutilizando nombre y
 * salario base.
 *
 * Agrega el atributo bonoAdicional.
 *
 */
public class Gerente extends Empleado {

    private double bonoAdicional;

    public Gerente(String nombre, double salario, double bonoAdicional) {
        super(nombre, salario);
        this.bonoAdicional = bonoAdicional;
    }

    @Override
    public double calcularSalario() {
        return super.calcularSalario() + bonoAdicional;
    }
}