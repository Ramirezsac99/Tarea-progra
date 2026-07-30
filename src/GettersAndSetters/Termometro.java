package GettersAndSetters;

public class Termometro {

    private double celsius;

    public Termometro(double celsius) {
        setCelsius(celsius);
    }

    // Getter
    public double getCelsius() {
        return celsius;
    }

    // Setter con validación de cero absoluto
    public void setCelsius(double temperatura) {
        if (temperatura < -273.15) {
            System.out.println("Error: la temperatura no puede ser menor a -273.15°C (cero absoluto).");
        } else {
            this.celsius = temperatura;
        }
    }

    // Convierte a Fahrenheit
    public double getFahrenheit() {
        return (celsius * 9 / 5) + 32;
    }

    public void mostrar() {
        System.out.printf("Temperatura: %.2f°C -> %.2f°F%n", celsius, getFahrenheit());
    }
}