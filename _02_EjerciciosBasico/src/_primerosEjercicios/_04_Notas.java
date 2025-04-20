package _primerosEjercicios;
import java.util.Scanner;

public class _04_Notas {
	
	 /*
     * Crea un programa que permita introducir el número de 
     * votantes y tres candidatos. 
     * Cada votante elige un candidato por número (1, 2 o 3). 
     * El programa debe validar los votos, contar cuántos ha 
     * recibido cada candidato, mostrar el porcentaje de votos 
     * y declarar al ganador.
     * 
     * Requisitos:
     * Uso de arrays para almacenar los votos.
     * 
     * Métodos para:
     *      Mostrar menú.
     *      Leer votos.
     *      Validar voto.
     *      Calcular porcentaje.
     *      Determinar el ganador.
     * Controlar errores de entrada (votos fuera del rango).
     */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int notas = 1;
    	System.out.println("Dime Tu nota De Programación");
		notas = sc.nextInt();

		
		if (notas>10 && notas<10) {

		System.out.println("Se ha guadado la nota");

		
		}else {
			System.out.println("NO Se ha guadado la nota");
		}
		
		
		
		
	}
}
