package ejercicioCoches;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;
import java.util.Scanner;

public class MainApp {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
    	ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContextCoches.xml");
        GestorCoches gestor = (GestorCoches) context.getBean("gestor");

        int opcion;
        do {
            System.out.println("\n--- Menú ---");
            System.out.println("1. Añadir coche");
            System.out.println("2. Listar coches");
            System.out.println("3. Listar por marca");
            System.out.println("4. Salir");
            System.out.print("Opción: ");
            opcion = sc.nextInt(); sc.nextLine();

            switch (opcion) {
            case 1:
                añadirCoche(gestor);
                break;
            case 2:
                listar(gestor.getCoches());
                break;
            case 3:
                listar(gestor.getCochesOrdenadosPorMarca());
                break;
            case 4:
                System.out.println("Adiós.");
                break;
            default:
                System.out.println("Opción no válida.");
        }

        } while (opcion != 4);
    }

    private static void añadirCoche(GestorCoches gestor) {
        System.out.print("Matrícula: ");
        String matricula = sc.nextLine().trim();
        if (matricula.length() < 10) {
            System.out.println("Matrícula debe tener al menos 10 caracteres.");
            return;
        }
        System.out.print("Marca: ");
        String marca = sc.nextLine();
        System.out.print("Modelo: ");
        String modelo = sc.nextLine();
        System.out.print("Kilómetros: ");
        int km = sc.nextInt(); sc.nextLine();

        Coche coche = new Coche(matricula, marca, modelo, km);
        if (gestor.addCoche(coche)) {
            System.out.println("Coche añadido.");
        } else {
            System.out.println("Ya existe un coche con esa matrícula.");
        }
    }

    private static void listar(Iterable<Coche> lista) {
        for (Coche c : lista) {
            System.out.println(c);
        }
    }
}
