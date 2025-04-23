package _06_TryCatch;

import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese contraseña: ");
        String contrasena = scanner.nextLine();
        
        try {
            if (contrasena.length() < 8) 
                throw new ContrasenaInseguraException("Mínimo 8 caracteres.");
            if (!contrasena.matches(".*[A-Z].*")) 
                throw new ContrasenaInseguraException("Falta mayúscula.");
            if (!contrasena.matches(".*\\d.*")) 
                throw new ContrasenaInseguraException("Falta número.");
            System.out.println("Contraseña segura.");
        } catch (ContrasenaInseguraException e) {
            System.out.println(e.getMessage());
        }
    }
}