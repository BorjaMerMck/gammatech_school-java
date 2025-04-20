package _03_MetodosYCondiciones;

import java.util.Scanner;

public class D_Condiciones {
    public static Scanner sc = new Scanner(System.in);

	public static void ejercicio1(int numero1) {
		System.out.println((numero1 > 0) ? "es positivo" : "es negativo");					
	}
	
	public static void ejerciocio2(int numero1) {
		System.out.println((numero1 < 0) ? "es negativo" : "es positivo");
	}
	
	public static void ejercico3(int numero1) {
		System.out.println((numero1 == 0) ? "es cero": "No es cero");
	}

	public static void ejercicio4(int numero1) {
		System.out.println((numero1 % 2 == 0) ? "es par" : "es impar");
	}
	
	public static void ejercicio5(int numero1) {
		System.out.println((numero1 % 3 != 0) ? "es impar" : "es par");
	}
	
	public static void ejercicio6(int numero1) {
		System.out.println((numero1 >= 18) ? "es mayor de edad" : "Es menor de edad");
	}
	
	public static void ejercicio7(int numero1,int numero2) {
		System.out.println((numero1 == numero2) ? "Es el mismo numero" : "Son numeros diferentes");
	}
	
	public static void ejercicio8(int numero1) {
		System.out.println((numero1 >= 0 && numero1 <= 10) ? "esta en el rango del 0 al 10 ": "no esta en el rango 1 a 10");
	}
	
	public static void ejercicio9(char letra) {
		System.out.println((letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') ? "es una vocal" : "no es una vocal");
	}
	
	public static void ejercicio10(int year) {
		if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " es un año bisiesto.");
        } else {
            System.out.println(year + " no es un año bisiesto.");
        }
	}
	
	public static void ejercicio11(int numero) {
		if(numero > 0) {
			System.out.println("Es positivo");
		}else if (numero == 0) {
			System.out.println("el numero es cero");
		}else {
			System.out.println("el numero es negativo");
		}
	}

	public static void ejercicio12(int edad, boolean entrada) {
        System.out.println((edad >= 18 && entrada ) ? "tienen ambas" : "No cumple con los requisitos " + edad + " " + entrada);
	}
	
	public static void ejercicio13(int numero) {
		if (numero % 3 == 0 && numero % 5 == 0) {
			System.out.println("es divisible por 5 y por 3");
		}else if (numero % 5 == 0) {
			System.out.println("es divisible por 5");
		}else if (numero % 3 == 0){
			System.out.println("es divisible por 3");
		}else {
			System.out.println("no es divisible ni por 3 ni por 5");
		}
	}
	
	public static void ejercicio14(int numero1) {
	    System.out.println((numero1 < 1 || numero1 > 10)  ? "El número NO está en el rango de 1 a 10" : "El número está en el rango de 1 a 10");
	}
	
	public static void ejercicio15A(int numero1,int numero2,int numero3) {
		if (numero1>numero2 && numero1 > numero3) {
			System.out.println("el " + numero1 + " es mayor que los demas");
		}else if (numero2 >numero1 && numero2 > numero3) {
			System.out.println("el " + numero2 + " es mayor que los demas ");
		}else if (numero3 > numero1 && numero3 > numero2) {
			System.out.println("el " + numero3 + " es mayor que los demas ");
		}else {
			System.out.println("son iguales");
		}
	}
	public static void ejercicio15B(int num1, int num2, int num3) {
	    int mayor = Math.max(num1, Math.max(num2, num3));
	    System.out.println("El número mayor es: " + mayor);
	}
	public static void ejercicio16(int edad) {
	    System.out.println(edad >= 18 ? "Puedes votar" : "No puedes votar");
	}

	public static void ejercicio17(int num) {
	    if (num > 0) {
	        System.out.println((num % 2 == 0) ? "Positivo y par" : "Positivo e impar");
	    } else if (num < 0) {
	        System.out.println((num % 2 == 0) ? "Negativo y par" : "Negativo e impar");
	    } else {
	        System.out.println("El número es cero");
	    }
	}
	
	public static void ejercicio18(int edad, boolean pagaExtra) {
	    System.out.println((edad > 21 || pagaExtra) ? "Acceso VIP concedido" : "Acceso VIP denegado");
	}

	public static void ejercicio19(boolean var1, boolean var2) {
	    System.out.println((var1 && var2) ? "Ambos son verdaderos" : "Al menos uno es falso");
	}
	
