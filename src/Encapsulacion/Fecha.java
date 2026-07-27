package Encapsulacion;

public class Fecha {

    private int dia;
    private int mes;
    private int anio;

    
    public Fecha(int dia, int mes, int anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }

   
    public boolean esValida() {
        return (dia >= 1 && dia <= 31) && (mes >= 1 && mes <= 12);
    }

    public void mostrar() {
        System.out.println("Fecha: " + dia + "/" + mes + "/" + anio + " -* " +
                (esValida() ? "Valida" : "No valida"));
    }
}