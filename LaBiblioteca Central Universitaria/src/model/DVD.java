package model;

import enums.EstadoRecurso;

public class DVD extends RecursoBiblioteca {

	private int duracionMinutos;

    public DVD(String id, String titulo, int duracionMinutos) {
        super(id, titulo);
        this.duracionMinutos = duracionMinutos;
    }

    @Override
    public String descripcion() {
        return  Colors.Azul  +"DVD: " + titulo +
        		" (ID: " + id +  Colors.PorDefecto + 
        		"), Duración: " + duracionMinutos + " minutos," +
        		", Estado: " + (estado.equals(EstadoRecurso.DISPONIBLE) ? Colors.Amarrillo + estado : Colors.Rojo + estado);

    }
}


	
