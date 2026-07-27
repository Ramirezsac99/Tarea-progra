package Encapsulacion;

public class Libro {

    private String titulo;
    private String autor;
    private int paginas;

    
    public Libro(String titulo, String autor, int paginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }

   
    public boolean esLargo() {
        return paginas > 300;
    }

    public void mostrar() {
        System.out.println("\"" + titulo + "\" de " + autor + " (" + paginas + " paginas) -> " +
                (esLargo() ? "Es un libro Amplio " : "No es un libro amplio"));
    }
}