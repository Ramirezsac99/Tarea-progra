package GettersAndSetters;

public class Persona {

    private String nombre;
    private String apellido;
    private int edad;

    public Persona(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        setEdad(edad); // usamos el setter para validar desde el constructor también
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }

    // Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setEdad(int edad) {
        if (edad < 0) {
            System.out.println("Error: la edad no puede ser negativa. Se asignará 0.");
            this.edad = 0;
        } else {
            this.edad = edad;
        }
    }

    public void mostrar() {
        System.out.println("Nombre: " + nombre + " " + apellido + " | Edad: " + edad + " años");
    }
}