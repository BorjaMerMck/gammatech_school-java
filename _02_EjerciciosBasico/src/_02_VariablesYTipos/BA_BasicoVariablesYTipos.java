package _02_VariablesYTipos;

public class BA_BasicoVariablesYTipos {
    public static void main(String[] args) {
        ejercicio1();
        ejercicio2();
        ejercicio3();
        ejercicio4();
        ejercicio5();
    }

    // 1. Declarar variables numéricas y hacer conversiones implícitas
    public static void ejercicio1() {
        System.out.println("EJERCICIO 1:");

        byte varByte = 10;
        short byteToShort = varByte;
        int shortToInt = byteToShort;
        long intToLong = shortToInt;
        float longToFloat = intToLong;
        double floatToDouble = longToFloat;

        System.out.println("byte a short: " + byteToShort);
        System.out.println("short a int: " + shortToInt);
        System.out.println("int a long: " + intToLong);
        System.out.println("long a float: " + longToFloat);
        System.out.println("float a double: " + floatToDouble);
        System.out.println();
    }

    // 2. Declarar un char y almacenarlo en un int
    public static void ejercicio2() {
        System.out.println("EJERCICIO 2:");

        char letra = 'C';
        int charToInt = letra; // Conversión implícita (char → int)

        System.out.println("El valor ASCII de 'C' es: " + charToInt);
        System.out.println();
    }

    // 3. Intentar convertir un long a short sin casting
    public static void ejercicio3() {
        System.out.println("EJERCICIO 3:");

        long varLong = 100000L;
        //short longToShort = varLong;  // ❌ ERROR: Type mismatch: cannot convert from long to short

        System.out.println("No se puede convertir un long a short sin casting porque podría perder datos.");
        System.out.println("ERROR: Type mismatch: cannot convert from long to short");
    }

    // 4. Asigna un float a un double y viceversa
    public static void ejercicio4() {
        System.out.println("EJERCICIO 4:");

        float varFloat = 3.14f;
        double floatToDouble2 = varFloat; // No necesita casting
        double varDouble = 3.1416;
        float doubleToFloat = (float) varDouble; // Necesita casting

        System.out.println("float a double: " + floatToDouble2);
        System.out.println("double a float (con casting): " + doubleToFloat);
        System.out.println();
    }

    // 5. Cast de double a int
    public static void ejercicio5() {
        System.out.println("EJERCICIO 5:");

        double valorDouble = 9.99;
        int doubleToInt = (int) valorDouble; // Pierde la parte decimal

        System.out.println("double original: " + valorDouble);
        System.out.println("double convertido a int (pierde decimales): " + doubleToInt);
        System.out.println();
    }
}

/*
 * Bloque de ejercicios de nivel básico
 * 
 * Cada ejercicio tiene su espacio, recuerda:
 * System.out.println(); para mostrar por pantalla texto que indique en qué ejercicio estás
 * y el proceso que vas haciendo.
 
public class BA_BasicoVariablesYTipos {
    public static void main(String[] args) {
        // 1. Declara variables de tipos numéricos (byte, short, int, long, float, double)
        // Realiza conversiones implícitas entre ellas
        System.out.println("EJERCICIO 1:"); // Resuelve en las siguientes líneas

        // 2. Declara una variable char con valor 'C'.
        // Almacena su valor en una variable int.
        // Muestra por pantalla el valor.
        System.out.println("EJERCICIO 2:");

        // 3. Intenta convertir un long en un short sin hacer casting
        // Deja en un comentario el error.
        System.out.println("EJERCICIO 3:");

        // 4. Asigna un float a un double y viceversa.
        // ¿Cuándo es necesario hacer un casteo?
        System.err.println("EJERCICIO 4:");

        // 5. Crea una variable double, con valor decimal.
        // Castéala a una variable int.
        // ¿Qué ocurre?
        System.out.println("EJERCICIO 5:");


    }
}

*/
