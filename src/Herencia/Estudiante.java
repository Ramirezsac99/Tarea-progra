package Herencia;

public class Estudiante extends Persona {

    private String carnet;

    public Estudiante(String nombre, int edad, String carnet) {
        super(nombre, edad);
        this.carnet = carnet;
    }

    @Override
    public void mostrar() {
        super.mostrar();
        System.out.println("Carnet: " + carnet);
    }
}