package Herencia;

/*
 * Clase base Transporte: representa un medio de transporte genérico.
 * capacidad es protected para que las clases hijas puedan usarla
 * directamente en sus propios métodos.
 */
public class Transporte {

    protected int capacidad;

    public Transporte(int capacidad) {
        this.capacidad = capacidad;
    }

    public String descripcion() {
        return "Transporte con capacidad para " + capacidad + " pasajeros";
    }
}