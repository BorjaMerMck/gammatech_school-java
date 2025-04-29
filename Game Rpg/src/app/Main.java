package app;

import java.util.Scanner;
import enums.Raza;
import model.Jugador;
import model.Personaje;
import model.StatsPersonaje;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Jugador jugador = new Jugador();
        jugador.introduccion(sc); 

        System.out.println("\n=== Elige la raza de tu personaje ===");
        System.out.println("1. Humanos");
        System.out.println("2. Orcos");
        System.out.println("3. Elfos");
        System.out.println("4. Muertos Vivientes");

        Raza razaElegida = null;
        while (razaElegida == null) {
            System.out.print("Introduce el número de tu elección: ");
            int opcion = sc.nextInt();
            switch (opcion) {
                case 1 -> razaElegida = Raza.humanos;
                case 2 -> razaElegida = Raza.orcos;
                case 3 -> razaElegida = Raza.elfos;
                case 4 -> razaElegida = Raza.muertosVivientes;
                default -> System.out.println("Tienes que eliger una raza de esas ");
            }
        }

       
        Personaje personaje = StatsPersonaje.crearPersonajePorRaza(razaElegida);

        personaje.setName(jugador.getName());
        personaje.setEdad(jugador.getEdad());
        personaje.setSexo(jugador.getSexo());

        System.out.println("\n=== Tu personaje ha sido creado ===");
        personaje.mostrarEstado();

        sc.close();
    }
}
