package EjerciciosRelacionesVisbilidad._05_GestiónDeTareasPendientes;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class Tarea {
	private String descripcion;
	private String fechaDeVencimiento;
	private  Estado estado;
	
	
	public Tarea(String descripcion, String fechaDeVencimiento, String estado) {
		super();
		
		
		  try {
		        this.estado = Estado.valueOf(estado); // Convertir String a Enum
		    } catch (IllegalArgumentException e) {
		        System.err.println("Estado inválido: " + estado + ". Se asigna 'pendiente' por defecto.");
		        this.estado = Estado.pendiente;
		    }
		/** Sin enum
		 	this.estado.equalsIgnoreCase(estado);
			
			if(!this.estado.equals("pendiente") && this.estado.equals("EnProceso") && this.estado.equals("Completada")) {
	            throw new IllegalArgumentException("tienes que Introducir pediente, EnProceso, Completada");			
			}
		
		 */
		this.descripcion = descripcion;
		this.fechaDeVencimiento = fechaDeVencimiento;
	}


	
	
	public String obtenerDescripcion() {
		return this.descripcion;
	}
	
	
	/*
	public boolean marcarComoCompletada() {
	}
	 */

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public void obtenerEstado() {
		Estado[] estados = Estado.values();

		for (Estado estado : estados) {
		    System.out.println(estado);
		}
	}
	
	public boolean marcarComoCompletada() {

		if(Estado.Completada == this.estado) {
			System.out.println("La tarea ya ha sido completada");
			return false;
		}
		
		this.estado = Estado.Completada;
		System.out.println("La tarea ha sido completada con exito...");
		return true;
	}

	public String obtenerFechaVencimiento() {
	    String regex = "^(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[0-2])/\\d{4}$";

	    String fecha = this.getfechaDeVencimiento(); 

	    if (fecha.matches(regex)) {
	        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	        try {
	            LocalDate.parse(fecha, formatter);
	            return fecha;
	        } catch (DateTimeParseException e) {
	            System.out.println("La fecha tiene formato válido pero no es una fecha real.");
	        }
	    } else {
	        System.out.println("Formato de fecha inválido. Debe ser dd/MM/yyyy.");
	    }

	    return null; 
	}

	public void setFechaDeVencimiento(String fechaDeVencimiento) {
		this.fechaDeVencimiento = fechaDeVencimiento;
	}
	
	
	public  String getfechaDeVencimiento() {
		return fechaDeVencimiento;
	}

	public Estado getEstado() {
		return estado;
	}


	public void setEstado(Estado estado) {
		this.estado = estado;
	}
	
	
	

}
