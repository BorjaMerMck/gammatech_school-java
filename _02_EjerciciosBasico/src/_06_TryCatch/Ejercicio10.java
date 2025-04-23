package _06_TryCatch;

import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese nombre del archivo: ");
        String nombre = "C:\\Users\\b\\Documents\\cursos\\gammatech_school-java\\_02_EjerciciosBasico\\src\\_06_TryCatch\\" + scanner.nextLine();
        try {
            FileReader reader = new FileReader(nombre);
            System.out.println("Archivo abierto.");
        } catch (FileNotFoundException e) {
            System.err.println("Error: Archivo no existe.");
        } catch (IOException ex) {
        	System.err.println("Error: no tienes Permisos de lectura...");
        }
    }
}