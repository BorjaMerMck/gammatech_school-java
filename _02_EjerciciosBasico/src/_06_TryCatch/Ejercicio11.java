package _06_TryCatch;

import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese edad: ");
        int edad = scanner.nextInt();
        
        try {
            if (edad < 0) throw new EdadNegativaException("Edad no puede ser negativa.");
            System.out.println("Edad válida.");
        } catch (EdadNegativaException e) {
            System.out.println(e.getMessage());
        }
    }
}