package GettersAndSetters;

public class Estudiante {

    private String carnet;
    private String nombre;
    private double promedio;

    public Estudiante(String carnet, String nombre, double promedio) {
        this.carnet = carnet;
        this.nombre = nombre;
        setPromedio(promedio);
    }

    // Getters
    public String getCarnet() {
        return carnet;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPromedio() {
        return promedio;
    }

    // Setters
    public void setCarnet(String carnet) {
        this.carnet = carnet;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPromedio(double promedio) {
        if (promedio < 0 || promedio > 100) {
            System.out.println("Error: el promedio debe estar entre 0 y 100.");
        } else {
            this.promedio = promedio;
        }
    }

    // Retorna true si el promedio es mayor o igual a 85
    public boolean esBecado() {
        return promedio >= 85;
    }

    public void mostrar() {
        System.out.println("Carnet: " + carnet + " | " + nombre + " | Promedio: " + promedio +
                " -> " + (esBecado() ? "Becado" : "No becado"));
    }
}