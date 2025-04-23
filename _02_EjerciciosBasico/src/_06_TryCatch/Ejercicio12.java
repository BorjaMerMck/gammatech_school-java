package _06_TryCatch;

import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese nota  de  0-10 ");
        double nota = scanner.nextDouble();
        
        try {
            if (nota < 0 || nota > 10) {
            	throw new NotaInvalidaException("Nota esta fuera de rango.....");
            }
            System.out.println("Nota es válida.....");
            
        } catch (NotaInvalidaException e) {
            System.err.println(e.getMessage());
            
        }
    }
}