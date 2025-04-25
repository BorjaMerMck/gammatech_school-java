package model;

import enums.EstadoRecurso;

public abstract class RecursoBiblioteca {
    protected String id;
    protected String titulo;
    protected EstadoRecurso estado;

    public RecursoBiblioteca(String id, String titulo) {
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

    public void setEstado(EstadoRecurso estado) {
        this.estado = estado;
    }

    /**
     * Método abstracto que debe implementar cada subclase (Libro, Revista, DVD)
     */
    public abstract String descripcion();
}