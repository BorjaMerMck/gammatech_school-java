package model;

import enums.Arma;
import enums.Raza;

public class Personaje extends Jugador  {
	private double exp;
	protected double vida;
	protected Arma arma;
	protected Raza raza;
	protected double dinero;

	protected boolean armadura = false;
	


	public Personaje(double exp, double vida, Arma arma, Raza raza, double dinero, boolean armadura) {
		super();
		this.exp = exp;
		this.vida = vida;
		this.arma = arma;
		this.raza = raza;
		this.dinero = dinero;
		this.armadura = armadura;
	}

	public double getDinero() {
		return dinero;
	}

	public void setDinero(double dinero) {
		this.dinero = dinero;
	}
	
	public void mostrarEstado() {
	    System.out.println("Nombre: " + getName());
	    System.out.println("Edad: " + getEdad());
	    System.out.println("Sexo: " + getSexo());
	    System.out.println("Raza: " + raza);
	    System.out.println("Vida: " + vida);
	    System.out.println("Experiencia: " + exp);
	    System.out.println("Arma: " + arma);
	    System.out.println("Dinero: " + dinero);
	    System.out.println("Armadura equipada: " + (armadura ? "Sí" : "No"));
	}
	
}
