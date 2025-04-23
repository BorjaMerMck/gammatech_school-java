package _06_TryCatch;

import java.io.FileReader;
import java.io.FileNotFoundException;

public class Ejercicio9 {
    public static void main(String[] args) {
        try {
            FileReader reader = new FileReader("archivo.txt");
            System.out.println("Archivo encontrado.");
        } catch (FileNotFoundException e) {
            System.out.println("Error: Archivo no encontrado.");
        }
    }
}
