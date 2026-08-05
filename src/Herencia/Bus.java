package Herencia;

/*
 * HERENCIA: Bus extiende de Transporte, reutilizando el atributo
 * capacidad.
 *
 * Agrega el atributo ruta.
 *
 * SOBRESCRITURA: se redefine descripcion() con @Override. Aquí SÍ
 * se reutiliza la lógica del padre con super.descripcion(), y se le
 * agrega la información de la ruta al final.
 */
public class Bus extends Transporte {

    private String ruta;

    public Bus(int capacidad, String ruta) {
        super(capacidad);
        this.ruta = ruta;
    }

    @Override
    public String descripcion() {
        return super.descripcion() + " | Ruta: " + ruta;
    }
}