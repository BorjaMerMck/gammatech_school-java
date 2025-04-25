package model;

public class Revista  extends RecursoBiblioteca  {
	private static final String Azul = "\u001B[34m";
    private static final String PorDefecto = "\u001B[0m";

	private int numeroEdicion;

	public Revista(String id, String titulo ,int duracionMinutos) {
		super(id,titulo);
		this.numeroEdicion = numeroEdicion;
	}
	
    @Override
    public String descripcion() {
        return Azul +"Revista: " +  titulo + " (ID: " + id + PorDefecto + " ), Edición: " + numeroEdicion + ", Estado: " + estado;
    }

	
	
}
