package _03_MetodosYCondiciones;

import java.util.Scanner;

public class C_Metodos {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		
		System.out.println("Introduce numero que sea entero y mayor que 0");
		
		int numero1 = sc.nextInt();
		
		System.out.println("Introduce el numero2 que sea entero y mayor que 0");
		int numero2 = sc.nextInt();
		
			checkNumberNegative( numero1, numero2);
		 	int resultadoSuma =	suma(numero1,numero2);
			int resultadoResta = resta(numero1,numero2);
			int resultadoDivision = division(numero1,numero2);
			int resultadoMultiplicacion = multiplicacion(numero1, numero2);
			int resultadoModulo = modulo(numero1,numero2);
			
			
			print(resultadoSuma, resultadoResta, resultadoDivision, resultadoMultiplicacion, resultadoModulo);
			
		sc.close();
	}
	
	private static void checkNumberNegative(int numero1, int numero2)  {
		if (numero1 < 0 || numero2 < 0) {
			System.out.println("No se puede continuar porque has introducido un numero negativo");
			System.exit(0);
			
		}
	}
	
	private static int suma(int numero1, int numero2) {
		return numero1 + numero2;
	}
	
	
	private static int resta(int numero1, int numero2) {
		return numero1 - numero2;	
	}
	
	private static int division(int numero1,int numero2) {
		return numero1 / numero2;
	}

	private static int multiplicacion(int numero1, int numero2) {
		return numero1 * numero2;
	}
	
	private static int modulo(int numero1,int numero2) {
		return numero1 % numero2;
	}
	
	private static void print(int resultadoSuma,int resultadoResta,int resultadoDivision,int resultadoMultiplicacion,int resultadoModulo) {
		
		System.out.println("\nresultado de suma: " + resultadoSuma
						+ "\n resultado de resta: " + resultadoResta 
						+ "\n resultado de División: " + resultadoDivision
						+ "\n Resultado de multiplicación " +  resultadoMultiplicacion 
						+ "\n Resultado de Modulo: " + resultadoModulo);
	}
}
