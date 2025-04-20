package _03_MetodosYCondiciones;

public class CA_MetodosYVariables {

	    public static void main(String[] args) {
	        // Variables y Tipos Primitivos
	        String nombre = "Borja";
	        System.out.println("Mi nombre es: " + nombre);
	        
	        int num1 = 10, num2 = 5;
	        System.out.println("Suma: " + (num1 + num2));
	        System.out.println("Resta: " + (num1 - num2));
	        System.out.println("Multiplicación: " + (num1 * num2));
	        System.out.println("División entera: " + (num1 / num2));
	        System.out.println("Módulo: " + (num1 % num2));
	        
	        int edad = 26;
	        System.out.println("Nombre: " + nombre + ", Edad: " + edad);
	        
	        byte b = 100;
	        short s = 30000;
	        int i = 1000000;
	        long l = 10000000000L;
	        float f = 10.5f;
	        double d = 20.99;
	        char c = 'A';
	        boolean bool = true;
	        System.out.println("Variables primarias correctamente declaradas.");

	        saludar();
	        saludar("Borja");
	        imprimirNumero(15);
	        
	        int resultadoSuma = suma(7, 3);
	        System.out.println("Suma de dos números: " + resultadoSuma);
	        
	        int resultadoSumaTres = suma(4, 5, 6);
	        System.out.println("Suma de tres números: " + resultadoSumaTres);
	        
	        System.out.println("Multiplicación de doubles: " + multiplicar(4.5, 2.3));
	        
	        int intA = 20;
	        double doubleA = intA;
	        System.out.println("Conversión implícita int -> double: " + doubleA);
	        
	        double doubleB = 9.7;
	        int intB = (int) doubleB;
	        System.out.println("Conversión explícita double -> int: " + intB);
	        
	        double base = 5.0, altura = 3.0;
	        double area = (base * altura) / 2;
	        System.out.println("Área del triángulo: " + area);
	        
	        String ciudad = "Madrid";
	        int year = 2025;
	        System.out.println("Aprendiendo Java en " + ciudad + " en el año " + year + ".");
	        
	        int cuadradoResultado = cuadrado(5);
	        System.out.println("El cuadrado de 5 es: " + cuadradoResultado);
	        
	        int mayor = (num1 > num2) ? num1 : num2;
	        System.out.println("El número mayor es: " + mayor);
	        
	        String frase = "Hola " + "mundo " + "Java";
	        System.out.println(frase);
	        
	        int multiplicacionResultado = num1 * num2;
	        System.out.println("Multiplicación almacenada: " + multiplicacionResultado);
	        
	        double promedio = promedio(8, 6);
	        System.out.println("Promedio: " + promedio);
	    }

	    public static void saludar() {
	        System.out.println("¡Hola!");
	    }

	    public static void saludar(String nombre) {
	        System.out.println("¡Hola, " + nombre + "!");
	    }

	    public static void imprimirNumero(int numero) {
	        System.out.println("Número recibido: " + numero);
	    }

	    public static int suma(int a, int b) {
	        return a + b;
	    }

	    public static int suma(int a, int b, int c) {
	        return a + b + c;
	    }

	    public static double multiplicar(double a, double b) {
	        return a * b;
	    }

	    public static int cuadrado(int numero) {
	        return numero * numero;
	    }

	    public static double promedio(int a, int b) {
	        return (a + b) / 2.0;
	    }
	}
