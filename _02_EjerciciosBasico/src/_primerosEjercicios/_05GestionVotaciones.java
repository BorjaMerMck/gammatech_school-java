package _primerosEjercicios;

import java.util.Scanner;

public class _05GestionVotaciones {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("¿Cuántos votantes hay?");
        int numDeVotantes = sc.nextInt();
        int opcion =0;
        
        int[] numVotos = new int[3];

        if (numDeVotantes <= 0) {
            System.out.println("El número de votantes debe ser mayor que 0.");
            return; 
        }

        String[] votantes = new String[numDeVotantes];
        sc.nextLine();  

        for (int i = 0; i < numDeVotantes; i++) {
            System.out.println("Dime el nombre del candidato " + (i + 1) + ": ");
            votantes[i] = sc.nextLine();
            
          
        	   
         
            switch(opcion) {
            case 1:

            	numVotos[0]++;
            case 2:
            	numVotos[1]++;
            case 3:
            	numVotos[2]++;
            default:
          }
        }
            
        
   
        
        System.out.println("votantes registrados:");
        for (int i = 0; i < votantes.length; i++) {
            System.out.println((i + 1) + ". " + votantes[i]);
        }

        sc.close(); 
    }
}