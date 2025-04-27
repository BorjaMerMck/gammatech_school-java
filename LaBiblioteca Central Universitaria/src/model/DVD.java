package model;

import enums.EstadoRecurso;
/**
 * Clase que representa un DVD dentro de la biblioteca.
 * Extiende {@link RecursoBiblioteca}.
 * 
 * @author Borja Merchan Mckenna 
 * @version 1.0
 * @since 1.0
 */
public class DVD extends RecursoBiblioteca {

	private int duracionMinutos;

	 /**
     * Constructor para inicializar un DVD con su ID, título y duración.
     *
     * @param id Identificador del DVD.
     * @param titulo Título del DVD.
     * @param duracionMinutos Duración en minutos.
     */
	
    public DVD(String id, String titulo, int duracionMinutos) {
        super(id, titulo);
        this.duracionMinutos = duracionMinutos;
    }
    
    /**
     * Genera la descripción detallada del DVD,  Con Colores para mayor visibilidad.
     *
     * @return Descripción del DVD.
     */

    @Override
    public String descripcion() {
        return  Colors.Azul  +"DVD: " + titulo +
        		" (ID: " + id +  Colors.PorDefecto + 
        		"), Duración: " + duracionMinutos + " minutos," +
        		", Estado: " + (estado.equals(EstadoRecurso.DISPONIBLE) ? Colors.Amarrillo + estado : Colors.Rojo + estado);

    }
}


	
