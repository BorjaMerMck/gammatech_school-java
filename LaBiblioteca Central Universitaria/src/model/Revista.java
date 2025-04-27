package model;
import enums.EstadoRecurso;
import model.Colors;
/**
 * Clase que representa una revista dentro de la biblioteca.
 * Extiende {@link RecursoBiblioteca}.
 * 
 * @author Borja
 * @version 1.0
 * @since 1.0
 */

public class Revista  extends RecursoBiblioteca  {
	
	private int numeroEdicion;

	 /**
     * Constructor para inicializar una revista con su ID, título y número de edición.
     *
     * @param id Identificador de la revista.
     * @param titulo Título de la revista.
     * @param numeroEdicion Número de edición de la revista.
     */
	
	public Revista(String id, String titulo, int numeroEdicion) {
	    super(id, titulo);
	    this.numeroEdicion = numeroEdicion;
	}
	
	  /**
     * Genera la descripción detallada de la revista,  Con Colores para mayor visibilidad.
     *
     * @return Descripción de la revista.
     */
    @Override
    public String descripcion() {
        return Colors.Azul +"Revista: " +  titulo + 
        		" (ID: " + id + Colors.PorDefecto +
        		" ), Edición: " + numeroEdicion +
        		", Estado: " + (estado.equals(EstadoRecurso.DISPONIBLE) ? Colors.Amarrillo + estado : Colors.Rojo + estado);

    }

	
	
}
