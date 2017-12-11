package coche;

public class Coche {
	// Estos son los atributos de nuestro objeto "coche"
	Integer cilindrada;
	String color;
	double precio;
	boolean isArrancado;

//	Esto indica que si el coche esta arrancado imprima una frase, sino la otra
	void arrancar() {
//		tambien se puede poner !isArrancado.Lo que quiere decir "si el coche no esta arrancado..."
		if (isArrancado != true) {
			isArrancado = true;
			System.out.println("¡¡¡Brrrrrrrr!!! El coche acaba de arrancar.");

		} else {
			System.out.println("¡¡¡Kisch, kishch!!! El coche ya está arrancado");
		}
	}

	void verCoche() {
		System.out.println("Este coche es de color " + color + " tiene una cilindrada de " + cilindrada + " y cuesta "
				+ precio + " euros.");
		if (isArrancado == true) {
			System.out.println("Ahora mismo está arrancado.");
		} else {
			System.out.println("Ahora mism está parado.");

		}
	}

	public static void main(String[] args) {
		////Se declara un objeto de la clase coche
		Coche c;
		c = new Coche();
		c.cilindrada = 1800;
		c.color = "plata";
		c.precio = 25000.0;

		System.out.println("¿Qué coche es este?");
		c.verCoche();

		System.out.println("Vamos a arrancar el coche");
		c.arrancar();

		System.out.println("¿Qué coche es este?");
		c.verCoche();

		System.out.println("Vamos a arrancar el coche");
		c.arrancar();

	}

}
