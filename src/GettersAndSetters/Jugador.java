package GettersAndSetters;

public class Jugador {

    private String nombre;
    private int puntajeActual;
    private int puntajeMaximo;

    public Jugador(String nombre) {
        this.nombre = nombre;
        this.puntajeActual = 0;
        this.puntajeMaximo = 0;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public int getPuntajeActual() {
        return puntajeActual;
    }

    public int getPuntajeMaximo() {
        return puntajeMaximo;
    }

    // Setter
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Actualiza el puntaje actual y, si corresponde, el máximo histórico
    public void actualizarPuntaje(int nuevoPuntaje) {
        if (nuevoPuntaje < 0) {
            System.out.println("Error: el puntaje no puede ser negativo.");
            return;
        }
        puntajeActual = nuevoPuntaje;
        if (puntajeActual > puntajeMaximo) {
            puntajeMaximo = puntajeActual;
            System.out.println("¡Nuevo récord! Puntaje máximo actualizado a: " + puntajeMaximo);
        }
    }

    public void mostrar() {
        System.out.println("Jugador: " + nombre + " | Puntaje actual: " + puntajeActual +
                " | Puntaje máximo: " + puntajeMaximo);
    }
}
