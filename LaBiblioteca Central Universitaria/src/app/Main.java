package app;

import java.util.Scanner;
import model.*;
import enums.EstadoRecurso;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BibliotecaManager manager = new BibliotecaManager();

        // Usuarios
        manager.agregarUsuario(new Usuario("U001", "Ana Gómez"));
        manager.agregarUsuario(new Usuario("U002", "Luis Fernández"));

        // Libros
        manager.agregarRecurso(new Libro("L001", "El Quijote", "Cervantes"));
        manager.agregarRecurso(new Libro("L002", "1984", "George Orwell"));

        // Revistas
        manager.agregarRecurso(new Revista("R001", "National Geographic", 120));
        manager.agregarRecurso(new Revista("R002", "Muy Interesante", 210));

        // DVDs
        manager.agregarRecurso(new DVD("D001", "Matrix", 136));
        manager.agregarRecurso(new DVD("D002", "El Señor de los Anillos", 180));

       
        while (true) {
            System.out.print(">> ");
            String[] input = scanner.nextLine().split(" ");
            String comando = input[0];

            switch (comando) {
                case "prestar":
                    if (input.length < 3) {
                        System.out.println("Uso correcto: prestar <idRecurso> <idUsuario>");
                        break;
                    }
                    manager.prestar(
                        manager.obtenerRecurso(input[1]),
                        manager.obtenerUsuario(input[2])
                    );
                    break;

                case "devolver":
                    if (input.length < 2) {
                        System.out.println("Uso correcto: devolver <idRecurso>");
                        break;
                    }
                    manager.devolver(manager.obtenerRecurso(input[1]));
                    break;

                case "listar":
                    manager.listarRecursos();
                    break;

                case "salir":
                    System.out.println("¡Adiós!");
                    return;

                default:
                    System.out.println("Comando no reconocido.");
            }
        }
    }
}
