package _06_TryCatch;

import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese nombre: ");
        String nombre = scanner.nextLine().trim();
        
        try {
            if (nombre.isEmpty()) 
                throw new NombreVacioException("Nombre no puede estar vacío.......");
            System.out.println("Nombre válido... -->" + nombre);
            
        } catch (NombreVacioException e) {
            System.out.println(e.getMessage());
        }
    }
}