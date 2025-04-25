package model;


public class Libro extends RecursoBiblioteca {
	private String autor;
	
	public Libro(String id, String titulo, String autor) {
		super(id, titulo);
		this.autor = autor;
	}

	@Override
	public String descripcion() {
		return "Libro [autor=" + autor + ", getId()=" + getId() + ", getTitulo()=" + getTitulo() + ", getEstado()="
				+ getEstado() + "]";
	}
}
