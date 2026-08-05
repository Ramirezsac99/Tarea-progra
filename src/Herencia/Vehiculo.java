package Herencia;

/*
 * Clase base Vehiculo: representa un vehículo genérico.
 * marca y velocidad son protected para que las clases hijas
 * puedan acceder directamente a ellos.
 */
public class Vehiculo {

    protected String marca;
    protected double velocidad;

    public Vehiculo(String marca, double velocidad) {
        this.marca = marca;
        this.velocidad = velocidad;
    }

    public String mostrarInfo() {
        return "Marca: " + marca + " | Velocidad máxima: " + velocidad + " km/h";
    }
}