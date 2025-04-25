package model;

import enums.EstadoRecurso;


public class Libro extends RecursoBiblioteca {

	private String autor;
	
	public Libro(String id, String titulo, String autor) {
		super(id, titulo);
		this.autor = autor;
	}

    @Override
    public String descripcion() {
    	
        return Colors.Azul + "Libro: " + titulo  +
        		" (ID: " + id + 
        		Colors.PorDefecto + "), Autor: " + autor +
        		", Estado: " + (estado.equals(EstadoRecurso.DISPONIBLE) ? Colors.Amarrillo + estado : Colors.Rojo + estado);
    }
}