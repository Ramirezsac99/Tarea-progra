package Encapsulacion;

public class Main {

	public static void main(String[] args) {
		
		//Persona
		
		Persona pers1 = new Persona("Javier","Ramirez", 22);
		Persona pers2=  new Persona("Nancy", "Ramirez", 25);
		Persona pers3= new Persona ("Yeymi",  "Leal", 21);
		// TODO Auto-generated method stub
		
		
		pers1.mostrar();
		pers2.mostrar();
		pers3.mostrar();
		
		//rectangulo
		Rectangulo r1 = new Rectangulo(5, 10);
		Rectangulo r2 = new Rectangulo(8, 4);

		r1.mostrar();
		r2.mostrar();

		if (r1.area() > r2.area()) {
		    System.out.println("El rectángulo 1 tiene mayor área.");
		} else if (r2.area() > r1.area()) {
		    System.out.println("El rectángulo 2 tiene mayor área.");
		} else {
		    System.out.println("Ambos rectángulos tienen la misma área.");
		}
		
		//Productos
		
		Producto p1 = new Producto("PT1", "HDMI", 35.0);
		Producto p2 = new Producto("PT2", "CAMARA", 425.0);

		System.out.println("Antes del descuento:");
		p1.mostrar();
		p2.mostrar();

		p1.aplicarDescuento(10); 
		p2.aplicarDescuento(20);  // descuentos

		System.out.println("Despues del descuento:");
		p1.mostrar();
		p2.mostrar();
		
		// cuenta
		Cuenta cuenta = new Cuenta("Javier Ramirez", 1000.0);

		cuenta.depositar(7000.0);
		cuenta.retirar(300.0);
		cuenta.retirar(9000.0); // rechazar saldo insuficiente
		cuenta.depositar(-70.0); // Debe rechazar monto inválido
		cuenta.mostrarSaldo();
		
		//libro
		Libro libro1 = new Libro("Como programar en 3 años", "Hernesto garcia Bacher", 471);
		Libro libro2 = new Libro("Como ser un estoico", "Anymous", 96);
		Libro libro3 = new Libro("El violin del diablo", "Deyanira Hesterk", 863);

		libro1.mostrar();
		libro2.mostrar();
		libro3.mostrar();
		
		
		//calculadora
		Calculadora calc = new Calculadora();
		double numA = 10;
		double numB = 0;

		System.out.println("Suma: " + numA + " + " + numB + " = " + calc.sumar(numA, numB));
		System.out.println("Resta: " + numA + " - " + numB + " = " + calc.restar(numA, numB));
		System.out.println("Multiplicación: " + numA + " * " + numB + " = " + calc.multiplicar(numA, numB));
		System.out.println("División: " + numA + " / " + numB + " = " + calc.dividir(numA, numB));

	
		double numC = 5;
		System.out.println("División válida: " + numA + " / " + numC + " = " + calc.dividir(numA, numC));
		
		
		//fecha
		Fecha fecha1 = new Fecha(4, 9, 2026);
		Fecha fecha2 = new Fecha(61, 7, 2024);
		Fecha fecha3 = new Fecha(10, 13, 2023);

		fecha1.mostrar();
		fecha2.mostrar();
		fecha3.mostrar();
	}

}
