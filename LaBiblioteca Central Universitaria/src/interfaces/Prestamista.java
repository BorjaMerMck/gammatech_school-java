package interfaces;

import model.RecursoBiblioteca;
import model.Usuario;

/**
 * 
 * @version 0,1;
 * @author Borja Merchan Mckenna 
 */

public interface Prestamista {
    /**
     * Intenta prestar un recurso a un usuario.
     * @param recurso El recurso a prestar.
     * @param usuario El usuario que solicita el préstamo.
     * @return true si el préstamo se realizó con éxito, false en caso contrario.
     */
    boolean prestar(RecursoBiblioteca recurso, Usuario usuario);

    /**
     * Intenta devolver un recurso prestado.
     * @param recurso El recurso a devolver.
     * @return true si la devolución fue exitosa, false en caso contrario.
     */
    boolean devolver(RecursoBiblioteca recurso);
}