
public class EjemploEnteros {

	public static void main(String[] args) {
		
		// edad = 28 No compila porque falta definir el valor de la variable
		int edad; // Declaración de la variable
		edad = 28; // Inicialización de la variable
		
		// System.out.println("edad"); No compila porque el parámetro no es la variable, es un String
		System.out.println(edad); // Variable como parámetro
		
		edad = 37; // Sobreescribimos el valor de la variable
		System.out.println(edad);
		
		edad = 35 + 99; // Asignamos el valor del resultado de una operación aritmética
		System.out.println(edad);
		
		System.out.println("Mi edad es " + edad); // Concatenamos un String con la variable edad usando +

	}

}
