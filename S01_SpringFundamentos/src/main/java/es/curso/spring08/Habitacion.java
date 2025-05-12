package es.curso.spring08;

public class Habitacion {
    private int numeroHabitacion;
    private String tipoHabitacion;
    private double metrosCuadrados;

    public int getNumeroHabitacion() { 
    	return numeroHabitacion; 
    }
    public void setNumeroHabitacion(int numeroHabitacion) { 
    	this.numeroHabitacion = numeroHabitacion; 
    }

    public String getTipoHabitacion() { 
    	return tipoHabitacion; 
    }
    public void setTipoHabitacion(String tipoHabitacion) { 
    	this.tipoHabitacion = tipoHabitacion; 
    }

    public double getMetrosCuadrados() { 
    	return metrosCuadrados; 
    }
    public void setMetrosCuadrados(double metrosCuadrados) { 
    	this.metrosCuadrados = metrosCuadrados; 
    }
}
