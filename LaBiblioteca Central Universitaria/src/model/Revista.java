package model;

public class Revista  extends RecursoBiblioteca  {

	private int duracionMinutos;

	public Revista(String id, String titulo ,int duracionMinutos) {
		super(id,titulo);
		this.duracionMinutos = duracionMinutos;
	}
	
	@Override
	public String descripcion() {
		return "Revista [duracionMinutos=" + duracionMinutos + ", getId()=" + getId() + ", getTitulo()=" + getTitulo()
				+ ", getEstado()=" + getEstado() + ", descripcion()=" + descripcion() + "]";
	}

	
	
	
	
}
