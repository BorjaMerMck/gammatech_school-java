package _06_TryCatch;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        String[] nombres = {"Ana", "Juan", "Luisa", "Carlos"};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un índice (0-3): ");
        int indice = scanner.nextInt();
        
        try {
            System.out.println("Nombre: " + nombres[indice]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Índice fuera de rango.");
        }
    }
}