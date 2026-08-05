package Herencia;

/*
 * HERENCIA: Perro extiende de Animal, reutilizando el atributo
 * nombre.
 *
 * SOBRESCRITURA: se redefine hacerSonido() con @Override para dar
 * un comportamiento específico (ladrar) en lugar del sonido genérico
 * de la clase padre. Aquí NO se usa super.hacerSonido(), porque no
 * tiene sentido reutilizar el mensaje genérico: el objetivo es
 * reemplazarlo completamente por el sonido específico del perro.
 */
public class Perro extends Animal {

    public Perro(String nombre) {
        super(nombre);
    }

    @Override
    public void hacerSonido() {
        System.out.println(nombre + " dice: ¡Guau, guau!");
    }
}