package model;
/**
 * Clase abstracta que representa un recurso genérico en la biblioteca.
 * Define los atributos comunes de todos los recursos.
 * 
 * @author Borja Merchan Mckenna
 * @version 1.0
 * @since 1.0
 */
import enums.EstadoRecurso;

public abstract class RecursoBiblioteca {
    protected String id;
    protected String titulo;
    protected EstadoRecurso estado;
    /**
     * Constructor para inicializar un recurso con su ID y título.
     *
     * @param id Identificador único del recurso.
     * @param titulo Título del recurso.
     */
    public RecursoBiblioteca(String id, String titulo) {
        this.id = id;
        this.titulo = titulo;
        this.estado = EstadoRecurso.DISPONIBLE;
    }

    
    /**
     * Obtiene el ID del recurso.
     *
     * @return ID del recurso.
     */
    public String getId() {
        return id;
    }

    /**
     * Obtiene el título del recurso.
     *
     * @return Título del recurso.
     */
    public String getTitulo() {
        return titulo;
    }
    
    /**
     * Obtiene el estado actual del recurso.
     *
     * @return Estado del recurso.
     */

    public EstadoRecurso getEstado() {
        return estado;
    }

    /**
     * Establece un nuevo estado para el recurso.
     *
     * @param estado Nuevo estado a asignar.
     */
    
    public void setEstado(EstadoRecurso estado) {
        this.estado = estado;
    }


    /**
     * Método abstracto para obtener una descripción detallada del recurso.
     *
     * @return Descripción textual del recurso.
     */
    public abstract String descripcion();
}