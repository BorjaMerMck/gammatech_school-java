package _02_VariablesYTipos;

public class B_varialblesYTipos {
    public static void main(String[] args) {
        // Llamadas a funciones
        castingImplicito();
        castingExplicito();
        castingCharYNumero();
        castingStringYNumeros();
        castingIntAStringYChar();
    }

    // Función para realizar casting implícito (de menor a mayor tipo)
    public static void castingImplicito() {
        byte varByte = 10;
        short byteToShort = varByte; 	
        int shortToInt = byteToShort;
        long intToLong = shortToInt;
        float longToFloat = intToLong;
        double floatToDouble = longToFloat;

        System.out.println("Casting implícito:");
        System.out.println("byte a short: " + byteToShort);
        System.out.println("short a int: " + shortToInt);
        System.out.println("int a long: " + intToLong);
        System.out.println("long a float: " + longToFloat);
        System.out.println("float a double: " + floatToDouble);
        System.out.println();
    }

    // Función para realizar casting explícito (de mayor a menor tipo)
    public static void castingExplicito() {
        short varShort = 1000;
        int varInt = 50000;
        long varLong = 1000000L;
        double varDouble = 2.71828f;

        byte shortToByte = (byte) varShort;
        short intToShort = (short) varInt;
        int longToInt = (int) varLong;
        float doubleToFloat = (float) varDouble;
        long doubleToLong = (long) varDouble;

        System.out.println("Casting explícito:");
        System.out.println("short a byte: " + shortToByte);
        System.out.println("int a short: " + intToShort);
        System.out.println("long a int: " + longToInt);
        System.out.println("double a float: " + doubleToFloat);
        System.out.println("double a long: " + doubleToLong);
        System.out.println();
    }

    // Función para realizar casting entre char y número
    public static void castingCharYNumero() {
        char varChar = 'A';
        int charToInt = varChar;
        char intToChar = (char) 66;

        System.out.println("Casting entre char y números:");
        System.out.println("char a int (valor ASCII de 'A'): " + charToInt);
        System.out.println("int a char (66 es): " + intToChar);
        System.out.println();
    }

    // Función para realizar casting entre String y números
    public static void castingStringYNumeros() {
        String varString = "1234";
        int stringToInt = Integer.parseInt(varString);
        double stringToDouble = Double.parseDouble("3.1416");
        int varInt = 50000;
        double varDouble = 2.71828;

        String intToString = String.valueOf(varInt);
        String doubleToString = Double.toString(varDouble);

        System.out.println("Casting entre String y números:");
        System.out.println("String a int: " + stringToInt);
        System.out.println("String a double: " + stringToDouble);
        System.out.println("int a String: " + intToString);
        System.out.println("double a String: " + doubleToString);
        System.out.println();
    }

    // Función para realizar casting de int a String y a char
    public static void castingIntAStringYChar() {
        int numero = 97;

        // int a String
        String intToString = Integer.toString(numero);

        // int a char (usando código ASCII)
        char intToChar = (char) numero;

        System.out.println("Casting de int a String y a char:");
        System.out.println("int a String: " + intToString);
        System.out.println("int a char (97 es): " + intToChar);
        System.out.println();
    }
}
