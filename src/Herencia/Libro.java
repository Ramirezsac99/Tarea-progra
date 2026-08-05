package Herencia;

/*
 * Clase base Libro: representa un libro genérico.
 * titulo y autor son protected para que las clases hijas
 * puedan acceder directamente a ellos.
 */
public class Libro {

    protected String titulo;
    protected String autor;

    public Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public String mostrarInfo() {
        return "\"" + titulo + "\" de " + autor;
    }
}