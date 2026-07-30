package GettersAndSetters;

public class Reloj {

    private int hora;
    private int minuto;
    private int segundo;

    public Reloj(int hora, int minuto, int segundo) {
        setHora(hora);
        setMinuto(minuto);
        setSegundo(segundo);
    }

    // Getters
    public int getHora() {
        return hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public int getSegundo() {
        return segundo;
    }

    // Setters con validación de rango
    public void setHora(int hora) {
        if (hora < 0 || hora > 23) {
            System.out.println("Error: la hora debe estar entre 0 y 23.");
        } else {
            this.hora = hora;
        }
    }

    public void setMinuto(int minuto) {
        if (minuto < 0 || minuto > 59) {
            System.out.println("Error: el minuto debe estar entre 0 y 59.");
        } else {
            this.minuto = minuto;
        }
    }

    public void setSegundo(int segundo) {
        if (segundo < 0 || segundo > 59) {
            System.out.println("Error: el segundo debe estar entre 0 y 59.");
        } else {
            this.segundo = segundo;
        }
    }

    // Retorna la hora en formato HH:MM:SS
    public String mostrarHora() {
        return String.format("%02d:%02d:%02d", hora, minuto, segundo);
    }
}