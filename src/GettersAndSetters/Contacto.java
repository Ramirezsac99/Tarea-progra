package GettersAndSetters;

public class Contacto {

    private String nombre;
    private String telefono;
    private String email;

    public Contacto(String nombre, String telefono, String email) {
        this.nombre = nombre;
        setTelefono(telefono);
        setEmail(email);
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getEmail() {
        return email;
    }

    // Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Valida que el teléfono tenga exactamente 8 dígitos
    public void setTelefono(String telefono) {
        if (telefono == null || telefono.length() != 8 || !telefono.matches("[0-9]+")) {
            System.out.println("Error: el teléfono debe tener exactamente 8 dígitos numéricos.");
        } else {
            this.telefono = telefono;
        }
    }

    // Valida que el email contenga el carácter @
    public void setEmail(String email) {
        if (email == null || !email.contains("@")) {
            System.out.println("Error: el email debe contener el carácter @.");
        } else {
            this.email = email;
        }
    }

    public void mostrarContacto() {
        System.out.println("Nombre: " + nombre + " | Teléfono: " + telefono + " | Email: " + email);
    }
}