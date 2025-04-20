package _primerosEjercicios;

import java.util.Random;
import java.util.Scanner;

public class _06TirarDados {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Cuántas tiradas vas a hacer?");
        int tiradas = sc.nextInt();
        
        int[] frecuenciasDeDados = lanzarDados(tiradas);
        
        mostrarResultados(frecuenciasDeDados);
        
        sc.close();
    }
    
    public static int[] lanzarDados(int tiradas) {
        int[] frecuenciasDeDados = new int[11]; // Índices 0 a 10 (sumas 2 a 12)
        Random random = new Random();
        
        for (int i = 0; i < tiradas; i++) {
            int d1 = random.nextInt(6) + 1; 
            int d2 = random.nextInt(6) + 1;
            int suma = d1 + d2;
            
            registrarResultados(frecuenciasDeDados, suma);
        }
        return frecuenciasDeDados;
    }
    
    public static void registrarResultados(int[] resultados, int suma) {
        resultados[suma - 2]++; // Ajustamos el índice correctamente
    }
    
    public static void mostrarResultados(int[] frecuenciasDeDados) {
        int maxFrecuencia = 0;
        int sumaMasFrecuente = 2; 
        
        System.out.println("\nResultados de las tiradas:");
        for (int suma = 2; suma <= 12; suma++) {
            System.out.print("Suma " + suma + ": " + frecuenciasDeDados[suma - 2] + "\t");

            for (int i = 0; i < frecuenciasDeDados[suma - 2]; i++) {
                System.out.print("*");
            }
            System.out.println();

            if (frecuenciasDeDados[suma - 2] > maxFrecuencia) {
                maxFrecuencia = frecuenciasDeDados[suma - 2];
                sumaMasFrecuente = suma;
            }
        }
        System.out.println("\nLa suma más frecuente es: " + sumaMasFrecuente);
    }
}
