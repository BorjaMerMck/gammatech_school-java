package _07_Ficheros;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class PracticarConFicheros {

    // Ejercicio 1: Crear archivo con saludo personalizado
    // Debe indicar si el archivo se ha creado o no.
    // Ejemplo: Hola NOMBRE. Bienvenido.
	  public static void ejercicio1(String nombre) {

	        String ruta = "C:\\Users\\borjaa\\Documents\\cursos\\gammatech_school\\Practicas\\Java\\GAMMATECH\\_Ejercicios\\_05_tryCatchFicheros\\Saludo.txt";
	        try {
		        FileWriter saludo = new FileWriter(ruta);

	            saludo.write("Hola " + nombre + ". Bienvenido.");
	            
	            
	            saludo.close();

	            System.out.println("El archivo 'Saludo.txt' se ha creado correctamente.");
	        } catch (IOException e) {
	            System.err.println("Error: No se pudo crear el archivo o escribir en él.");
	        }finally {
	        	
	        	System.out.println("Sigiente Ejercicio\n");
	        	
	        }
	        
	    }

    	
    	
    

    // Ejercicio 2: Añadir líneas a un diario personal
    // Recuerda que no quieres reescribir el archivo. (true...)
    public static void ejercicio2() {
        String ruta = "C:\\Users\\borjaa\\Documents\\cursos\\gammatech_school\\Practicas\\Java\\GAMMATECH\\_Ejercicios\\_05_tryCatchFicheros\\diario.txt";
        Scanner sc = new Scanner (System.in);
        
        try {
        	FileWriter diario = new FileWriter(ruta, true);
        	System.out.println("Dime lo que quieres poner el en diario");
        	String texto = sc.nextLine();
        	diario.write(texto + "\n");
        	
        	sc.close();
        	diario.close();

        	
        }catch(IOException e) {
            System.err.println("Error: No se pudo crear el archivo o escribir en él.");
        
        }finally {
        	
        	System.out.println("Sigiente Ejercicio\n");
        	
        }

    }

    // Ejercicio 3: Eliminar archivo de prueba
    // Crea un archivo que se llame borrar.txt que contenga al menos una frase de texto
    // Elimina el archivo que acabas de crear.
    public static void ejercicio3() {
    	
        String ruta = "C:\\Users\\borjaa\\Documents\\cursos\\gammatech_school\\Practicas\\Java\\GAMMATECH\\_Ejercicios\\_05_tryCatchFicheros\\borrar.txt";
        
        File file = new File(ruta);
        
        try {
        	   if (!file.exists()) {
               		System.out.println("no esta creado");
               		file.createNewFile();
               }
        	   System.out.println("Se esta eliminando");
        	   
        	   file.delete();
        	  
        }catch(IOException e){
            System.err.println("Error: No se pudo crear el archivo o escribir en él.");

        }

        
     
    }

    // Ejercicio 4: Menú interactivo para manejar ficheros
    /*
    Mostrar un menú con las opciones:
        1.Crear archivo
        2.Escribir texto
        3.Añadir más texto
        4.Ver contenido
        5.Eliminar archivo
    Usar switch y try-catch para manejar errores.
    En la opción 1: simplemente crea el archivo.
    En la opción 2: escribe texto en él.
    En la opción 3: cuidado, no quieres reescribir el archivo, quieres añadir texto.
    En la opción 4: lectura de archivo (hasNextLine...)
    En la opción 5: eliminar archivo. 
    */
    public static void ejercicio4() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Crear archivo\n2. Escribir texto\n3. Añadir texto\n4. Ver contenido\n5. Eliminar archivo");
        System.out.print("Elige una opción: ");
        int opcion = scanner.nextInt();
        scanner.nextLine(); // limpiar buffer

    }

    // Ejercicio 5: Copiar contenido de un archivo a otro
    public static void ejercicio5() {

    }

    // Ejercicio 6: Crear archivo con varios nombres (nombre1, nombre2, nombre3)
    public static void ejercicio6() {

    }

    // Ejercicio 7: Leer archivo línea por línea con número de línea
    // ejemplo: Linea X: texto_de_la_línea
    public static void ejercicio7() {

    }

    // Ejercicio 8: Borrar contenido del archivo pero sin eliminar el archivo
    public static void ejercicio8() {

    }

    // Ejercicio 9: Contador de líneas
    public static void ejercicio9() {

    }

    // Método principal para probar ejercicios
    public static void main(String[] args) {
        // Llama aquí al ejercicio que quieras probar
    	
        ejercicio1("borja");
        ejercicio2();
         ejercicio3();
        //ejercicio4();
        //ejercicio5();
        //ejercicio6();
        //ejercicio7();
        //ejercicio8();
        // ejercicio9();

    }
}
