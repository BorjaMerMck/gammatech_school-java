package _06_TryCatch;

public class Ejercicio4 {
    public static void main(String[] args) {
        String texto = null;
        try {
            System.out.println(texto.length());
        } catch (NullPointerException e) {
            System.out.println("Error: La cadena es nula.");
        }
    }
}