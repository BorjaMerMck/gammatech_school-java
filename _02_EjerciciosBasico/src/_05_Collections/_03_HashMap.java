package _05_Collections;

import java.util.*;

public class _03_HashMap {
    public static void main(String[] args) {

        // 1. Crear un diccionario y añade 5 pares de valor
        HashMap<String, String> diccionario = new HashMap<>();
        diccionario.put("casa", "house");
        diccionario.put("perro", "dog");
        diccionario.put("gato", "cat");
        diccionario.put("libro", "book");
        diccionario.put("mesa", "table");

        System.out.println("1. Diccionario: " + diccionario);
        System.out.println();

        System.out.println("2. Traducción de 'gato': " + diccionario.get("gato"));
        diccionario.put("gato", "miau");
        System.out.println("Traducción modificada de 'gato': " + diccionario.get("gato"));
        System.out.println();

        // 3. Comprobar existencia de clave o valor
        System.out.println("3. ¿Contiene clave 'perro'? " + diccionario.containsKey("perro"));
        System.out.println("¿Contiene valor 'table'? " + diccionario.containsValue("table"));
        System.out.println();

        // 4. Eliminar una entrada
        diccionario.remove("libro");
        System.out.println("4. Diccionario después de eliminar 'libro': " + diccionario);
        System.out.println();

        // 5. Mostrar todas las claves y los valores
        System.out.println("5. Claves: " + diccionario.keySet());
        System.out.println("Valores: " + diccionario.values());
        System.out.println();

        // 6. Contar caracteres en una frase
        String frase = "me estoy peleando con HashMap";
        HashMap<Character, Integer> conteo = new HashMap<>();
        for (char c : frase.toCharArray()) {
            if (c != ' ') {
                conteo.put(c, conteo.getOrDefault(c, 0) + 1);
            }
        }
        System.out.println("6. Conteo de caracteres: " + conteo);
        System.out.println();

        // 7. Agrupar nombres por inicial
        String[] listaNombres = {"Ana", "Andrés", "Bea", "Carlos", "Carmen"};
        HashMap<Character, ArrayList<String>> agrupados = new HashMap<>();
        for (String nombre : listaNombres) {
            char inicial = nombre.charAt(0);
            agrupados.putIfAbsent(inicial, new ArrayList<>());
            agrupados.get(inicial).add(nombre);
        }
        System.out.println("7. Nombres agrupados por inicial:");
        for (char inicial : agrupados.keySet()) {
            System.out.println(inicial + ": " + agrupados.get(inicial));
        }
        System.out.println();

        // 8. Invertir un HashMap (valores únicos)
        HashMap<String, String> invertido = new HashMap<>();
        for (Map.Entry<String, String> entry : diccionario.entrySet()) {
            invertido.put(entry.getValue(), entry.getKey());
        }
        System.out.println("8. Diccionario invertido: " + invertido);
        System.out.println();

        // 9. HashMap con claves nombres y anidaciones...
        HashMap<String, HashMap<String, String>> agenda = new HashMap<>();

        HashMap<String, String> contacto1 = new HashMap<>();
        contacto1.put("tlfn", "123456789");
        contacto1.put("email", "ana@mail.com");

        HashMap<String, String> contacto2 = new HashMap<>();
        contacto2.put("tlfn", "987654321");
        contacto2.put("email", "carlos@mail.com");

        agenda.put("Ana", contacto1);
        agenda.put("Carlos", contacto2);

        System.out.println("9. Agenda:");
        for (String nombre : agenda.keySet()) {
            System.out.println(nombre + ": " + agenda.get(nombre));
        }
        System.out.println();

        // 10. Agenda simple con búsqueda
        String buscar = "Ana";
        System.out.println("10. Buscando contacto '" + buscar + "'");
        if (agenda.containsKey(buscar)) {
            System.out.println("Teléfono: " + agenda.get(buscar).get("tlfn"));
            System.out.println("Email: " + agenda.get(buscar).get("email"));
        } else {
            System.out.println("No se encontró el contacto.");
        }
    }
}
