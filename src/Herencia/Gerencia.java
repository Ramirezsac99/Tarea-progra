package Herencia;

/*
 * HERENCIA: Gerente extiende de Empleado, reutilizando nombre y
 * salario base.
 *
 * Agrega el atributo bonoAdicional.
 *
 * SOBRESCRITURA: se redefine calcularSalario() con @Override,
 * reutilizando super.calcularSalario() (el salario base) y sumándole
 * el bono adicional. Como mostrar() en la clase padre ya llama a
 * calcularSalario() internamente, no fue necesario sobrescribir
 * también mostrar() -> el polimorfismo se encarga de que se use
 * la versión correcta automáticamente.
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