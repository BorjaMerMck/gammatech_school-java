package model;

public class DVD extends RecursoBiblioteca {
	private static final String Azul = "\u001B[34m";
    private static final String PorDefecto = "\u001B[0m";

	private int duracionMinutos;

    public DVD(String id, String titulo, int duracionMinutos) {
        super(id, titulo);
        this.duracionMinutos = duracionMinutos;
    }

    @Override
    public String descripcion() {
        return  Azul + "DVD: " + titulo +" (ID: " + id +  PorDefecto + "), Duración: " + duracionMinutos + " minutos, Estado: " + estado;
    }
}


	
