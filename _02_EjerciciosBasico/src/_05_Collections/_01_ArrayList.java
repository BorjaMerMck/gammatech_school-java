package _05_Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class _01_ArrayList {
    public static ArrayList<String> nombres = new ArrayList<>();

    public static void ejercicio1() {
        // Crea un ArrayList de String de 5 elementos y muéstralos 1 a 1
        ArrayList<String> lista = new ArrayList<>();
        lista.add("Uno");
        lista.add("Dos");
        lista.add("Tres");
        lista.add("Cuatro");
        lista.add("Cinco");

        System.out.println("Ejercicio 1:");
        for (String nombre : lista) {
            System.out.println(nombre);
        }
        System.out.println();
    }

    public static void ejercicio2() {
        // Añade varios nombres al array nombres (ya están en main)
        // Comprueba si existe dentro del ArrayList "Alberto"
        System.out.println("Ejercicio 2:");
        if (nombres.contains("Alberto")) {
            System.out.println("\"Alberto\" está en la lista.");
        } else {
            System.out.println("\"Alberto\" NO está en la lista.");
        }
        System.out.println();
    }

    public static void ejercicio3() {
        System.out.println("Ejercicio 3:");
        System.out.println("Lista antes de eliminar: " + nombres);
        nombres.remove("Pedro");
        System.out.println("Lista después de eliminar \"Pedro\": " + nombres);
        System.out.println();
    }

    public static void ejercicio4() {
        // Ordena alfabéticamente los nombres
        System.out.println("Ejercicio 4:");
        Collections.sort(nombres);
        System.out.println("Lista ordenada: " + nombres);
        System.out.println();
    }

    public static void ejercicio5() {
        // Añade en la posición 4 un nombre a nombres.
        System.out.println("Ejercicio 5:");
        nombres.add(4, "Lucía");
        System.out.println("Lista con 'Lucía' en la posición 4: " + nombres);
        System.out.println();
    }

    public static void ejercicio6() {
        // Crea una copia de ArrayList y comprueba que son objetos distintos.
        System.out.println("Ejercicio 6:");
        ArrayList<String> copia = new ArrayList<>(nombres);
        System.out.println("¿Son el mismo objeto? " + (nombres == copia));
        System.out.println("¿Tienen el mismo contenido? " + nombres.equals(copia));
        System.out.println();
    }

    public static void ejercicio7() {
        System.out.println("Ejercicio 7:");
        HashMap<String, Integer> conteo = new HashMap<>();
        for (String nombre : nombres) {
            conteo.put(nombre, conteo.getOrDefault(nombre, 0) + 1);
        }

        for (String nombre : conteo.keySet()) {
            System.out.println(nombre + " aparece " + conteo.get(nombre) + " veces.");
        }
        System.out.println();
    }

    public static void ejercicio8() {
        System.out.println("Ejercicio 8:");
        Collections.reverse(nombres);
        System.out.println("Lista invertida: " + nombres);
        System.out.println();
    }

    public static void main(String[] args) {
        nombres.add("Christian");
        nombres.add("Raquel");
        nombres.add("Natalia");
        nombres.add("Hugo");
        nombres.add("Alex");
        nombres.add("Pedro");
        nombres.add("Mario");
        nombres.add("Maria");
        nombres.add("Rita");
        nombres.add("Carlos");
        nombres.add("Mario");
        nombres.add("Raquel");

        ejercicio1();
        ejercicio2();
        ejercicio3();
        ejercicio4();
        ejercicio5();
        ejercicio6();
        ejercicio7();
        ejercicio8();
    }
}
