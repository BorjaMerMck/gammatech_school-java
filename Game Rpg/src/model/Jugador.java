package model;

import java.util.Scanner;

import enums.Sexo;

public class Jugador {

	private String name;
	protected Sexo sexo;
	protected int edad;

	public Jugador( ) {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Sexo getSexo() {
		return sexo;
	}

	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

public void introduccion(Scanner sc) {
    System.out.println("=== Introducción del juego ===");

    System.out.print("Introduce el nombre de tu personaje: ");
    this.setName(sc.nextLine());

    System.out.print("Introduce la edad de tu personaje: ");
    while (!sc.hasNextInt()) {
        System.out.println("Edad inválida, intenta de nuevo:");
        sc.next();
    }
    this.setEdad(sc.nextInt());
    sc.nextLine(); 

    System.out.println("Sexo (1. Masculino, 2. Femenino, 3. Otro):");
    int opcion;
    do {
        System.out.print("Tu elección: ");
        opcion = sc.nextInt();
        switch (opcion) {
            case 1 -> this.setSexo(Sexo.Masculino);
            case 2 -> this.setSexo(Sexo.Femenino);
            case 3 -> this.setSexo(Sexo.Otro);
            default -> System.out.println("Opción no válida.");
        }
    } while (opcion < 1 || opcion > 3);
}

}
