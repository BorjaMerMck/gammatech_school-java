package _05_Collections;

import java.util.*;

public class _02_HashSet {
    public static void main(String[] args) {
        // 1. Agregar frutas a un HashSet y mostrarlos
        HashSet<String> frutas = new HashSet<>();
        frutas.add("Manzana");
        frutas.add("Banana");
        frutas.add("Kiwi");
        frutas.add("Fresa");
        frutas.add("Naranja");

        System.out.println("1. Frutas:");
        for (String fruta : frutas) {
            System.out.println(fruta);
        }
        System.out.println();

        // 2. Comprobar existencia de un elemento dentro de frutas
        System.out.println("2. ¿Existe 'Kiwi'?");
        System.out.println(frutas.contains("Kiwi") ? "Sí, está en el set." : "No, no está.");
        System.out.println();

        // 3. Eliminar un elemento de frutas
        System.out.println("3. Eliminando 'Fresa'");
        frutas.remove("Fresa");
        System.out.println("Frutas después de eliminar: " + frutas);
        System.out.println();

        // 4. Comprobar el tamaño del HashSet frutas
        System.out.println("4. Tamaño del HashSet frutas: " + frutas.size());
        System.out.println();

        // 5. Unión de HashSets
        HashSet<String> frutas2 = new HashSet<>();
        frutas2.add("Piña");
        frutas2.add("Banana");
        frutas2.add("Melón");

        HashSet<String> union = new HashSet<>(frutas); // copia de frutas
        union.addAll(frutas2); // unión

        System.out.println("5. Unión de frutas y frutas2: " + union);
        System.out.println();

        // 6. Intersección de conjuntos entre frutas y frutas2
        HashSet<String> interseccion = new HashSet<>(frutas);
        interseccion.retainAll(frutas2);
        System.out.println("6. Intersección: " + interseccion);
        System.out.println();

        // 7. Diferencia entre conjuntos entre frutas y frutas2
        HashSet<String> diferencia = new HashSet<>(frutas);
        diferencia.removeAll(frutas2);
        System.out.println("7. Diferencia (frutas - frutas2): " + diferencia);
        System.out.println();

        // 8. Convertir a ArrayList y ordenar
        ArrayList<String> listaOrdenada = new ArrayList<>(frutas);
        Collections.sort(listaOrdenada);
        System.out.println("8. Frutas ordenadas alfabéticamente: " + listaOrdenada);
        System.out.println();

        // 9. Eliminar elementos con condición (longitud < 6)
        frutas.removeIf(fruta -> fruta.length() < 6);
        System.out.println("9. Frutas con longitud >= 6: " + frutas);
        System.out.println();
    }
}
