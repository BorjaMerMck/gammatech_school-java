package _06_TryCatch;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese tamaño del array: ");
        int tamaño = scanner.nextInt();
        
        try {
            if (tamaño < 0) {
                throw new IllegalArgumentException("Tamaño no puede ser negativo.");
            }
            int[] array = new int[tamaño];
            System.out.println("Array creado.");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}