
public class EjemploConvertirVariables {

	public static void main(String[] args) {
		double variable1 = 230.89;
		int variable1Entero = (int) variable1; //Cast --- Convierte un double a int
		
		System.out.println(variable1Entero); //Imprime solo la parte entera
		
		//int soporta 2^31 para positivos, es decir 32 bits
		//y (2^31)-1 en negativo porque tenemos el 0 al medio
		
		long prueba= 12222222222L; //La L (ELE mayúscula o minúscula) al final es para indicar que es de tipo long
		//long soporta 2^64 es decir 64 bits
				
		short numeroPequeno = 13555; //soporta 2^16
		
		byte numeroAunMasPequeno = 15; //soporta 8 bits
		
		float numeroDecimalPequeno = 2.5F; //La F indica que es float
		
		double resultado = variable1 + variable1Entero; //Debo indicar double paraa sumar un double con un int
		System.out.println(resultado);
		
		double valor1 = 0.2;
        double valor2 = 0.1;
        double total = valor1 + valor2; //Da como resultado 0.30000000000000004

        System.out.println(total);
	}

}
