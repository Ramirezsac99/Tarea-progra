package Herencia;

public class Main {
    public static void main(String[] args) {

    	/*
    	 * HERENCIA: Docente extiende de Persona, reutilizando nombre y edad.
    	 * SOBRESCRITURA: se redefine mostrar() usando @Override para agregar
    	 * la especialidad, sin duplicar la lógica de impresión de Persona
    	 * gracias al uso de super.mostrar().
    	 */	
    	
    	
        System.out.println("===== 1. PERSONA, DOCENTE, ESTUDIANTE =====");

        Persona persona1 = new Persona("Carlos Méndez", 40);
        Docente docente1 = new Docente("Ana Gómez", 35, "Programación");
        Estudiante estudiante1 = new Estudiante("Javier Ramírez", 26, "2024-001");

        persona1.mostrar();
        System.out.println("---");
        docente1.mostrar();
        System.out.println("---");
        estudiante1.mostrar();
        
        
        System.out.println("\n===== 2. CUENTA Y CUENTA CORRIENTE =====");

        Cuenta cuenta1 = new Cuenta(500.0);
        cuenta1.retirar(600.0); // rechazado, no permite sobregiro

        CuentaCorriente cc1 = new CuentaCorriente(500.0, 200.0); // saldo 500, sobregiro hasta -200
        cc1.mostrarSaldo();
        cc1.retirar(600.0); // saldo queda en -100, dentro del límite de -200
        cc1.mostrarSaldo();
        cc1.retirar(200.0); // saldo quedaría en -300, excede el límite -> rechazado
        cc1.mostrarSaldo();
    }
}