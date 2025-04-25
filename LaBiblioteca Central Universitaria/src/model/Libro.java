package model;


public class Libro extends RecursoBiblioteca {
	private static final String Azul = "\u001B[34m";
    private static final String PorDefecto = "\u001B[0m";

	private String autor;
	
	public Libro(String id, String titulo, String autor) {
		super(id, titulo);
		this.autor = autor;
	}

    @Override
    public String descripcion() {
        return Azul + "Libro: " + titulo  +   " (ID: " + id + PorDefecto + "), Autor: " + autor + ", Estado: " + estado;
    }
}