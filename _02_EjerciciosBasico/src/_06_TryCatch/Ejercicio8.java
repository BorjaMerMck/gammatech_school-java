package _06_TryCatch;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese temperatura (°C): ");
        double temp = scanner.nextDouble();
        
        try {
            if (temp < -273) {
                throw new IllegalArgumentException("Temperatura imposible.");
            }
            System.out.println("Temperatura válida.");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}