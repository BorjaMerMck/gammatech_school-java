package _06_TryCatch;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese una palabra: ");
        String palabra = scanner.nextLine();
        System.out.print("Ingrese posición: ");
        int pos = scanner.nextInt();
        
        try {
            char caracter = palabra.charAt(pos);
            System.out.println("Carácter: " + caracter);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Error: Posición inválida.");
        }
    }
}