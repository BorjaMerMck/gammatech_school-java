package _00_Java_Basico;

import java.util.Scanner;

public class main {

	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/* String palabra =  "";
		System.out.println("Introduce una palabra");
		palabra = sc.nextLine();
		
		
		
		System.out.println(contadorDeVocales(palabra));
		
		
		
		System.out.println("introduce una letra");
	
		char letra = sc.next().charAt(0);

		System.out.println(contadorDeVocales(palabra,letra));
 
 
 		System.out.println("dame un numero");
		int n = sc.nextInt();

		System.out.println(sumarN(n));
		
	
		
		do {
		
		
			System.out.println(" ingresa un numero negativo para stop");
			numero = sc.nextInt();
			
						
			
		}while(numero >= 0);
			
		System.out.println("stop");
		
		int numero = 0;
	
		
		while(numero >= 0 ) {
			
			System.out.println(" ingresa un numero negativo para stop");
			numero = sc.nextInt();
			
			
		}
		
		
		 */
		
		
		
		

		System.out.println(posicionLetra(1,"hola"));
		
		String palabra = "hola";
		
	     System.out.println(".indexOf()");
	        System.out.println("Índice de 'Mundo': " + palabra.indexOf("Mundo"));
	        System.out.println();
	        
	        System.out.println(contadorLetras("holal",'l'));
		
		sc.close();
	}
	
	public static int contadorDeVocales(String palabra) {
		int cont = 0;
		for(int i = 0; i<palabra.length(); i++) {
			if (palabra.charAt(i) == 'e' || palabra.charAt(i) == 'a' || palabra.charAt(i) == 'i' || palabra.charAt(i) == 'o' ||palabra.charAt(i) == 'u' ) {
				cont++;
			}
		}
		return cont;
	}

	public static int contadorDeVocales(String palabra, char letra) {
		int cont = 0;
		
		for (int i = 0; i<palabra.length(); i++) {
			if (palabra.charAt(i) == letra) {
				cont++;
			}
		}
		return cont;
	}
	
	
	public static char posicionLetra(int posicion, String palabra) {
		
		// borja introducir una palabra 
		// indicarle que numero de letra te saque por pontallla
		
		System.out.println("Introducir posicion desde 1 hasta " + palabra.length());
		
	
		return palabra.charAt(posicion);
	}

	
	
	// en contrar la donde se encuentra que te devuelva en el indice de la letra 
	
	
	public static int contadorLetras(String palabra,char letra) {
		
		int contador = 0;
		
		for (int i = 0;i < palabra.length(); i++) {
			if (palabra.charAt(i) == letra) {
				contador++;
			}
		}
		
		return contador;
	
		
		
	}
	
	
	
	
	
	
	
	
	
	public static boolean isPar(int numero) {
		if (numero % 2 == 0) {
			return true;
		}else {
			return false;
		}
	}
	
	public static int sumarN(int n) {
		
		int suma = 0;
		
		for (int i = 1; i <= n; i++) {
			suma += i;
		}
		return suma;
	}
	
	

	
}
