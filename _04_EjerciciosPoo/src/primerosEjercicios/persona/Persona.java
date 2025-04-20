package primerosEjercicios.persona;

public class Persona {
	/*
	 * =================
	 * =   ENUNCIADO   =
	 * =================
	 * 
	 * Crea una clase Persona con atributos básicos:
	 * nombre, edad, peso
	 * 
	 * Haz un constructor para inicializar dichos atributos.
	 * 
	 * Haz otra clase para el método main.
	 * Instancia un objeto de la clase persona.
	 * Muestra sus atributos.
	 */
	private String nombre;
	private int edad;
	private double peso;
	
	public Persona(String nombre, int edad, double peso) {
		this.nombre = nombre;
		this.edad = edad;
		this.peso = peso;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", peso=" + peso + "]";
	}
	
	
	
	
	
	
}