	public static void ejercicio20(int nota) {
	    if (nota >= 9) {
	        System.out.println("Excelente");
	    } else if (nota >= 8) {
	        System.out.println("Muy bien");
	    } else if (nota >= 6) {
	        System.out.println("Bien");
	    } else if (nota >= 5) {
	        System.out.println("Aprobado");
	    } else {
	        System.out.println("Suspenso");
	    }
	}

	public static void ejercicio21(char letra) {
	    System.out.println(Character.isUpperCase(letra) ? "Es mayúscula" : "No es mayúscula");
	}

	public static void ejercicio22(char letra) {
	    System.out.println(Character.isLowerCase(letra) ? "Es minúscula" : "No es minúscula");
	}

	public static void ejercicio23(String pass1, String pass2) {
	    System.out.println(pass1.equals(pass2) ? "Las contraseñas coinciden" : "Las contraseñas no coinciden");
	}

	public static void ejercicio24(int num) {
	    if ((num >= 1 && num <= 10) || (num >= 20 && num <= 30) || (num >= 40 && num <= 50)) {
	        System.out.println("El número está dentro de uno de los rangos.");
	    } else {
	        System.out.println("El número NO está dentro de los rangos.");
	    }
	}


    public static void MostrarEjercicios() {
        int opcion;
        
        do {
            System.out.println("\n=== MENÚ DE EJERCICIOS ===");
            System.out.println("1. ejercicio1(2)");
            System.out.println("2. ejercicio2(-23)");
            System.out.println("3. ejercicio3(0)");
            System.out.println("4. ejercicio4(2)");
            System.out.println("5. ejercicio5(5)");
            System.out.println("6. ejercicio6(14)");
            System.out.println("7. ejercicio7(23,23)");
            System.out.println("8. ejercicio8(12)");
            System.out.println("9. ejercicio9('w')");
            System.out.println("10. ejercicio10(1900)");
            System.out.println("11. ejercicio11(32)");
            System.out.println("12. ejercicio12(18,false)");
            System.out.println("13. ejercicio13(15)");
            System.out.println("14. ejercicio14(1)");
            System.out.println("15A. ejercicio15A(32,32,32)");
            System.out.println("15B. ejercicio15B(23,321,23)");
            System.out.println("16. ejercicio16(20)");
            System.out.println("17. ejercicio17(-7)");
            System.out.println("18. ejercicio18(22, false)");
            System.out.println("19. ejercicio19(true, false)");
            System.out.println("20. ejercicio20(7)");
            System.out.println("21. ejercicio21('A')");
            System.out.println("22. ejercicio22('g')");
            System.out.println("23. ejercicio23(\"clave123\", \"clave123\")");
            System.out.println("24. ejercicio24(60)");
            System.out.println("0. Salir");
            System.out.print("Seleccione un ejercicio (0-24): ");
            
            opcion = sc.nextInt();
            
            switch(opcion) {
                case 1: ejercicio1(2); break;
                case 2: ejerciocio2(-23); break;
                case 3: ejercico3(0); break;
                case 4: ejercicio4(2); break;
                case 5: ejercicio5(5); break;
                case 6: ejercicio6(14); break;
                case 7: ejercicio7(23, 23); break;
                case 8: ejercicio8(12); break;
                case 9: ejercicio9('w'); break;
                case 10: ejercicio10(1900); break;
                case 11: ejercicio11(32); break;
                case 12: ejercicio12(18, false); break;
                case 13: ejercicio13(15); break;
                case 14: ejercicio14(1); break;
                case 15: 
                    System.out.println("15A o 15B? (A/B)");
                    sc.nextLine();
                    String subOp = sc.nextLine();
                    if(subOp.equalsIgnoreCase("A")) ejercicio15A(32, 32, 32);
                    else if(subOp.equalsIgnoreCase("B")) ejercicio15B(23, 321, 23);
                    else System.err.println("Opción no válida");
                    break;
                case 16: ejercicio16(20); break;
                case 17: ejercicio17(-7); break;
                case 18: ejercicio18(22, false); break;
                case 19: ejercicio19(true, false); break;
                case 20: ejercicio20(7); break;
                case 21: ejercicio21('A'); break;
                case 22: ejercicio22('g'); break;
                case 23: ejercicio23("clave123", "clave123"); break;
                case 24: ejercicio24(60); break;
                case 0: System.out.println("Saliendo..."); break;
                default: System.out.println("Opción no válida");
            }
            
            if(opcion != 0) {
                System.out.print("\nPresione Enter para continuar...");
                sc.nextLine(); 
                sc.nextLine(); 
            }
            
        } while(opcion != 0);
        sc.close();
    }
		
	
	public static void main(String[] args) {
		
		
		MostrarEjercicios();
	}
}
