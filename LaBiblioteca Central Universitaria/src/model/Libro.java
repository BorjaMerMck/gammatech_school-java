package model;

import enums.EstadoRecurso;
/**
 * Clase que representa un libro dentro de la biblioteca.
 * Extiende {@link RecursoBiblioteca}.
 * 
 * @author Borja Merchan Mckenna
 * @version 1.0
 * @since 1.0
 */

public class Libro extends RecursoBiblioteca {

	private String autor;
	 /**
     * Constructor para inicializar un libro con su ID, título y autor.
     *
     * @param id Identificador del libro.
     * @param titulo Título del libro.
     * @param autor Autor del libro.
     */
	public Libro(String id, String titulo, String autor) {
		super(id, titulo);
		this.autor = autor;
	}

    /**
     * Genera la descripción detallada del libro, Con Colores para mayor visibilidad.
     *
     * @return Descripción del libro.
     */
	
    @Override
    public String descripcion() {
    	
        return Colors.Azul + "Libro: " + titulo  +
        		" (ID: " + id + 
        		Colors.PorDefecto + "), Autor: " + autor +
        		", Estado: " + (estado.equals(EstadoRecurso.DISPONIBLE) ? Colors.Amarrillo + estado : Colors.Rojo + estado);
    }
}