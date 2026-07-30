package GettersAndSetters;

public class Main {

	public static void main(String[] args) {
		System.out.println("===== 1. PERSONA ENCAPSULADA =====");

		Persona p1 = new Persona("Javier", "Ramírez", 26);
		Persona p2 = new Persona("Nancy", "Ramírez", -5); 

		p1.mostrar();
		p2.mostrar();

		p1.setEdad(-10); 
		p1.mostrar();

		p1.setEdad(27); 
		p1.mostrar();
		
		System.out.println("\n===== 2. PRODUCTO CON VALIDACIONES =====");

		Producto prod1 = new Producto("PT1", "Teclado", 250.0, 10);
		Producto prod2 = new Producto("PT2", "Mouse", -50.0, 5);
		prod1.mostrar();
		prod2.mostrar();

		prod1.vender(3);   
		prod1.vender(20);  
		prod1.mostrar();

		prod2.setStock(-1); 
		prod2.setPrecio(80.0); 
		prod2.mostrar();
		
		System.out.println("\n===== 3. CUENTA CON PIN =====");

		CuentaBancaria cuenta = new CuentaBancaria("Javier Ramírez", 1000.0, 1234);

		cuenta.mostrar();
		cuenta.retirar(200.0, 1234); // PIN correcto
		cuenta.mostrar();

		cuenta.retirar(100.0, 9999); // PIN incorrecto
		cuenta.mostrar();
		
		System.out.println("\n===== 4. CURSO Y CALIFICACIONES =====");

		Curso curso1 = new Curso("Programación I", 75, 80, 65);
		Curso curso2 = new Curso("Matemática", 50, 55, 40);
		Curso curso3 = new Curso("Inglés", 120, 90, 85); // nota1 inválida

		curso1.mostrar();
		curso2.mostrar();
		curso3.mostrar();
		
		
		System.out.println("\n===== 5. ESTUDIANTE Y BECA =====");

		Estudiante est1 = new Estudiante("2024-001", "Javier Ramírez", 90);
		Estudiante est2 = new Estudiante("2024-002", "Nancy Ramírez", 70);
		Estudiante est3 = new Estudiante("2024-003", "María López", 150); // promedio inválido

		est1.mostrar();
		est2.mostrar();
		est3.mostrar();
		
		
		System.out.println("\n===== 6. TERMÓMETRO INTELIGENTE =====");

		Termometro t1 = new Termometro(25);
		Termometro t2 = new Termometro(-300); // inválido, menor al cero absoluto
		Termometro t3 = new Termometro(0);

		t1.mostrar();
		t2.mostrar();
		t3.mostrar();

		t1.setCelsius(100); // válido
		t1.mostrar();
		
		System.out.println("\n===== 7. RELOJ CON FORMATO =====");

		Reloj reloj1 = new Reloj(8, 5, 30);
		Reloj reloj2 = new Reloj(25, 70, 90); // valores inválidos
		Reloj reloj3 = new Reloj(23, 59, 59);

		System.out.println("Reloj 1: " + reloj1.mostrarHora());
		System.out.println("Reloj 2: " + reloj2.mostrarHora());
		System.out.println("Reloj 3: " + reloj3.mostrarHora());

		reloj2.setHora(14); // corregir
		reloj2.setMinuto(30);
		reloj2.setSegundo(0);
		System.out.println("Reloj 2 corregido: " + reloj2.mostrarHora());
		
		
		System.out.println("\n===== 8. CONTACTO CON TELÉFONO =====");

		Contacto c1 = new Contacto("Javier Ramírez", "12345678", "javier@correo.com");
		Contacto c2 = new Contacto("Nancy Ramírez", "123", "nancycorreo.com"); // teléfono y email inválidos

		c1.mostrarContacto();
		c2.mostrarContacto();

		c2.setTelefono("87654321"); // válido
		c2.setEmail("nancy@correo.com"); // válido
		c2.mostrarContacto();
		
		System.out.println("\n===== 9. JUEGO CON PUNTAJE MÁXIMO =====");

		Jugador jugador1 = new Jugador("Javier");

		jugador1.mostrar();
		jugador1.actualizarPuntaje(150);
		jugador1.mostrar();

		jugador1.actualizarPuntaje(90); // menor al máximo actual, no lo supera
		jugador1.mostrar();

		jugador1.actualizarPuntaje(300); // nuevo récord
		jugador1.mostrar();

		jugador1.actualizarPuntaje(-20); // inválido
		jugador1.mostrar();
		
		System.out.println("\n===== 10. FACTURA CON TOTAL =====");

		Factura factura1 = new Factura("F001", "Laptop HP", 2, 4500.0);
		Factura factura2 = new Factura("F002", "Mouse inalámbrico", -1, 150.0); // cantidad inválida

		factura1.mostrarFactura();
		factura2.mostrarFactura();

		factura2.setCantidad(3); // corregir
		factura2.mostrarFactura();
	}

}
