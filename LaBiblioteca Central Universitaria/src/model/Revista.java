package model;
import enums.EstadoRecurso;
import model.Colors;
public class Revista  extends RecursoBiblioteca  {
	
	private int numeroEdicion;

	public Revista(String id, String titulo ,int duracionMinutos) {
		super(id,titulo);
		this.numeroEdicion = numeroEdicion;
	}
	
    @Override
    public String descripcion() {
        return Colors.Azul +"Revista: " +  titulo + 
        		" (ID: " + id + Colors.PorDefecto +
        		" ), Edición: " + numeroEdicion +
        		", Estado: " + (estado.equals(EstadoRecurso.DISPONIBLE) ? Colors.Amarrillo + estado : Colors.Rojo + estado);

    }

	
	
}
