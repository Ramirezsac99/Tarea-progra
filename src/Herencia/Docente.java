package Herencia;

public class Docente extends Persona {

    private String especialidad;

    public Docente(String nombre, int edad, String especialidad) {
        super(nombre, edad); // llama al constructor de Persona
        this.especialidad = especialidad;
    }

    @Override
    public void mostrar() {
        super.mostrar(); // reutiliza la lógica de Persona (imprime nombre y edad)
        System.out.println("Especialidad: " + especialidad);
    }
}