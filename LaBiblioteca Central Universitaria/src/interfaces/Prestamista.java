package interfaces;

import model.RecursoBiblioteca;
import model.Usuario;

/**
 * Interfaz que define las operaciones de préstamo y devolución de recursos.
 * 
 * @author Borja merchan Mckenna
 * @version 1.0
 * @since 1.0
 */
public interface Prestamista {
	   /**
     * Presta un recurso a un usuario.
     *
     * @param recurso Recurso a prestar.
     * @param usuario Usuario que solicita el préstamo.
     * @return true si el préstamo es exitoso, false si no.
     */
    boolean prestar(RecursoBiblioteca recurso, Usuario usuario);

    /**
     * Devuelve un recurso prestado.
     *
     * @param recurso Recurso a devolver.
     * @return true si la devolución es exitosa, false si no.
     */
    boolean devolver(RecursoBiblioteca recurso);
}