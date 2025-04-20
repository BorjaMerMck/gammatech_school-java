package primerosEjercicios.Coche;
import java.util.Scanner;

public class Coche {
	
	
	private int cantidadVentanas;
	private int cantidadPuertas;
	private int cantidadRuedas;
	private double velocidad;
	boolean isCirculando;
	boolean isFrenado =true;
	boolean isMarcha;
	
	
	public Coche() {
	}
	
	
	public Coche(int cantidadVentanas, int cantidadPuertas, int cantidadRuedas, double velocidad, boolean isCirculando,
			boolean isFrenado, boolean isMarcha) {
		this.cantidadVentanas = cantidadVentanas;
		this.cantidadPuertas = cantidadPuertas;
		this.cantidadRuedas = cantidadRuedas;
		this.velocidad = velocidad;
		this.isCirculando = isCirculando;
		this.isFrenado = isFrenado;
		this.isMarcha = isMarcha;
	}

	public int getCantidadVentanas() {
		return cantidadVentanas;
	}

	public void setCantidadVentanas(int cantidadVentanas) {
		this.cantidadVentanas = cantidadVentanas;
	}

	public int getCantidadPuertas() {
		return cantidadPuertas;
	}

	public void setCantidadPuertas(int cantidadPuertas) {
		this.cantidadPuertas = cantidadPuertas;
	}

	public int getCantidadRuedas() {
		return cantidadRuedas;
	}

	public void setCantidadRuedas(int cantidadRuedas) {
		this.cantidadRuedas = cantidadRuedas;
	}

	public double getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(double velocidad) {
		this.velocidad = velocidad;
	}

	public boolean isCirculando() {
		return isCirculando;
	}

	public void setCirculando(boolean isCirculando) {
		this.isCirculando = isCirculando;
	}

	public boolean isFrenado() {
		return isFrenado;
	}

	public void setFrenado(boolean isFrenado) {
		this.isFrenado = isFrenado;
	}

	public boolean isMarcha() {
		return isMarcha;
	}

	public void setMarcha(boolean isMarcha) {
		this.isMarcha = isMarcha;
	}
	
	public void arrancar() {
		
		if(isMarcha) {
			System.out.println("ya esta en marcha\n");
			return;
		}
		
		System.out.println("se esta bajando el freno de mano");
		System.out.println("Se esta poniendo en marcha...");
		this.setFrenado(false);
		this.setMarcha(true);
		this.setCirculando(true);
	
		 acelerar();
	}
	
	public void acelerar() {
		if (!isMarcha) {
			this.setFrenado(isFrenado);
			 System.out.println("El coche no está en marcha. No se puede acelerar.");
			 return;
		}
		
		if (this.velocidad >=120) {
			System.out.println("Recuerde que esta superando el limite de velocidad ");
		}
		this.setVelocidad(this.getVelocidad() +5);
	    System.out.println("Velocidad actual: " + this.getVelocidad());
	}

	public void decelerar() {
		if (!isMarcha) {
			 System.out.println("El coche no está en marcha. No se puede decelerar.");
			 return;
		}
		
		if (this.velocidad <= 0) {
			System.out.println("El coche ya está detenido. No puede ir a menos de 0 km/h.");
			return;
		}
		
		this.setVelocidad(Math.max(0, this.getVelocidad() - 5));
		this.setVelocidad(this.getVelocidad() -5);
	    System.out.println("Velocidad actual: " + this.getVelocidad());

	}
	

	public void frenar() {
		
		System.out.println("Esta Frenando..");
		this.setVelocidad(0);
		this.setMarcha(false);
		this.setCirculando(false);
		this.setFrenado(true);
		System.out.println("Subiendo el freno de mano");
		
	
	}
	
	
	public void infoDelCoche() {
		
	    System.out.println("El coche:\n"
	            + "\tInformación de ventanas: " + this.getCantidadVentanas() + "\n"
	            + "\tInformación de ruedas: " + this.getCantidadRuedas() + "\n"
	            + "\tInformación de puertas: " + this.getCantidadPuertas() + "\n"
	            + "\tVelocidad: " + this.getVelocidad() + " km/h\n"
	            + "\t¿Está en marcha?: " + (this.isMarcha ? "Sí" : "No") + "\n"
	            + "\t¿Está frenado?: " + (this.isFrenado ? "Sí" : "No") + "\n"
	            + "\t¿Está circulando?: " + (this.isCirculando ? "Sí" : "No\n1"));
	}
	
	public void estados() {
	    Scanner sc = new Scanner(System.in);
	    int opcion;

	    do {
	    	infoDelCoche();
	        System.out.println("========== MENÚ ==========");
	        System.out.println("1. Arrancar");
	        System.out.println("2. Acelerar");
	        System.out.println("3. Frenar");
	        System.out.println("4. Decelerar");
	        System.out.println("5. Salir");
	        System.out.print("Dime una opción: ");
	        opcion = sc.nextInt();

	        switch (opcion) {
	            case 1:
	                arrancar();
	                break;
	            case 2:
	                acelerar();
	                break;
	            case 3:
	                frenar(); // Asegúrate de tener este método
	                break;
	            case 4:
	                decelerar();
	                break;
	            case 5:
	                System.out.println("Saliendo del menú...");
	                break;
	            default:
	                System.out.println("Opción no válida");
	        }

	    } while (opcion != 5);
	}
		

}
