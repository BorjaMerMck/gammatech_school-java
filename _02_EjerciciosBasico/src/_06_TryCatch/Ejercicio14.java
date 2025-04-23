package _06_TryCatch;

import java.util.Scanner;

public class Ejercicio14 {
    private static double saldo = 1000.0;

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Dinero  a retirar: ");
			double monto = scanner.nextDouble();
			
			try {
			    if (monto > saldo) 
			        throw new SaldoInsuficienteException("Saldo insuficiente.");
			    saldo -= monto;
			    System.out.println("Retiro exitoso...\n" + "Dispones este Saldo " + saldo);
			} catch (SaldoInsuficienteException e) {
			    System.out.println(e.getMessage());
			}
		}
    }
}