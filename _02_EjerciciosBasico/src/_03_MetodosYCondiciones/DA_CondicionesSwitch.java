package _03_MetodosYCondiciones;

import java.util.Scanner;

public class DA_CondicionesSwitch {
    
    public static Scanner sc = new Scanner(System.in);
    
    // 1. Indica numéricamente (del 1 al 7) el día de la semana
    public static void ejercicio1() {
        System.out.print("Ingrese un número del 1 al 7: ");
        int numero = sc.nextInt();
        
        switch (numero) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miércoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sábado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("Número inválido");
        }
    }

    // 2. Calificación con letra
    public static void ejercicio2() {
        System.out.print("Ingrese calificación (A, B, C o D): ");
        String calificacion = sc.next().toUpperCase();
        
        switch (calificacion) {
            case "A":
                System.out.println("Excelente");
                break;
            case "B":
                System.out.println("Notable");
                break;
            case "C":
                System.out.println("Aprobado");
                break;
            case "D":
                System.out.println("Insuficiente");
                break;
            default:
                System.out.println("Calificación inválida");
        }
    }

    // 3. Menú de opciones para un juego
    public static void ejercicio3() {
        System.out.println("1. Nueva partida");
        System.out.println("2. Cargar partida");
        System.out.println("3. Salir");
        System.out.print("Seleccione una opción: ");
        int opcion = sc.nextInt();
        
        switch (opcion) {
            case 1:
                System.out.println("Seleccionaste Nueva partida");
                break;
            case 2:
                System.out.println("Seleccionaste Cargar partida");
                break;
            case 3:
                System.out.println("Seleccionaste Salir");
                break;
            default:
                System.out.println("Opción inválida");
        }
    }

    // 4. Estación del año
    public static void ejercicio4() {
        System.out.print("Ingrese estación (primavera, verano, otoño, invierno): ");
        String estacion = sc.next().toLowerCase();
        
        switch (estacion) {
            case "primavera":
            case "verano":
            case "otoño":
            case "invierno":
                System.out.println("Estás en " + estacion);
                break;
            default:
                System.out.println("Estación inválida");
        }
    }

    // 5. Tipo de figura geométrica
    public static void ejercicio5() {
        System.out.print("Ingrese número de lados (3-6): ");
        int lados = sc.nextInt();
        
        switch (lados) {
            case 3:
                System.out.println("triángulo");
                break;
            case 4:
                System.out.println("cuadrado o rectángulo");
                break;
            case 5:
                System.out.println("pentágono");
                break;
            case 6:
                System.out.println("hexágono");
                break;
            default:
                System.out.println("Número de lados inválido");
        }
    }

    // 6. Tipo de moneda
    public static void ejercicio6() {
        System.out.print("Ingrese código de moneda (USD, EUR, GBP, JPY): ");
        String moneda = sc.next().toUpperCase();
        
        switch (moneda) {
            case "USD":
                System.out.println("Dolar");
                break;
            case "EUR":
                System.out.println("Euro");
                break;
            case "GBP":
                System.out.println("Libra");
                break;
            case "JPY":
                System.out.println("Yen");
                break;
            default:
                System.out.println("Moneda desconocida");
        }
    }

    // 7. Número de mes
    public static void ejercicio7() {
        System.out.print("Ingrese número de mes (1-12): ");
        int mes = sc.nextInt();
        
        switch (mes) {
            case 1: System.out.println("Enero"); break;
            case 2: System.out.println("Febrero"); break;
            case 3: System.out.println("Marzo"); break;
            case 4: System.out.println("Abril"); break;
            case 5: System.out.println("Mayo"); break;
            case 6: System.out.println("Junio"); break;
            case 7: System.out.println("Julio"); break;
            case 8: System.out.println("Agosto"); break;
            case 9: System.out.println("Septiembre"); break;
            case 10: System.out.println("Octubre"); break;
            case 11: System.out.println("Noviembre"); break;
            case 12: System.out.println("Diciembre"); break;
            default: System.out.println("Mes inválido");
        }
    }

    // 8. Clasificación por edad
    public static void ejercicio8() {
        System.out.print("Ingrese edad: ");
        int edad = sc.nextInt();
        
        switch (edad) {
            case 3: case 4: case 5:
                System.out.println("Infantil");
                break;
            case 6: case 7: case 8: case 9: case 10: case 11:
                System.out.println("Primaria");
                break;
            case 12: case 13: case 14: case 15:
                System.out.println("ESO");
                break;
            case 16: case 17:
                System.out.println("Bachillerato");
                break;
            case 18: case 19: case 20: case 21:
                System.out.println("Universidad");
                break;
            default:
                if (edad >= 22) {
                    System.out.println("Persona formada");
                } else {
                    System.out.println("Edad no clasificada");
                }
        }
    }

    // 9. Letra del DNI
    public static void ejercicio9() {
        System.out.print("Ingrese número de DNI (sin letra): ");
        int dni = sc.nextInt();
        int resto = dni % 23;
        
        switch (resto) {
            case 0: System.out.println("T"); break;
            case 1: System.out.println("R"); break;
            case 2: System.out.println("W"); break;
            case 3: System.out.println("A"); break;
            case 4: System.out.println("G"); break;
            case 5: System.out.println("M"); break;
            case 6: System.out.println("Y"); break;
            case 7: System.out.println("F"); break;
            case 8: System.out.println("P"); break;
            case 9: System.out.println("D"); break;
            case 10: System.out.println("X"); break;
            case 11: System.out.println("B"); break;
            case 12: System.out.println("N"); break;
            case 13: System.out.println("J"); break;
            case 14: System.out.println("Z"); break;
            case 15: System.out.println("S"); break;
            case 16: System.out.println("Q"); break;
            case 17: System.out.println("V"); break;
            case 18: System.out.println("H"); break;
            case 19: System.out.println("L"); break;
            case 20: System.out.println("C"); break;
            case 21: System.out.println("K"); break;
            case 22: System.out.println("E"); break;
            default: System.out.println("Error en cálculo");
        }
    }

    // 10. Estado de un semáforo
    public static void ejercicio10() {
        System.out.print("Ingrese color del semáforo (rojo, amarillo, verde): ");
        String color = sc.next().toLowerCase();
        
        switch (color) {
            case "rojo":
                System.out.println("Detenerse");
                break;
            case "amarillo":
                System.out.println("Precaución");
                break;
            case "verde":
                System.out.println("Avanzar");
                break;
            default:
                System.out.println("Color inválido");
        }
    }
    
    public static void mostrarEjercicios() {
    	 Scanner sc = new Scanner(System.in);
    	    int opcion;
    	    
    	    do {
    	        System.out.println("\n--- MENÚ DE EJERCICIOS ---");
    	        System.out.println("1. Días de la semana");
    	        System.out.println("2. Calificaciones con letra");
    	        System.out.println("3. Menú de juego");
    	        System.out.println("4. Estación del año");
    	        System.out.println("5. Figuras geométricas");
    	        System.out.println("6. Tipos de moneda");
    	        System.out.println("7. Meses del año");
    	        System.out.println("8. Clasificación por edad");
    	        System.out.println("9. Letra del DNI");
    	        System.out.println("10. Semáforo");
    	        System.out.println("0. Salir");
    	        System.out.print("Seleccione una opción (0-10): ");
    	        
    	        opcion = sc.nextInt();
    	        
    	        switch(opcion) {
    	            case 1:
    	                ejercicio1();
    	                break;
    	            case 2:
    	                ejercicio2();
    	                break;
    	            case 3:
    	                ejercicio3();
    	                break;
    	            case 4:
    	                ejercicio4();
    	                break;
    	            case 5:
    	                ejercicio5();
    	                break;
    	            case 6:
    	                ejercicio6();
    	                break;
    	            case 7:
    	                ejercicio7();
    	                break;
    	            case 8:
    	                ejercicio8();
    	                break;
    	            case 9:
    	                ejercicio9();
    	                break;
    	            case 10:
    	                ejercicio10();
    	                break;
    	            case 0:
    	                System.out.println("Saliendo del programa...");
    	                break;
    	            default:
    	                System.out.println("Opción no válida. Intente nuevamente.");
    	        }
    	        
    	        if(opcion != 0) {
    	            System.out.print("\nPresione Enter para continuar...");
    	            sc.nextLine(); // Limpiar buffer
    	            sc.nextLine(); // Esperar Enter
    	        }
    	        
    	    } while(opcion != 0);
    	    
    	    sc.close();
    	    
    	}
    

    public static void main(String[] args) {
    	mostrarEjercicios();
    }
}