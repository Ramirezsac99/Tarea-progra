package Herencia;

/*
 * HERENCIA: LibroDigital extiende de Libro, reutilizando titulo
 * y autor.
 *
 * Agrega el atributo tamanoMB.
 *
 * SOBRESCRITURA: se redefine mostrarInfo() con @Override,
 * reutilizando super.mostrarInfo() y agregando el tamaño en MB.
 */
public class LibroDigital extends Libro {

    private double tamanoMB;

    public LibroDigital(String titulo, String autor, double tamanoMB) {
        super(titulo, autor);
        this.tamanoMB = tamanoMB;
    }

    @Override
    public String mostrarInfo() {
        return super.mostrarInfo() + " | Tamaño: " + tamanoMB + " MB";
    }
}