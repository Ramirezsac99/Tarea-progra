package Herencia;

/*
 * Clase base Empleado: representa un empleado genérico.
 * nombre y salario son protected para que las clases hijas
 * puedan acceder directamente a ellos.
 */
public class Empleado {

    protected String nombre;
    protected double salario;

    public Empleado(String nombre, double salario) {
        this.nombre = nombre;
        this.salario = salario;
    }

    public double calcularSalario() {
        return salario;
    }

    public void mostrar() {
        System.out.println("Empleado: " + nombre + " | Salario: Q" + calcularSalario());
    }
}