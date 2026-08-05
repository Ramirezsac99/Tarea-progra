package Herencia;

/*
 * Clase base Animal: representa un animal genérico.
 * nombre es protected para que las clases hijas puedan usarlo.
 */
public class Animal {

    protected String nombre;

    public Animal(String nombre) {
        this.nombre = nombre;
    }

    public void hacerSonido() {
        System.out.println(nombre + " hace un sonido genérico de animal.");
    }
}