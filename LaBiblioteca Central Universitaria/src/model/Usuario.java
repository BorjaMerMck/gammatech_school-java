package model;

/**
 * Clase que representa un usuario de la biblioteca.
 * Permite realizar préstamos y devoluciones.
 * 
 * @author Borja Merchan Mckenna 
 * @version 1.0
 * @since 1.0
 */

public class Usuario {
    private String id;
    private String nombre;

    /**
     * Constructor para inicializar un usuario con su ID y nombre.
     *
     * @param id Identificador único del usuario.
     * @param nombre Nombre del usuario.
     */
    
    public Usuario(String id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }
    
    /**
     * Obtiene el ID del usuario.
     *
     * @return ID del usuario.
     */

    public String getId() { 
    	return id;
    }

    /**
     * Obtiene el nombre del usuario.
     *
     * @return Nombre del usuario.
     */
    public String getNombre() { 
    	return nombre; 
    }
}