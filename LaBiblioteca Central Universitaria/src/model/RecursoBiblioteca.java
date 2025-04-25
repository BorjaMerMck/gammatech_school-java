package model;

import enums.EstadoRecurso;

/**
 * 
 * @author Borja Merchan Mckkenna 
 * @version 0,1;
 *
 */
public abstract class RecursoBiblioteca {

	private String id, titulo;
	private EstadoRecurso estado;
	
	
	public RecursoBiblioteca(String id, String titulo){
		this.id = id;
		this.titulo = titulo;
		this.estado = EstadoRecurso.DISPONIBLE;
		
		
	}


	public String getId() {
		return id;
	}


	public String getTitulo() {
		return titulo;
	}


	public EstadoRecurso getEstado() {
		return estado;
	}
	
	public void setEstado (EstadoRecurso estado) {
		this.estado = estado;
	}
	
	/**
	 * Retorna la descripción completa del recurso de la biblioteca.
	 * Este método debe ser implementado en las clases:
	 * {@link Libro}, {@link Revista}, {@link DVD}.
	 *
	 * @return Descripción textual del recurso.
	 */
	
	public abstract String descripcion();
		
	
	
}
