
public class EjemploFactorial {
	public static void main(String[] args) {
		int factorial = 1;
		//for (int i = 1; i < 11; i++) //Esta línea hace lo mismo que la siguiente
        for (int i = 1; i <= 10; i++) {
            factorial *= i;
            System.out.println("Factorial de " + i + " = " + factorial);
        }
	}

}
